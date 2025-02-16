package com.ppdai.platform.das.console.common.codeGen;

import microsoft.sql.Types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CodeGenConsts {

    public static final String JAVA = "java";
    /**
     * Key：数字 Value：对应的数据库表达式，如等于表达式为'='
     */
    public static Map<String, String> WhereConditionMap;

    /**
     * 系统数据库，如master, tempdb等
     */
    public static List<String> SystemDatabases;

    public static Map<Long, String> databaseType;

    public static Map<Integer, Class<?>> jdbcSqlTypeToJavaClass;
    public static Map<Integer, String> jdbcSqlTypeDisplay;

    public static List<String> CSharpValueTypes;

    static {
        CSharpValueTypes = new ArrayList<>();
        WhereConditionMap = new HashMap<>();
        jdbcSqlTypeToJavaClass = new HashMap<>();
        SystemDatabases = new ArrayList<>();
        databaseType = new ConcurrentHashMap<>();

        CSharpValueTypes.add("sbyte");
        CSharpValueTypes.add("byte");
        CSharpValueTypes.add("char");
        CSharpValueTypes.add("short");
        CSharpValueTypes.add("ushort");
        CSharpValueTypes.add("int");
        CSharpValueTypes.add("uint");
        CSharpValueTypes.add("long");
        CSharpValueTypes.add("ulong");
        CSharpValueTypes.add("float");
        CSharpValueTypes.add("double");
        CSharpValueTypes.add("DateTime");
        CSharpValueTypes.add("TimeSpan");
        CSharpValueTypes.add("decimal");
        CSharpValueTypes.add("bool");
        CSharpValueTypes.add("Guid");
        CSharpValueTypes.add("DateTimeOffset");

        WhereConditionMap.put("0", "=");
        WhereConditionMap.put("1", "!=");
        WhereConditionMap.put("2", ">");
        WhereConditionMap.put("3", "<");
        WhereConditionMap.put("4", ">=");
        WhereConditionMap.put("5", "<=");
        WhereConditionMap.put("6", "Between");
        WhereConditionMap.put("7", "Like");
        WhereConditionMap.put("8", "In");

        SystemDatabases.add("master");
        SystemDatabases.add("model");
        SystemDatabases.add("msdb");
        SystemDatabases.add("Resource");
        SystemDatabases.add("tempdb");
        SystemDatabases.add("distribution");

        SystemDatabases.add("information_schema");
        SystemDatabases.add("performance_schema");
        SystemDatabases.add("mysql");

        jdbcSqlTypeToJavaClass.put(java.sql.Types.BIT, Boolean.class);

        // Recommended using Short for Byte
        jdbcSqlTypeToJavaClass.put(java.sql.Types.TINYINT, Integer.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.SMALLINT, Short.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.INTEGER, Integer.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.BIGINT, Long.class);

        jdbcSqlTypeToJavaClass.put(java.sql.Types.FLOAT, Double.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.REAL, Float.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.DOUBLE, Double.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.NUMERIC, BigDecimal.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.DECIMAL, BigDecimal.class);

        jdbcSqlTypeToJavaClass.put(java.sql.Types.CHAR, String.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.VARCHAR, String.class);

        jdbcSqlTypeToJavaClass.put(java.sql.Types.NVARCHAR, String.class);
        // getAsciiStream getUnicodeStream
        jdbcSqlTypeToJavaClass.put(java.sql.Types.LONGVARCHAR, String.class);

        jdbcSqlTypeToJavaClass.put(java.sql.Types.DATE, java.sql.Date.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.TIME, java.sql.Time.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.TIMESTAMP, java.sql.Timestamp.class);

        jdbcSqlTypeToJavaClass.put(java.sql.Types.BINARY, byte[].class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.VARBINARY, byte[].class);
        // getBinaryStream
        jdbcSqlTypeToJavaClass.put(java.sql.Types.LONGVARBINARY, byte[].class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.NCHAR, String.class);
        jdbcSqlTypeToJavaClass.put(java.sql.Types.LONGNVARCHAR, String.class);
        jdbcSqlTypeToJavaClass.put(Types.DATETIMEOFFSET, microsoft.sql.DateTimeOffset.class);

        // uniqueidentifier
        jdbcSqlTypeToJavaClass.put(10001, String.class);

        jdbcSqlTypeDisplay = new HashMap<>();
        jdbcSqlTypeDisplay.put(java.sql.Types.BIT, "CheckTypes.BIT");

        // Recommended using Short for Byte
        jdbcSqlTypeDisplay.put(java.sql.Types.TINYINT, "CheckTypes.TINYINT");
        jdbcSqlTypeDisplay.put(java.sql.Types.SMALLINT, "CheckTypes.SMALLINT");
        jdbcSqlTypeDisplay.put(java.sql.Types.INTEGER, "CheckTypes.INTEGER");
        jdbcSqlTypeDisplay.put(java.sql.Types.BIGINT, "CheckTypes.BIGINT");

        jdbcSqlTypeDisplay.put(java.sql.Types.NVARCHAR, "CheckTypes.NVARCHAR");

        jdbcSqlTypeDisplay.put(java.sql.Types.FLOAT, "CheckTypes.FLOAT");
        jdbcSqlTypeDisplay.put(java.sql.Types.REAL, "CheckTypes.REAL");
        jdbcSqlTypeDisplay.put(java.sql.Types.DOUBLE, "CheckTypes.DOUBLE");
        jdbcSqlTypeDisplay.put(java.sql.Types.NUMERIC, "CheckTypes.NUMERIC");
        jdbcSqlTypeDisplay.put(java.sql.Types.DECIMAL, "CheckTypes.DECIMAL");

        jdbcSqlTypeDisplay.put(java.sql.Types.CHAR, "CheckTypes.CHAR");
        jdbcSqlTypeDisplay.put(java.sql.Types.VARCHAR, "CheckTypes.VARCHAR");
        // getAsciiStream getUnicodeStream
        jdbcSqlTypeDisplay.put(java.sql.Types.LONGVARCHAR, "CheckTypes.LONGVARCHAR");

        jdbcSqlTypeDisplay.put(java.sql.Types.DATE, "CheckTypes.DATE");
        jdbcSqlTypeDisplay.put(java.sql.Types.TIME, "CheckTypes.TIME");
        jdbcSqlTypeDisplay.put(java.sql.Types.TIMESTAMP, "CheckTypes.TIMESTAMP");

        jdbcSqlTypeDisplay.put(java.sql.Types.BINARY, "CheckTypes.BINARY");
        jdbcSqlTypeDisplay.put(java.sql.Types.VARBINARY, "CheckTypes.VARBINARY");
        // getBinaryStream
        jdbcSqlTypeDisplay.put(java.sql.Types.LONGVARBINARY, "CheckTypes.LONGVARBINARY");
        jdbcSqlTypeDisplay.put(java.sql.Types.NCHAR, "CheckTypes.NCHAR");
        jdbcSqlTypeDisplay.put(java.sql.Types.LONGNVARCHAR, "CheckTypes.LONGNVARCHAR");
        jdbcSqlTypeDisplay.put(Types.DATETIMEOFFSET, "microsoft.sql.CheckTypes.DATETIMEOFFSET");

        // uniqueidentifier
        jdbcSqlTypeDisplay.put(10001, "CheckTypes.CHAR");
    }

    public static final String USER_INFO = "userInfo";
    public static final String USER_NAME = "userName";
    public static final String DEFAULT_USER = "defaultUser";
    public static final String SUPER_USER = "superUser";
}
