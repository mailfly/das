package com.ppdai.platform.das.console.common.codeGen.utils;

import java.sql.SQLException;

public class DatabaseSetUtils {

    public static Long getAlldbsIdByDbSetId(Long dbSet_id) throws SQLException {
        return BeanGetter.getDaoOfDatabaseSet().getMasterDatabaseSetEntryByDatabaseSetId(dbSet_id).getDb_Id();
    }
}
