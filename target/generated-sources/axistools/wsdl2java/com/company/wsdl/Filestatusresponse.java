/**
 * Filestatusresponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class Filestatusresponse  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String errormessage;

    private java.lang.String importstatus;

    private java.lang.String schemaerrorcount;

    private java.lang.String filerecordcount;

    private java.lang.String importrecordcount;

    private java.lang.String importwarningcount;

    private java.lang.String importerrorcount;

    private java.lang.String startdate;

    private java.lang.String completiondate;

    private com.company.wsdl.FilestatusresponseImportmessage[] importmessages;

    public Filestatusresponse() {
    }

    public Filestatusresponse(
           java.lang.String status,
           java.lang.String errormessage,
           java.lang.String importstatus,
           java.lang.String schemaerrorcount,
           java.lang.String filerecordcount,
           java.lang.String importrecordcount,
           java.lang.String importwarningcount,
           java.lang.String importerrorcount,
           java.lang.String startdate,
           java.lang.String completiondate,
           com.company.wsdl.FilestatusresponseImportmessage[] importmessages) {
           this.status = status;
           this.errormessage = errormessage;
           this.importstatus = importstatus;
           this.schemaerrorcount = schemaerrorcount;
           this.filerecordcount = filerecordcount;
           this.importrecordcount = importrecordcount;
           this.importwarningcount = importwarningcount;
           this.importerrorcount = importerrorcount;
           this.startdate = startdate;
           this.completiondate = completiondate;
           this.importmessages = importmessages;
    }


    /**
     * Gets the status value for this Filestatusresponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Filestatusresponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the errormessage value for this Filestatusresponse.
     * 
     * @return errormessage
     */
    public java.lang.String getErrormessage() {
        return errormessage;
    }


    /**
     * Sets the errormessage value for this Filestatusresponse.
     * 
     * @param errormessage
     */
    public void setErrormessage(java.lang.String errormessage) {
        this.errormessage = errormessage;
    }


    /**
     * Gets the importstatus value for this Filestatusresponse.
     * 
     * @return importstatus
     */
    public java.lang.String getImportstatus() {
        return importstatus;
    }


    /**
     * Sets the importstatus value for this Filestatusresponse.
     * 
     * @param importstatus
     */
    public void setImportstatus(java.lang.String importstatus) {
        this.importstatus = importstatus;
    }


    /**
     * Gets the schemaerrorcount value for this Filestatusresponse.
     * 
     * @return schemaerrorcount
     */
    public java.lang.String getSchemaerrorcount() {
        return schemaerrorcount;
    }


    /**
     * Sets the schemaerrorcount value for this Filestatusresponse.
     * 
     * @param schemaerrorcount
     */
    public void setSchemaerrorcount(java.lang.String schemaerrorcount) {
        this.schemaerrorcount = schemaerrorcount;
    }


    /**
     * Gets the filerecordcount value for this Filestatusresponse.
     * 
     * @return filerecordcount
     */
    public java.lang.String getFilerecordcount() {
        return filerecordcount;
    }


    /**
     * Sets the filerecordcount value for this Filestatusresponse.
     * 
     * @param filerecordcount
     */
    public void setFilerecordcount(java.lang.String filerecordcount) {
        this.filerecordcount = filerecordcount;
    }


    /**
     * Gets the importrecordcount value for this Filestatusresponse.
     * 
     * @return importrecordcount
     */
    public java.lang.String getImportrecordcount() {
        return importrecordcount;
    }


    /**
     * Sets the importrecordcount value for this Filestatusresponse.
     * 
     * @param importrecordcount
     */
    public void setImportrecordcount(java.lang.String importrecordcount) {
        this.importrecordcount = importrecordcount;
    }


    /**
     * Gets the importwarningcount value for this Filestatusresponse.
     * 
     * @return importwarningcount
     */
    public java.lang.String getImportwarningcount() {
        return importwarningcount;
    }


    /**
     * Sets the importwarningcount value for this Filestatusresponse.
     * 
     * @param importwarningcount
     */
    public void setImportwarningcount(java.lang.String importwarningcount) {
        this.importwarningcount = importwarningcount;
    }


    /**
     * Gets the importerrorcount value for this Filestatusresponse.
     * 
     * @return importerrorcount
     */
    public java.lang.String getImporterrorcount() {
        return importerrorcount;
    }


    /**
     * Sets the importerrorcount value for this Filestatusresponse.
     * 
     * @param importerrorcount
     */
    public void setImporterrorcount(java.lang.String importerrorcount) {
        this.importerrorcount = importerrorcount;
    }


    /**
     * Gets the startdate value for this Filestatusresponse.
     * 
     * @return startdate
     */
    public java.lang.String getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this Filestatusresponse.
     * 
     * @param startdate
     */
    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the completiondate value for this Filestatusresponse.
     * 
     * @return completiondate
     */
    public java.lang.String getCompletiondate() {
        return completiondate;
    }


    /**
     * Sets the completiondate value for this Filestatusresponse.
     * 
     * @param completiondate
     */
    public void setCompletiondate(java.lang.String completiondate) {
        this.completiondate = completiondate;
    }


    /**
     * Gets the importmessages value for this Filestatusresponse.
     * 
     * @return importmessages
     */
    public com.company.wsdl.FilestatusresponseImportmessage[] getImportmessages() {
        return importmessages;
    }


    /**
     * Sets the importmessages value for this Filestatusresponse.
     * 
     * @param importmessages
     */
    public void setImportmessages(com.company.wsdl.FilestatusresponseImportmessage[] importmessages) {
        this.importmessages = importmessages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filestatusresponse)) return false;
        Filestatusresponse other = (Filestatusresponse) obj;
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
            ((this.importstatus==null && other.getImportstatus()==null) || 
             (this.importstatus!=null &&
              this.importstatus.equals(other.getImportstatus()))) &&
            ((this.schemaerrorcount==null && other.getSchemaerrorcount()==null) || 
             (this.schemaerrorcount!=null &&
              this.schemaerrorcount.equals(other.getSchemaerrorcount()))) &&
            ((this.filerecordcount==null && other.getFilerecordcount()==null) || 
             (this.filerecordcount!=null &&
              this.filerecordcount.equals(other.getFilerecordcount()))) &&
            ((this.importrecordcount==null && other.getImportrecordcount()==null) || 
             (this.importrecordcount!=null &&
              this.importrecordcount.equals(other.getImportrecordcount()))) &&
            ((this.importwarningcount==null && other.getImportwarningcount()==null) || 
             (this.importwarningcount!=null &&
              this.importwarningcount.equals(other.getImportwarningcount()))) &&
            ((this.importerrorcount==null && other.getImporterrorcount()==null) || 
             (this.importerrorcount!=null &&
              this.importerrorcount.equals(other.getImporterrorcount()))) &&
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.completiondate==null && other.getCompletiondate()==null) || 
             (this.completiondate!=null &&
              this.completiondate.equals(other.getCompletiondate()))) &&
            ((this.importmessages==null && other.getImportmessages()==null) || 
             (this.importmessages!=null &&
              java.util.Arrays.equals(this.importmessages, other.getImportmessages())));
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
        if (getImportstatus() != null) {
            _hashCode += getImportstatus().hashCode();
        }
        if (getSchemaerrorcount() != null) {
            _hashCode += getSchemaerrorcount().hashCode();
        }
        if (getFilerecordcount() != null) {
            _hashCode += getFilerecordcount().hashCode();
        }
        if (getImportrecordcount() != null) {
            _hashCode += getImportrecordcount().hashCode();
        }
        if (getImportwarningcount() != null) {
            _hashCode += getImportwarningcount().hashCode();
        }
        if (getImporterrorcount() != null) {
            _hashCode += getImporterrorcount().hashCode();
        }
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getCompletiondate() != null) {
            _hashCode += getCompletiondate().hashCode();
        }
        if (getImportmessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportmessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportmessages(), i);
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
        new org.apache.axis.description.TypeDesc(Filestatusresponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "filestatusresponse"));
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
        elemField.setFieldName("importstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaerrorcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schemaerrorcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filerecordcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filerecordcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importrecordcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importrecordcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importwarningcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importwarningcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importerrorcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importerrorcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completiondate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completiondate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importmessages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importmessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encoded", "filestatusresponseImportmessage"));
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
