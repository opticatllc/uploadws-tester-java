/**
 * FilestatusresponseImportmessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class FilestatusresponseImportmessage  implements java.io.Serializable {
    private java.lang.String messagetype;

    private java.lang.String message;

    private java.lang.String timeindex;

    public FilestatusresponseImportmessage() {
    }

    public FilestatusresponseImportmessage(
           java.lang.String messagetype,
           java.lang.String message,
           java.lang.String timeindex) {
           this.messagetype = messagetype;
           this.message = message;
           this.timeindex = timeindex;
    }


    /**
     * Gets the messagetype value for this FilestatusresponseImportmessage.
     * 
     * @return messagetype
     */
    public java.lang.String getMessagetype() {
        return messagetype;
    }


    /**
     * Sets the messagetype value for this FilestatusresponseImportmessage.
     * 
     * @param messagetype
     */
    public void setMessagetype(java.lang.String messagetype) {
        this.messagetype = messagetype;
    }


    /**
     * Gets the message value for this FilestatusresponseImportmessage.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this FilestatusresponseImportmessage.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the timeindex value for this FilestatusresponseImportmessage.
     * 
     * @return timeindex
     */
    public java.lang.String getTimeindex() {
        return timeindex;
    }


    /**
     * Sets the timeindex value for this FilestatusresponseImportmessage.
     * 
     * @param timeindex
     */
    public void setTimeindex(java.lang.String timeindex) {
        this.timeindex = timeindex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilestatusresponseImportmessage)) return false;
        FilestatusresponseImportmessage other = (FilestatusresponseImportmessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messagetype==null && other.getMessagetype()==null) || 
             (this.messagetype!=null &&
              this.messagetype.equals(other.getMessagetype()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.timeindex==null && other.getTimeindex()==null) || 
             (this.timeindex!=null &&
              this.timeindex.equals(other.getTimeindex())));
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
        if (getMessagetype() != null) {
            _hashCode += getMessagetype().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTimeindex() != null) {
            _hashCode += getTimeindex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilestatusresponseImportmessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "filestatusresponseImportmessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messagetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeindex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeindex"));
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
