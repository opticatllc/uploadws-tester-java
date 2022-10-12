# uploadws-tester-java
Desktop application

IDE: Netbeans 12.0

SDK: 1.8.0_301
SRE: 1.8.0_331

Version: 1.1

Description: Basic version to upload files using Opticat WS (Developing)

To run the Jar file on Windows it is necessary to install the Java Development Kit (JDK) and Java Runtime Environment (JRE) 

To switch the server (Beta or Production) you must replace the following tags:

The wsdl:definitions

<wsdl:definitions xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsam="http://www.w3.org/2007/05/addressing/metadata" xmlns:wsx="http://schemas.xmlsoap.org/ws/2004/09/mex" xmlns:wsap="http://schemas.xmlsoap.org/ws/2004/08/addressing/policy" xmlns:msc="http://schemas.microsoft.com/ws/2005/12/wsdl/contract" xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://tempuri.org/" xmlns:wsa10="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsa="http://schemas.xmlsoap.org/ws/2004/08/addressing" name="Service" targetNamespace="http://tempuri.org/">

The endpoint with the correct URL 

<soap:address location="https://opticatnetwork.com/OBAPI_1_2/Service.svc"/>

And replace the endpoints in the code

URL url = new URL(“https://opticatnetwork.com/OBAPI_1_2/Service.svc”);

The example shown above is for switching to the production server

Dependencies:

![javaDependencies](https://user-images.githubusercontent.com/88451423/133518263-a09a4a33-bf13-4a5d-bdf2-6feae8d56608.png)
