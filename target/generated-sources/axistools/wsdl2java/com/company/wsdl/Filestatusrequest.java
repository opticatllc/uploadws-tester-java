/**
 * Filestatusrequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class Filestatusrequest  implements java.io.Serializable {
    private java.lang.String apikey;

    private java.lang.String productline;

    private java.lang.String productfile;

    public Filestatusrequest() {
    }

    public Filestatusrequest(
           java.lang.String apikey,
           java.lang.String productline,
           java.lang.String productfile) {
           this.apikey = apikey;
           this.productline = productline;
           this.productfile = productfile;
    }


    /**
     * Gets the apikey value for this Filestatusrequest.
     * 
     * @return apikey
     */
    public java.lang.String getApikey() {
        return apikey;
    }


    /**
     * Sets the apikey value for this Filestatusrequest.
     * 
     * @param apikey
     */
    public void setApikey(java.lang.String apikey) {
        this.apikey = apikey;
    }


    /**
     * Gets the productline value for this Filestatusrequest.
     * 
     * @return productline
     */
    public java.lang.String getProductline() {
        return productline;
    }


    /**
     * Sets the productline value for this Filestatusrequest.
     * 
     * @param productline
     */
    public void setProductline(java.lang.String productline) {
        this.productline = productline;
    }


    /**
     * Gets the productfile value for this Filestatusrequest.
     * 
     * @return productfile
     */
    public java.lang.String getProductfile() {
        return productfile;
    }


    /**
     * Sets the productfile value for this Filestatusrequest.
     * 
     * @param productfile
     */
    public void setProductfile(java.lang.String productfile) {
        this.productfile = productfile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filestatusrequest)) return false;
        Filestatusrequest other = (Filestatusrequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apikey==null && other.getApikey()==null) || 
             (this.apikey!=null &&
              this.apikey.equals(other.getApikey()))) &&
            ((this.productline==null && other.getProductline()==null) || 
             (this.productline!=null &&
              this.productline.equals(other.getProductline()))) &&
            ((this.productfile==null && other.getProductfile()==null) || 
             (this.productfile!=null &&
              this.productfile.equals(other.getProductfile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApikey() != null) {
            _hashCode += getApikey().hashCode();
        }
        if (getProductline() != null) {
            _hashCode += getProductline().hashCode();
        }
        if (getProductfile() != null) {
            _hashCode += getProductfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filestatusrequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "filestatusrequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apikey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apikey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
