/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;


public enum DasHintEnum implements org.apache.thrift.TEnum {
  dbShardValue(0),
  tableShardValue(1),
  dbShard(2),
  tableShard(3),
  dbShardBy(4),
  tableShardBy(5),
  dbShards(6),
  tableShards(7),
  inAllDbShards(8),
  inAllTableShards(9),
  designatedDatabase(10),
  isolationLevel(11),
  timeout(12),
  fetchSize(13),
  maxRows(14),
  resultSetType(15),
  resultSetConcurrency(16),
  freshness(17),
  masterOnly(18),
  slaveOnly(19),
  enableIdentityInsert(20),
  setIdentityBack(21),
  includeNullField(22),
  includedColumns(23),
  excludedColumns(24),
  diagnoseMode(25);

  private final int value;

  private DasHintEnum(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static DasHintEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return dbShardValue;
      case 1:
        return tableShardValue;
      case 2:
        return dbShard;
      case 3:
        return tableShard;
      case 4:
        return dbShardBy;
      case 5:
        return tableShardBy;
      case 6:
        return dbShards;
      case 7:
        return tableShards;
      case 8:
        return inAllDbShards;
      case 9:
        return inAllTableShards;
      case 10:
        return designatedDatabase;
      case 11:
        return isolationLevel;
      case 12:
        return timeout;
      case 13:
        return fetchSize;
      case 14:
        return maxRows;
      case 15:
        return resultSetType;
      case 16:
        return resultSetConcurrency;
      case 17:
        return freshness;
      case 18:
        return masterOnly;
      case 19:
        return slaveOnly;
      case 20:
        return enableIdentityInsert;
      case 21:
        return setIdentityBack;
      case 22:
        return includeNullField;
      case 23:
        return includedColumns;
      case 24:
        return excludedColumns;
      case 25:
        return diagnoseMode;
      default:
        return null;
    }
  }
}
