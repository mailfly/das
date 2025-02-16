/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-10-18")
public class EntityList implements org.apache.thrift.TBase<EntityList, EntityList._Fields>, java.io.Serializable, Cloneable, Comparable<EntityList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntityList");

  private static final org.apache.thrift.protocol.TField DATABASE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("databaseName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("names", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ENTITY_META_FIELD_DESC = new org.apache.thrift.protocol.TField("entityMeta", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("rows", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EntityListStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EntityListTupleSchemeFactory();

  public String databaseName; // required
  public String tableName; // required
  public java.util.List<String> names; // required
  public EntityMeta entityMeta; // required
  public java.util.List<Entity> rows; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATABASE_NAME((short)1, "databaseName"),
    TABLE_NAME((short)2, "tableName"),
    NAMES((short)3, "names"),
    ENTITY_META((short)4, "entityMeta"),
    ROWS((short)5, "rows");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DATABASE_NAME
          return DATABASE_NAME;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // NAMES
          return NAMES;
        case 4: // ENTITY_META
          return ENTITY_META;
        case 5: // ROWS
          return ROWS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ROWS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATABASE_NAME, new org.apache.thrift.meta_data.FieldMetaData("databaseName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAMES, new org.apache.thrift.meta_data.FieldMetaData("names", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ENTITY_META, new org.apache.thrift.meta_data.FieldMetaData("entityMeta", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "EntityMeta")));
    tmpMap.put(_Fields.ROWS, new org.apache.thrift.meta_data.FieldMetaData("rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Entity"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntityList.class, metaDataMap);
  }

  public EntityList() {
  }

  public EntityList(
    String databaseName,
    String tableName,
    java.util.List<String> names,
    EntityMeta entityMeta)
  {
    this();
    this.databaseName = databaseName;
    this.tableName = tableName;
    this.names = names;
    this.entityMeta = entityMeta;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntityList(EntityList other) {
    if (other.isSetDatabaseName()) {
      this.databaseName = other.databaseName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetNames()) {
      java.util.List<String> __this__names = new java.util.ArrayList<String>(other.names);
      this.names = __this__names;
    }
    if (other.isSetEntityMeta()) {
      this.entityMeta = new EntityMeta(other.entityMeta);
    }
    if (other.isSetRows()) {
      java.util.List<Entity> __this__rows = new java.util.ArrayList<Entity>(other.rows.size());
      for (Entity other_element : other.rows) {
        __this__rows.add(new Entity(other_element));
      }
      this.rows = __this__rows;
    }
  }

  public EntityList deepCopy() {
    return new EntityList(this);
  }

  @Override
  public void clear() {
    this.databaseName = null;
    this.tableName = null;
    this.names = null;
    this.entityMeta = null;
    this.rows = null;
  }

  public String getDatabaseName() {
    return this.databaseName;
  }

  public EntityList setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  public void unsetDatabaseName() {
    this.databaseName = null;
  }

  /** Returns true if field databaseName is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabaseName() {
    return this.databaseName != null;
  }

  public void setDatabaseNameIsSet(boolean value) {
    if (!value) {
      this.databaseName = null;
    }
  }

  public String getTableName() {
    return this.tableName;
  }

  public EntityList setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getNamesSize() {
    return (this.names == null) ? 0 : this.names.size();
  }

  public java.util.Iterator<String> getNamesIterator() {
    return (this.names == null) ? null : this.names.iterator();
  }

  public void addToNames(String elem) {
    if (this.names == null) {
      this.names = new java.util.ArrayList<String>();
    }
    this.names.add(elem);
  }

  public java.util.List<String> getNames() {
    return this.names;
  }

  public EntityList setNames(java.util.List<String> names) {
    this.names = names;
    return this;
  }

  public void unsetNames() {
    this.names = null;
  }

  /** Returns true if field names is set (has been assigned a value) and false otherwise */
  public boolean isSetNames() {
    return this.names != null;
  }

  public void setNamesIsSet(boolean value) {
    if (!value) {
      this.names = null;
    }
  }

  public EntityMeta getEntityMeta() {
    return this.entityMeta;
  }

  public EntityList setEntityMeta(EntityMeta entityMeta) {
    this.entityMeta = entityMeta;
    return this;
  }

  public void unsetEntityMeta() {
    this.entityMeta = null;
  }

  /** Returns true if field entityMeta is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityMeta() {
    return this.entityMeta != null;
  }

  public void setEntityMetaIsSet(boolean value) {
    if (!value) {
      this.entityMeta = null;
    }
  }

  public int getRowsSize() {
    return (this.rows == null) ? 0 : this.rows.size();
  }

  public java.util.Iterator<Entity> getRowsIterator() {
    return (this.rows == null) ? null : this.rows.iterator();
  }

  public void addToRows(Entity elem) {
    if (this.rows == null) {
      this.rows = new java.util.ArrayList<Entity>();
    }
    this.rows.add(elem);
  }

  public java.util.List<Entity> getRows() {
    return this.rows;
  }

  public EntityList setRows(java.util.List<Entity> rows) {
    this.rows = rows;
    return this;
  }

  public void unsetRows() {
    this.rows = null;
  }

  /** Returns true if field rows is set (has been assigned a value) and false otherwise */
  public boolean isSetRows() {
    return this.rows != null;
  }

  public void setRowsIsSet(boolean value) {
    if (!value) {
      this.rows = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATABASE_NAME:
      if (value == null) {
        unsetDatabaseName();
      } else {
        setDatabaseName((String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case NAMES:
      if (value == null) {
        unsetNames();
      } else {
        setNames((java.util.List<String>)value);
      }
      break;

    case ENTITY_META:
      if (value == null) {
        unsetEntityMeta();
      } else {
        setEntityMeta((EntityMeta)value);
      }
      break;

    case ROWS:
      if (value == null) {
        unsetRows();
      } else {
        setRows((java.util.List<Entity>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATABASE_NAME:
      return getDatabaseName();

    case TABLE_NAME:
      return getTableName();

    case NAMES:
      return getNames();

    case ENTITY_META:
      return getEntityMeta();

    case ROWS:
      return getRows();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATABASE_NAME:
      return isSetDatabaseName();
    case TABLE_NAME:
      return isSetTableName();
    case NAMES:
      return isSetNames();
    case ENTITY_META:
      return isSetEntityMeta();
    case ROWS:
      return isSetRows();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntityList)
      return this.equals((EntityList)that);
    return false;
  }

  public boolean equals(EntityList that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_databaseName = true && this.isSetDatabaseName();
    boolean that_present_databaseName = true && that.isSetDatabaseName();
    if (this_present_databaseName || that_present_databaseName) {
      if (!(this_present_databaseName && that_present_databaseName))
        return false;
      if (!this.databaseName.equals(that.databaseName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_names = true && this.isSetNames();
    boolean that_present_names = true && that.isSetNames();
    if (this_present_names || that_present_names) {
      if (!(this_present_names && that_present_names))
        return false;
      if (!this.names.equals(that.names))
        return false;
    }

    boolean this_present_entityMeta = true && this.isSetEntityMeta();
    boolean that_present_entityMeta = true && that.isSetEntityMeta();
    if (this_present_entityMeta || that_present_entityMeta) {
      if (!(this_present_entityMeta && that_present_entityMeta))
        return false;
      if (!this.entityMeta.equals(that.entityMeta))
        return false;
    }

    boolean this_present_rows = true && this.isSetRows();
    boolean that_present_rows = true && that.isSetRows();
    if (this_present_rows || that_present_rows) {
      if (!(this_present_rows && that_present_rows))
        return false;
      if (!this.rows.equals(that.rows))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDatabaseName()) ? 131071 : 524287);
    if (isSetDatabaseName())
      hashCode = hashCode * 8191 + databaseName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetNames()) ? 131071 : 524287);
    if (isSetNames())
      hashCode = hashCode * 8191 + names.hashCode();

    hashCode = hashCode * 8191 + ((isSetEntityMeta()) ? 131071 : 524287);
    if (isSetEntityMeta())
      hashCode = hashCode * 8191 + entityMeta.hashCode();

    hashCode = hashCode * 8191 + ((isSetRows()) ? 131071 : 524287);
    if (isSetRows())
      hashCode = hashCode * 8191 + rows.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(EntityList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDatabaseName()).compareTo(other.isSetDatabaseName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabaseName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.databaseName, other.databaseName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNames()).compareTo(other.isSetNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.names, other.names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityMeta()).compareTo(other.isSetEntityMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityMeta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityMeta, other.entityMeta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRows()).compareTo(other.isSetRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rows, other.rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EntityList(");
    boolean first = true;

    sb.append("databaseName:");
    if (this.databaseName == null) {
      sb.append("null");
    } else {
      sb.append(this.databaseName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("names:");
    if (this.names == null) {
      sb.append("null");
    } else {
      sb.append(this.names);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entityMeta:");
    if (this.entityMeta == null) {
      sb.append("null");
    } else {
      sb.append(this.entityMeta);
    }
    first = false;
    if (isSetRows()) {
      if (!first) sb.append(", ");
      sb.append("rows:");
      if (this.rows == null) {
        sb.append("null");
      } else {
        sb.append(this.rows);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntityListStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EntityListStandardScheme getScheme() {
      return new EntityListStandardScheme();
    }
  }

  private static class EntityListStandardScheme extends org.apache.thrift.scheme.StandardScheme<EntityList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntityList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATABASE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.databaseName = iprot.readString();
              struct.setDatabaseNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.names = new java.util.ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.names.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENTITY_META
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.entityMeta = new EntityMeta();
              struct.entityMeta.read(iprot);
              struct.setEntityMetaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.rows = new java.util.ArrayList<Entity>(_list3.size);
                Entity _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new Entity();
                  _elem4.read(iprot);
                  struct.rows.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntityList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.databaseName != null) {
        oprot.writeFieldBegin(DATABASE_NAME_FIELD_DESC);
        oprot.writeString(struct.databaseName);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.names != null) {
        oprot.writeFieldBegin(NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.names.size()));
          for (String _iter6 : struct.names)
          {
            oprot.writeString(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.entityMeta != null) {
        oprot.writeFieldBegin(ENTITY_META_FIELD_DESC);
        struct.entityMeta.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.rows != null) {
        if (struct.isSetRows()) {
          oprot.writeFieldBegin(ROWS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rows.size()));
            for (Entity _iter7 : struct.rows)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntityListTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EntityListTupleScheme getScheme() {
      return new EntityListTupleScheme();
    }
  }

  private static class EntityListTupleScheme extends org.apache.thrift.scheme.TupleScheme<EntityList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntityList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDatabaseName()) {
        optionals.set(0);
      }
      if (struct.isSetTableName()) {
        optionals.set(1);
      }
      if (struct.isSetNames()) {
        optionals.set(2);
      }
      if (struct.isSetEntityMeta()) {
        optionals.set(3);
      }
      if (struct.isSetRows()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetDatabaseName()) {
        oprot.writeString(struct.databaseName);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetNames()) {
        {
          oprot.writeI32(struct.names.size());
          for (String _iter8 : struct.names)
          {
            oprot.writeString(_iter8);
          }
        }
      }
      if (struct.isSetEntityMeta()) {
        struct.entityMeta.write(oprot);
      }
      if (struct.isSetRows()) {
        {
          oprot.writeI32(struct.rows.size());
          for (Entity _iter9 : struct.rows)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntityList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.databaseName = iprot.readString();
        struct.setDatabaseNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.names = new java.util.ArrayList<String>(_list10.size);
          String _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readString();
            struct.names.add(_elem11);
          }
        }
        struct.setNamesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.entityMeta = new EntityMeta();
        struct.entityMeta.read(iprot);
        struct.setEntityMetaIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.rows = new java.util.ArrayList<Entity>(_list13.size);
          Entity _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new Entity();
            _elem14.read(iprot);
            struct.rows.add(_elem14);
          }
        }
        struct.setRowsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

