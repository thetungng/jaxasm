/**
 * DistrictServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.District;

public class DistrictServiceServiceLocator extends org.apache.axis.client.Service implements com.example.demo.Service.District.DistrictServiceService {

    public DistrictServiceServiceLocator() {
    }


    public DistrictServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DistrictServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DistrictServicePort
    private java.lang.String DistrictServicePort_address = "http://localhost:9000/district_service";

    public java.lang.String getDistrictServicePortAddress() {
        return DistrictServicePort_address;
    }

    // The WSDD Service name defaults to the port name.
    private java.lang.String DistrictServicePortWSDDServiceName = "DistrictServicePort";

    public java.lang.String getDistrictServicePortWSDDServiceName() {
        return DistrictServicePortWSDDServiceName;
    }

    public void setDistrictServicePortWSDDServiceName(java.lang.String name) {
        DistrictServicePortWSDDServiceName = name;
    }

    public com.example.demo.Service.District.DistrictService getDistrictServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DistrictServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDistrictServicePort(endpoint);
    }

    public com.example.demo.Service.District.DistrictService getDistrictServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.demo.Service.District.DistrictServicePortBindingStub _stub = new com.example.demo.Service.District.DistrictServicePortBindingStub(portAddress, this);
            _stub.setPortName(getDistrictServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDistrictServicePortEndpointAddress(java.lang.String address) {
        DistrictServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this Service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.demo.Service.District.DistrictService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.demo.Service.District.DistrictServicePortBindingStub _stub = new com.example.demo.Service.District.DistrictServicePortBindingStub(new java.net.URL(DistrictServicePort_address), this);
                _stub.setPortName(getDistrictServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this Service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DistrictServicePort".equals(inputPortName)) {
            return getDistrictServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service.example/", "DistrictServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service.example/", "DistrictServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DistrictServicePort".equals(portName)) {
            setDistrictServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
