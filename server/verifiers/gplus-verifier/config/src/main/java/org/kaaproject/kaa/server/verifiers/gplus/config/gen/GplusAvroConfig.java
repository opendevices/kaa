/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.verifiers.gplus.config.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class GplusAvroConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GplusAvroConfig\",\"namespace\":\"org.kaaproject.kaa.server.verifiers.gplus.config.gen\",\"fields\":[{\"name\":\"max_parallel_connections\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int max_parallel_connections;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public GplusAvroConfig() {}

  /**
   * All-args constructor.
   */
  public GplusAvroConfig(java.lang.Integer max_parallel_connections) {
    this.max_parallel_connections = max_parallel_connections;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return max_parallel_connections;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: max_parallel_connections = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'max_parallel_connections' field.
   */
  public java.lang.Integer getMaxParallelConnections() {
    return max_parallel_connections;
  }

  /**
   * Sets the value of the 'max_parallel_connections' field.
   * @param value the value to set.
   */
  public void setMaxParallelConnections(java.lang.Integer value) {
    this.max_parallel_connections = value;
  }

  /** Creates a new GplusAvroConfig RecordBuilder */
  public static org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder();
  }
  
  /** Creates a new GplusAvroConfig RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder newBuilder(org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder other) {
    return new org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder(other);
  }
  
  /** Creates a new GplusAvroConfig RecordBuilder by copying an existing GplusAvroConfig instance */
  public static org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder newBuilder(org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig other) {
    return new org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for GplusAvroConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GplusAvroConfig>
    implements org.apache.avro.data.RecordBuilder<GplusAvroConfig> {

    private int max_parallel_connections;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.max_parallel_connections)) {
        this.max_parallel_connections = data().deepCopy(fields()[0].schema(), other.max_parallel_connections);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing GplusAvroConfig instance */
    private Builder(org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig other) {
            super(org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.max_parallel_connections)) {
        this.max_parallel_connections = data().deepCopy(fields()[0].schema(), other.max_parallel_connections);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'max_parallel_connections' field */
    public java.lang.Integer getMaxParallelConnections() {
      return max_parallel_connections;
    }
    
    /** Sets the value of the 'max_parallel_connections' field */
    public org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder setMaxParallelConnections(int value) {
      validate(fields()[0], value);
      this.max_parallel_connections = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'max_parallel_connections' field has been set */
    public boolean hasMaxParallelConnections() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'max_parallel_connections' field */
    public org.kaaproject.kaa.server.verifiers.gplus.config.gen.GplusAvroConfig.Builder clearMaxParallelConnections() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public GplusAvroConfig build() {
      try {
        GplusAvroConfig record = new GplusAvroConfig();
        record.max_parallel_connections = fieldSetFlags()[0] ? this.max_parallel_connections : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
