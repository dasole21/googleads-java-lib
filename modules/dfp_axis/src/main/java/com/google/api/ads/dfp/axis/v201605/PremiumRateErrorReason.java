/**
 * PremiumRateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public class PremiumRateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PremiumRateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_RATE_TYPE = "INVALID_RATE_TYPE";
    public static final java.lang.String _INVALID_PRICING_METHOD = "INVALID_PRICING_METHOD";
    public static final java.lang.String _INVALID_PREMIUM_FEATURE = "INVALID_PREMIUM_FEATURE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final PremiumRateErrorReason INVALID_RATE_TYPE = new PremiumRateErrorReason(_INVALID_RATE_TYPE);
    public static final PremiumRateErrorReason INVALID_PRICING_METHOD = new PremiumRateErrorReason(_INVALID_PRICING_METHOD);
    public static final PremiumRateErrorReason INVALID_PREMIUM_FEATURE = new PremiumRateErrorReason(_INVALID_PREMIUM_FEATURE);
    public static final PremiumRateErrorReason UNKNOWN = new PremiumRateErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static PremiumRateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PremiumRateErrorReason enumeration = (PremiumRateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PremiumRateErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PremiumRateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "PremiumRateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
