/**
 * GetproductfilesresponseProductline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class GetproductfilesresponseProductline  implements java.io.Serializable {
    private java.lang.String name;

    private com.company.wsdl.GetproductfilesresponseProductlineProductfile[] productfiles;

    public GetproductfilesresponseProductline() {
    }

    public GetproductfilesresponseProductline(
           java.lang.String name,
           com.company.wsdl.GetproductfilesresponseProductlineProductfile[] productfiles) {
           this.name = name;
           this.productfiles = productfiles;
    }


    /**
     * Gets the name value for this GetproductfilesresponseProductline.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GetproductfilesresponseProductline.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the productfiles value for this GetproductfilesresponseProductline.
     * 
     * @return productfiles
     */
    public com.company.wsdl.GetproductfilesresponseProductlineProductfile[] getProductfiles() {
        return productfiles;
    }


    /**
     * Sets the productfiles value for this GetproductfilesresponseProductline.
     * 
     * @param productfiles
     */
    public void setProductfiles(com.company.wsdl.GetproductfilesresponseProductlineProductfile[] productfiles) {
        this.productfiles = productfiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetproductfilesresponseProductline)) return false;
        GetproductfilesresponseProductline other = (GetproductfilesresponseProductline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.productfiles==null && other.getProductfiles()==null) || 
             (this.productfiles!=null &&
              java.util.Arrays.equals(this.productfiles, other.getProductfiles())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProductfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductfiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetproductfilesresponseProductline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "getproductfilesresponseProductline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "getproductfilesresponseProductlineProductfile"));
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
