package com.ppdai.platform.das.console.common.codeGen.utils;


import com.ppdai.platform.das.console.common.codeGen.enums.DatabaseType;
import com.ppdai.platform.das.console.common.utils.DasEnv;
import com.ppdai.platform.das.console.dao.DataBaseDao;
import com.ppdai.platform.das.console.dto.entry.das.DataBaseInfo;
import com.ppdai.platform.das.console.enums.DataBaseEnum;
import org.apache.tomcat.jdbc.pool.PoolProperties;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataSourceUtil {
    private static final String DBURL_MYSQL_CACHE1 = "jdbc:mysql://%s:%s/?useUnicode=true&characterEncoding=utf8";
    private static final String DBURL_SQLSERVER_CACHE1 = "jdbc:sqlserver://%s:%s;sendTimeAsDateTime=false";

    private static final String DBURL_MYSQL_CACHE2 = "jdbc:mysql://%s:%s/%s?useUnicode=true&characterEncoding=utf8";
    private static final String DBURL_SQLSERVER_CACHE2 =
            "jdbc:sqlserver://%s:%s;DatabaseName=%s;sendTimeAsDateTime=false";

    private static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    private static final String DRIVER_SQLSERVRE = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    private static final String DBURL_MYSQL_CACHE = "jdbc:mysql://%s:%s/%s";
    private static final String DBURL_SQLSERVER_CACHE = "jdbc:sqlserver://%s:%s;DatabaseName=%s";

    // dbAddress+port+User+password,DataSource
    private static volatile Map<String, DataSource> cache1 = new ConcurrentHashMap<>();

    // dbAddress+catalog+port+User+password,DataSource
    private static volatile Map<String, DataSource> cache2 = new ConcurrentHashMap<>();

    public static Connection getConnection(String address, String port, String userName, String password,
                                           String driverClass) throws Exception {
        validateParam(address, port, userName, password, driverClass);
        String key = address.trim() + port.trim() + userName.trim() + password.trim();
        DataSource ds = cache1.get(key);
        if (ds != null) {
            Connection conn = ds.getConnection();
            return conn;
        }
        synchronized (DataSourceUtil.class) {
            ds = cache1.get(key);
            if (ds != null) {
                Connection conn = ds.getConnection();
                return conn;
            } else {
                DataSource newDS = createDataSource(address.trim(), port.trim(), userName.trim(), password.trim(),
                        driverClass.trim());
                cache1.put(key, newDS);
                Connection conn = newDS.getConnection();
                return conn;
            }
        }
    }

    public static Connection getConnection(Long alldbs_id) throws Exception {
        return getDataSource(alldbs_id).getConnection();
    }

    public static DataSource getDataSource(Long alldbs_id) throws Exception {
        if (null == alldbs_id) {
            throw new SQLException("the param alldbs_id is null. So can not get DataSourse.");
        }

        DataBaseDao allDbDao = BeanGetter.getDaoOfDalGroupDB();
        DataBaseInfo db = allDbDao.getDataBaseInfoByDbId(alldbs_id);
        if (db == null) {
            throw new SQLException(alldbs_id + " is not exist in the table of alldbs.");
        }

        String address = db.getDb_address();
        String port = db.getDb_port();
        String userName = db.getDb_user();
        String password = DasEnv.encdecConfiguration.decrypt(db.getDb_password());
        String driverClass = DataBaseEnum.getDataBaseEnumByType(db.getDb_type()).getDriver();   //FIXMEED: db.getDb_providerName();
        String catalog = db.getDb_catalog();
        validateParam(db.getId(), address, port, catalog, userName, password, driverClass);
        String key = address.trim() + catalog.trim() + port.trim() + userName.trim() + password.trim();
        DataSource ds = cache2.get(key);
        if (ds != null) {
            return ds;
        }

        synchronized (DataSourceUtil.class) {
            ds = cache2.get(key);
            if (ds != null) {
                return ds;
            } else {
                DataSource newDS = createDataSource(address.trim(), port.trim(), catalog.trim(), userName.trim(),
                        password.trim(), driverClass.trim());
                cache2.put(key, newDS);
                return newDS;
            }
        }
    }

    private static DataSource createDataSource(String address, String port, String userName, String password,
                                               String driverClass) throws Exception {
        String url = "";
        String driver = getDriverClass(driverClass);
        if (DRIVER_MYSQL.equals(driver)) {
            url = String.format(DBURL_MYSQL_CACHE1, address, port);
        } else {
            url = String.format(DBURL_SQLSERVER_CACHE1, address, port);
        }
        return createDataSource(url, userName, password, driver);
    }

    private static DataSource createDataSource(String address, String port, String catalog, String userName,
                                               String password, String driverClass) throws Exception {
        String url;
        if (DRIVER_MYSQL.equals(driverClass)) {
            url = String.format(DBURL_MYSQL_CACHE2, address, port, catalog);
        } else {
            url = String.format(DBURL_SQLSERVER_CACHE2, address, port, catalog);
        }
        return createDataSource(url, userName, password, driverClass);
    }

    public static String getConnectionUrl(String address, String port, String catalog, String driverClass)
            throws Exception {
        String url = "";
        String driver = getDriverClass(driverClass);
        if (DRIVER_MYSQL.equals(driver)) {
            url = String.format(DBURL_MYSQL_CACHE, address, port, catalog);
        } else {
            url = String.format(DBURL_SQLSERVER_CACHE, address, port, catalog);
        }
        return url;
    }

    public static String getDriverClass(String driverClass) throws Exception {
        if (DatabaseType.MySQL.getValue().equals(driverClass)) {
            return DRIVER_MYSQL;
        } else if (DatabaseType.SQLServer.getValue().equals(driverClass)) {
            return DRIVER_SQLSERVRE;
        } else {
            throw new SQLException("database type is illegal, it can be MySQL or SQLServer.");
        }
    }

    private static DataSource createDataSource(String url, String userName, String password, String driverClass)
            throws Exception {
        PoolProperties p = new PoolProperties();

        p.setUrl(url);
        p.setUsername(userName);
        p.setPassword(password);
        p.setDriverClassName(driverClass);
        p.setJmxEnabled(false);
        p.setTestWhileIdle(false);
        p.setTestOnBorrow(true);
        p.setTestOnReturn(false);
        p.setValidationQuery("SELECT 1");
        p.setValidationQueryTimeout(5);
        p.setValidationInterval(30000L);
        p.setTimeBetweenEvictionRunsMillis(5000);
        p.setMaxActive(100);
        p.setMinIdle(0);
        p.setMaxWait(10000);
        p.setMaxAge(0L);
        p.setInitialSize(1);
        p.setRemoveAbandonedTimeout(60);
        p.setRemoveAbandoned(true);
        p.setLogAbandoned(true);
        p.setMinEvictableIdleTimeMillis(30000);
        p.setJdbcInterceptors("org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"
                + "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");

        org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource(p);
        ds.createPool();
        return ds;
    }

    private static void validateParam(String address, String port, String userName, String password, String driverClass)
            throws Exception {
        if (isEmpty(address)) {
            throw new SQLException("The address is null.");
        }
        if (isEmpty(port)) {
            throw new SQLException("The port is null.");
        }
        if (isEmpty(userName)) {
            throw new SQLException("The userName is null.");
        }
        if (isEmpty(password)) {
            throw new SQLException("The password is null.");
        }
        if (isEmpty(driverClass)) {
            throw new SQLException("The driverClass is null.");
        }
    }

    private static void validateParam(Long alldbs_id, String address, String port, String catalog, String userName,
                                      String password, String driverClass) throws Exception {
        if (isEmpty(address)) {
            throw new SQLException("the address of alldbs_id " + alldbs_id + " is null.");
        }
        if (isEmpty(port)) {
            throw new SQLException("the port of alldbs_id " + alldbs_id + " is null.");
        }
        if (isEmpty(userName)) {
            throw new SQLException("the userName of alldbs_id " + alldbs_id + " is null.");
        }
        if (isEmpty(password)) {
            throw new SQLException("the password of alldbs_id " + alldbs_id + " is null.");
        }
        if (isEmpty(catalog)) {
            throw new SQLException("the catalog of alldbs_id " + alldbs_id + " is null.");
        }
        if (isEmpty(driverClass)) {
            throw new SQLException("the driverClass of alldbs_id " + alldbs_id + " is null.");
        }
    }

    private static boolean isEmpty(String str) {
        if (str != null && (!"".equals(str.trim()))) {
            return false;
        }
        return true;
    }

}
