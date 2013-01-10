/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.twofishes;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class InterpretationScoringFeatures implements TBase<InterpretationScoringFeatures, InterpretationScoringFeatures._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("InterpretationScoringFeatures");

  private static final TField POPULATION_FIELD_DESC = new TField("population", TType.I32, (short)1);
  private static final TField SOCIALLY_RELEVANT_FIELD_DESC = new TField("sociallyRelevant", TType.BOOL, (short)2);
  private static final TField COVERING_PERCENTAGE_FIELD_DESC = new TField("coveringPercentage", TType.DOUBLE, (short)3);

  public int population;
  public boolean sociallyRelevant;
  public double coveringPercentage;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    POPULATION((short)1, "population"),
    SOCIALLY_RELEVANT((short)2, "sociallyRelevant"),
    COVERING_PERCENTAGE((short)3, "coveringPercentage");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // POPULATION
          return POPULATION;
        case 2: // SOCIALLY_RELEVANT
          return SOCIALLY_RELEVANT;
        case 3: // COVERING_PERCENTAGE
          return COVERING_PERCENTAGE;
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
  private static final int __POPULATION_ISSET_ID = 0;
  private static final int __SOCIALLYRELEVANT_ISSET_ID = 1;
  private static final int __COVERINGPERCENTAGE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POPULATION, new FieldMetaData("population", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.SOCIALLY_RELEVANT, new FieldMetaData("sociallyRelevant", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.COVERING_PERCENTAGE, new FieldMetaData("coveringPercentage", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(InterpretationScoringFeatures.class, metaDataMap);
  }

  public InterpretationScoringFeatures() {
    this.population = 0;

    this.sociallyRelevant = false;

    this.coveringPercentage = 0;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InterpretationScoringFeatures(InterpretationScoringFeatures other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.population = other.population;
    this.sociallyRelevant = other.sociallyRelevant;
    this.coveringPercentage = other.coveringPercentage;
  }

  public InterpretationScoringFeatures deepCopy() {
    return new InterpretationScoringFeatures(this);
  }

  @Override
  public void clear() {
    this.population = 0;

    this.sociallyRelevant = false;

    this.coveringPercentage = 0;

  }

  public int getPopulation() {
    return this.population;
  }

  public InterpretationScoringFeatures setPopulation(int population) {
    this.population = population;
    setPopulationIsSet(true);
    return this;
  }

  public void unsetPopulation() {
    __isset_bit_vector.clear(__POPULATION_ISSET_ID);
  }

  /** Returns true if field population is set (has been asigned a value) and false otherwise */
  public boolean isSetPopulation() {
    return __isset_bit_vector.get(__POPULATION_ISSET_ID);
  }

  public void setPopulationIsSet(boolean value) {
    __isset_bit_vector.set(__POPULATION_ISSET_ID, value);
  }

  public boolean isSociallyRelevant() {
    return this.sociallyRelevant;
  }

  public InterpretationScoringFeatures setSociallyRelevant(boolean sociallyRelevant) {
    this.sociallyRelevant = sociallyRelevant;
    setSociallyRelevantIsSet(true);
    return this;
  }

  public void unsetSociallyRelevant() {
    __isset_bit_vector.clear(__SOCIALLYRELEVANT_ISSET_ID);
  }

  /** Returns true if field sociallyRelevant is set (has been asigned a value) and false otherwise */
  public boolean isSetSociallyRelevant() {
    return __isset_bit_vector.get(__SOCIALLYRELEVANT_ISSET_ID);
  }

  public void setSociallyRelevantIsSet(boolean value) {
    __isset_bit_vector.set(__SOCIALLYRELEVANT_ISSET_ID, value);
  }

  public double getCoveringPercentage() {
    return this.coveringPercentage;
  }

  public InterpretationScoringFeatures setCoveringPercentage(double coveringPercentage) {
    this.coveringPercentage = coveringPercentage;
    setCoveringPercentageIsSet(true);
    return this;
  }

  public void unsetCoveringPercentage() {
    __isset_bit_vector.clear(__COVERINGPERCENTAGE_ISSET_ID);
  }

  /** Returns true if field coveringPercentage is set (has been asigned a value) and false otherwise */
  public boolean isSetCoveringPercentage() {
    return __isset_bit_vector.get(__COVERINGPERCENTAGE_ISSET_ID);
  }

  public void setCoveringPercentageIsSet(boolean value) {
    __isset_bit_vector.set(__COVERINGPERCENTAGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POPULATION:
      if (value == null) {
        unsetPopulation();
      } else {
        setPopulation((Integer)value);
      }
      break;

    case SOCIALLY_RELEVANT:
      if (value == null) {
        unsetSociallyRelevant();
      } else {
        setSociallyRelevant((Boolean)value);
      }
      break;

    case COVERING_PERCENTAGE:
      if (value == null) {
        unsetCoveringPercentage();
      } else {
        setCoveringPercentage((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POPULATION:
      return new Integer(getPopulation());

    case SOCIALLY_RELEVANT:
      return new Boolean(isSociallyRelevant());

    case COVERING_PERCENTAGE:
      return new Double(getCoveringPercentage());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POPULATION:
      return isSetPopulation();
    case SOCIALLY_RELEVANT:
      return isSetSociallyRelevant();
    case COVERING_PERCENTAGE:
      return isSetCoveringPercentage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InterpretationScoringFeatures)
      return this.equals((InterpretationScoringFeatures)that);
    return false;
  }

  public boolean equals(InterpretationScoringFeatures that) {
    if (that == null)
      return false;

    boolean this_present_population = true && this.isSetPopulation();
    boolean that_present_population = true && that.isSetPopulation();
    if (this_present_population || that_present_population) {
      if (!(this_present_population && that_present_population))
        return false;
      if (this.population != that.population)
        return false;
    }

    boolean this_present_sociallyRelevant = true && this.isSetSociallyRelevant();
    boolean that_present_sociallyRelevant = true && that.isSetSociallyRelevant();
    if (this_present_sociallyRelevant || that_present_sociallyRelevant) {
      if (!(this_present_sociallyRelevant && that_present_sociallyRelevant))
        return false;
      if (this.sociallyRelevant != that.sociallyRelevant)
        return false;
    }

    boolean this_present_coveringPercentage = true && this.isSetCoveringPercentage();
    boolean that_present_coveringPercentage = true && that.isSetCoveringPercentage();
    if (this_present_coveringPercentage || that_present_coveringPercentage) {
      if (!(this_present_coveringPercentage && that_present_coveringPercentage))
        return false;
      if (this.coveringPercentage != that.coveringPercentage)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(InterpretationScoringFeatures other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InterpretationScoringFeatures typedOther = (InterpretationScoringFeatures)other;

    lastComparison = Boolean.valueOf(isSetPopulation()).compareTo(typedOther.isSetPopulation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPopulation()) {
      lastComparison = TBaseHelper.compareTo(this.population, typedOther.population);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSociallyRelevant()).compareTo(typedOther.isSetSociallyRelevant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSociallyRelevant()) {
      lastComparison = TBaseHelper.compareTo(this.sociallyRelevant, typedOther.sociallyRelevant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoveringPercentage()).compareTo(typedOther.isSetCoveringPercentage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoveringPercentage()) {
      lastComparison = TBaseHelper.compareTo(this.coveringPercentage, typedOther.coveringPercentage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // POPULATION
          if (field.type == TType.I32) {
            this.population = iprot.readI32();
            setPopulationIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SOCIALLY_RELEVANT
          if (field.type == TType.BOOL) {
            this.sociallyRelevant = iprot.readBool();
            setSociallyRelevantIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COVERING_PERCENTAGE
          if (field.type == TType.DOUBLE) {
            this.coveringPercentage = iprot.readDouble();
            setCoveringPercentageIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (isSetPopulation()) {
      oprot.writeFieldBegin(POPULATION_FIELD_DESC);
      oprot.writeI32(this.population);
      oprot.writeFieldEnd();
    }
    if (isSetSociallyRelevant()) {
      oprot.writeFieldBegin(SOCIALLY_RELEVANT_FIELD_DESC);
      oprot.writeBool(this.sociallyRelevant);
      oprot.writeFieldEnd();
    }
    if (isSetCoveringPercentage()) {
      oprot.writeFieldBegin(COVERING_PERCENTAGE_FIELD_DESC);
      oprot.writeDouble(this.coveringPercentage);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InterpretationScoringFeatures(");
    boolean first = true;

    if (isSetPopulation()) {
      sb.append("population:");
      sb.append(this.population);
      first = false;
    }
    if (isSetSociallyRelevant()) {
      if (!first) sb.append(", ");
      sb.append("sociallyRelevant:");
      sb.append(this.sociallyRelevant);
      first = false;
    }
    if (isSetCoveringPercentage()) {
      if (!first) sb.append(", ");
      sb.append("coveringPercentage:");
      sb.append(this.coveringPercentage);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

