/**
 * IService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public interface IService extends java.rmi.Remote {
    public com.company.wsdl.Loginresponse login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.company.wsdl.Logoutresponse logout(java.lang.String apikey) throws java.rmi.RemoteException;
    public com.company.wsdl.Getfiletypesresponse getFileTypes(java.lang.String apikey) throws java.rmi.RemoteException;
    public com.company.wsdl.Getproductfilesresponse getProductFiles(java.lang.String apikey) throws java.rmi.RemoteException;
    public java.lang.String uploadFileChunk(java.lang.String apikey, java.lang.String filename, byte[] buffer, long offset) throws java.rmi.RemoteException;
    public com.company.wsdl.Saveuploadresponse saveUpload(com.company.wsdl.Saveuploadrequest params) throws java.rmi.RemoteException;
    public com.company.wsdl.Filestatusresponse getFileImportStatus(com.company.wsdl.Filestatusrequest params) throws java.rmi.RemoteException;
}
