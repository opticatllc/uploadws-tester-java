/**
 * ServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.company.wsdl;

public class ServiceTestCase extends junit.framework.TestCase {
    public ServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testBasicHttpBinding_IServiceWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IServiceAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.company.wsdl.ServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1BasicHttpBinding_IServiceLogin() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        com.company.wsdl.Loginresponse value = null;
        value = binding.login(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test2BasicHttpBinding_IServiceLogout() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        com.company.wsdl.Logoutresponse value = null;
        value = binding.logout(new java.lang.String());
        // TBD - validate results
    }

    public void test3BasicHttpBinding_IServiceGetFileTypes() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        com.company.wsdl.Getfiletypesresponse value = null;
        value = binding.getFileTypes(new java.lang.String());
        // TBD - validate results
    }

    public void test4BasicHttpBinding_IServiceGetProductFiles() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        com.company.wsdl.Getproductfilesresponse value = null;
        value = binding.getProductFiles(new java.lang.String());
        // TBD - validate results
    }

    public void test5BasicHttpBinding_IServiceUploadFileChunk() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.uploadFileChunk(new java.lang.String(), new java.lang.String(), new byte[0], 0);
        // TBD - validate results
    }

    public void test6BasicHttpBinding_IServiceSaveUpload() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        com.company.wsdl.Saveuploadresponse value = null;
        value = binding.saveUpload(new com.company.wsdl.Saveuploadrequest());
        // TBD - validate results
    }

    public void test7BasicHttpBinding_IServiceGetFileImportStatus() throws Exception {
        com.company.wsdl.BasicHttpBinding_IServiceStub binding;
        try {
            binding = (com.company.wsdl.BasicHttpBinding_IServiceStub)
                          new com.company.wsdl.ServiceLocator().getBasicHttpBinding_IService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        com.company.wsdl.Filestatusresponse value = null;
        value = binding.getFileImportStatus(new com.company.wsdl.Filestatusrequest());
        // TBD - validate results
    }

}
