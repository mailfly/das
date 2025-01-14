/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-10-18")
public class DasHints implements org.apache.thrift.TBase<DasHints, DasHints._Fields>, java.io.Serializable, Cloneable, Comparable<DasHints> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasHints");

  private static final org.apache.thrift.protocol.TField HINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("hints", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasHintsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasHintsTupleSchemeFactory();

  public java.util.Map<DasHintEnum,String> hints; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HINTS((short)1, "hints");

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
        case 1: // HINTS
          return HINTS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HINTS, new org.apache.thrift.meta_data.FieldMetaData("hints", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DasHintEnum.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasHints.class, metaDataMap);
  }

  public DasHints() {
  }

  public DasHints(
    java.util.Map<DasHintEnum,String> hints)
  {
    this();
    this.hints = hints;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasHints(DasHints other) {
    if (other.isSetHints()) {
      java.util.Map<DasHintEnum,String> __this__hints = new java.util.EnumMap<DasHintEnum,String>(DasHintEnum.class);
      for (java.util.Map.Entry<DasHintEnum, String> other_element : other.hints.entrySet()) {

        DasHintEnum other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        DasHintEnum __this__hints_copy_key = other_element_key;

        String __this__hints_copy_value = other_element_value;

        __this__hints.put(__this__hints_copy_key, __this__hints_copy_value);
      }
      this.hints = __this__hints;
    }
  }

  public DasHints deepCopy() {
    return new DasHints(this);
  }

  @Override
  public void clear() {
    this.hints = null;
  }

  public int getHintsSize() {
    return (this.hints == null) ? 0 : this.hints.size();
  }

  public void putToHints(DasHintEnum key, String val) {
    if (this.hints == null) {
      this.hints = new java.util.EnumMap<DasHintEnum,String>(DasHintEnum.class);
    }
    this.hints.put(key, val);
  }

  public java.util.Map<DasHintEnum,String> getHints() {
    return this.hints;
  }

  public DasHints setHints(java.util.Map<DasHintEnum,String> hints) {
    this.hints = hints;
    return this;
  }

  public void unsetHints() {
    this.hints = null;
  }

  /** Returns true if field hints is set (has been assigned a value) and false otherwise */
  public boolean isSetHints() {
    return this.hints != null;
  }

  public void setHintsIsSet(boolean value) {
    if (!value) {
      this.hints = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HINTS:
      if (value == null) {
        unsetHints();
      } else {
        setHints((java.util.Map<DasHintEnum,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HINTS:
      return getHints();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HINTS:
      return isSetHints();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DasHints)
      return this.equals((DasHints)that);
    return false;
  }

  public boolean equals(DasHints that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hints = true && this.isSetHints();
    boolean that_present_hints = true && that.isSetHints();
    if (this_present_hints || that_present_hints) {
      if (!(this_present_hints && that_present_hints))
        return false;
      if (!this.hints.equals(that.hints))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHints()) ? 131071 : 524287);
    if (isSetHints())
      hashCode = hashCode * 8191 + hints.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DasHints other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHints()).compareTo(other.isSetHints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHints()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hints, other.hints);
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
    StringBuilder sb = new StringBuilder("DasHints(");
    boolean first = true;

    sb.append("hints:");
    if (this.hints == null) {
      sb.append("null");
    } else {
      sb.append(this.hints);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (hints == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hints' was not present! Struct: " + toString());
    }
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

  private static class DasHintsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasHintsStandardScheme getScheme() {
      return new DasHintsStandardScheme();
    }
  }

  private static class DasHintsStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasHints> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasHints struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HINTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map76 = iprot.readMapBegin();
                struct.hints = new java.util.EnumMap<DasHintEnum,String>(DasHintEnum.class);
                DasHintEnum _key77;
                String _val78;
                for (int _i79 = 0; _i79 < _map76.size; ++_i79)
                {
                  _key77 = DasHintEnum.findByValue(iprot.readI32());
                  _val78 = iprot.readString();
                  if (_key77 != null)
                  {
                    struct.hints.put(_key77, _val78);
                  }
                }
                iprot.readMapEnd();
              }
              struct.setHintsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasHints struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hints != null) {
        oprot.writeFieldBegin(HINTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.hints.size()));
          for (java.util.Map.Entry<DasHintEnum, String> _iter80 : struct.hints.entrySet())
          {
            oprot.writeI32(_iter80.getKey().getValue());
            oprot.writeString(_iter80.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DasHintsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasHintsTupleScheme getScheme() {
      return new DasHintsTupleScheme();
    }
  }

  private static class DasHintsTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasHints> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasHints struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.hints.size());
        for (java.util.Map.Entry<DasHintEnum, String> _iter81 : struct.hints.entrySet())
        {
          oprot.writeI32(_iter81.getKey().getValue());
          oprot.writeString(_iter81.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasHints struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map82 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.hints = new java.util.EnumMap<DasHintEnum,String>(DasHintEnum.class);
        DasHintEnum _key83;
        String _val84;
        for (int _i85 = 0; _i85 < _map82.size; ++_i85)
        {
          _key83 = DasHintEnum.findByValue(iprot.readI32());
          _val84 = iprot.readString();
          if (_key83 != null)
          {
            struct.hints.put(_key83, _val84);
          }
        }
      }
      struct.setHintsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

