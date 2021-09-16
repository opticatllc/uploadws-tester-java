/**
 * Saveuploadrequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class Saveuploadrequest  implements java.io.Serializable {
    private java.lang.String apikey;

    private java.lang.String productline;

    private java.lang.String productfile;

    private java.lang.String filename;

    private java.lang.String filetype;

    private java.lang.String checksumalgo;

    private java.lang.String checksumhex;

    public Saveuploadrequest() {
    }

    public Saveuploadrequest(
           java.lang.String apikey,
           java.lang.String productline,
           java.lang.String productfile,
           java.lang.String filename,
           java.lang.String filetype,
           java.lang.String checksumalgo,
           java.lang.String checksumhex) {
           this.apikey = apikey;
           this.productline = productline;
           this.productfile = productfile;
           this.filename = filename;
           this.filetype = filetype;
           this.checksumalgo = checksumalgo;
           this.checksumhex = checksumhex;
    }


    /**
     * Gets the apikey value for this Saveuploadrequest.
     * 
     * @return apikey
     */
    public java.lang.String getApikey() {
        return apikey;
    }


    /**
     * Sets the apikey value for this Saveuploadrequest.
     * 
     * @param apikey
     */
    public void setApikey(java.lang.String apikey) {
        this.apikey = apikey;
    }


    /**
     * Gets the productline value for this Saveuploadrequest.
     * 
     * @return productline
     */
    public java.lang.String getProductline() {
        return productline;
    }


    /**
     * Sets the productline value for this Saveuploadrequest.
     * 
     * @param productline
     */
    public void setProductline(java.lang.String productline) {
        this.productline = productline;
    }


    /**
     * Gets the productfile value for this Saveuploadrequest.
     * 
     * @return productfile
     */
    public java.lang.String getProductfile() {
        return productfile;
    }


    /**
     * Sets the productfile value for this Saveuploadrequest.
     * 
     * @param productfile
     */
    public void setProductfile(java.lang.String productfile) {
        this.productfile = productfile;
    }


    /**
     * Gets the filename value for this Saveuploadrequest.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this Saveuploadrequest.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the filetype value for this Saveuploadrequest.
     * 
     * @return filetype
     */
    public java.lang.String getFiletype() {
        return filetype;
    }


    /**
     * Sets the filetype value for this Saveuploadrequest.
     * 
     * @param filetype
     */
    public void setFiletype(java.lang.String filetype) {
        this.filetype = filetype;
    }


    /**
     * Gets the checksumalgo value for this Saveuploadrequest.
     * 
     * @return checksumalgo
     */
    public java.lang.String getChecksumalgo() {
        return checksumalgo;
    }


    /**
     * Sets the checksumalgo value for this Saveuploadrequest.
     * 
     * @param checksumalgo
     */
    public void setChecksumalgo(java.lang.String checksumalgo) {
        this.checksumalgo = checksumalgo;
    }


    /**
     * Gets the checksumhex value for this Saveuploadrequest.
     * 
     * @return checksumhex
     */
    public java.lang.String getChecksumhex() {
        return checksumhex;
    }


    /**
     * Sets the checksumhex value for this Saveuploadrequest.
     * 
     * @param checksumhex
     */
    public void setChecksumhex(java.lang.String checksumhex) {
        this.checksumhex = checksumhex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Saveuploadrequest)) return false;
        Saveuploadrequest other = (Saveuploadrequest) obj;
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
              this.productfile.equals(other.getProductfile()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.filetype==null && other.getFiletype()==null) || 
             (this.filetype!=null &&
              this.filetype.equals(other.getFiletype()))) &&
            ((this.checksumalgo==null && other.getChecksumalgo()==null) || 
             (this.checksumalgo!=null &&
              this.checksumalgo.equals(other.getChecksumalgo()))) &&
            ((this.checksumhex==null && other.getChecksumhex()==null) || 
             (this.checksumhex!=null &&
              this.checksumhex.equals(other.getChecksumhex())));
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
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getFiletype() != null) {
            _hashCode += getFiletype().hashCode();
        }
        if (getChecksumalgo() != null) {
            _hashCode += getChecksumalgo().hashCode();
        }
        if (getChecksumhex() != null) {
            _hashCode += getChecksumhex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Saveuploadrequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "saveuploadrequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksumalgo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checksumalgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksumhex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checksumhex"));
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
