/**
 * Getproductfilesresponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class Getproductfilesresponse  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String errormessage;

    private com.company.wsdl.GetproductfilesresponseProductline[] productlines;

    public Getproductfilesresponse() {
    }

    public Getproductfilesresponse(
           java.lang.String status,
           java.lang.String errormessage,
           com.company.wsdl.GetproductfilesresponseProductline[] productlines) {
           this.status = status;
           this.errormessage = errormessage;
           this.productlines = productlines;
    }


    /**
     * Gets the status value for this Getproductfilesresponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Getproductfilesresponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the errormessage value for this Getproductfilesresponse.
     * 
     * @return errormessage
     */
    public java.lang.String getErrormessage() {
        return errormessage;
    }


    /**
     * Sets the errormessage value for this Getproductfilesresponse.
     * 
     * @param errormessage
     */
    public void setErrormessage(java.lang.String errormessage) {
        this.errormessage = errormessage;
    }


    /**
     * Gets the productlines value for this Getproductfilesresponse.
     * 
     * @return productlines
     */
    public com.company.wsdl.GetproductfilesresponseProductline[] getProductlines() {
        return productlines;
    }


    /**
     * Sets the productlines value for this Getproductfilesresponse.
     * 
     * @param productlines
     */
    public void setProductlines(com.company.wsdl.GetproductfilesresponseProductline[] productlines) {
        this.productlines = productlines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Getproductfilesresponse)) return false;
        Getproductfilesresponse other = (Getproductfilesresponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.errormessage==null && other.getErrormessage()==null) || 
             (this.errormessage!=null &&
              this.errormessage.equals(other.getErrormessage()))) &&
            ((this.productlines==null && other.getProductlines()==null) || 
             (this.productlines!=null &&
              java.util.Arrays.equals(this.productlines, other.getProductlines())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getErrormessage() != null) {
            _hashCode += getErrormessage().hashCode();
        }
        if (getProductlines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductlines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductlines(), i);
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
        new org.apache.axis.description.TypeDesc(Getproductfilesresponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "getproductfilesresponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errormessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errormessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productlines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productlines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "getproductfilesresponseProductline"));
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
