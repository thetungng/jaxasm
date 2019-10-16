/**
 * CityServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.City;

public class CityServiceServiceLocator extends org.apache.axis.client.Service implements com.example.demo.Service.City.CityServiceService {

    public CityServiceServiceLocator() {
    }


    public CityServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CityServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CityServicePort
    private java.lang.String CityServicePort_address = "http://localhost:9000/city_service";

    public java.lang.String getCityServicePortAddress() {
        return CityServicePort_address;
    }

    // The WSDD Service name defaults to the port name.
    private java.lang.String CityServicePortWSDDServiceName = "CityServicePort";

    public java.lang.String getCityServicePortWSDDServiceName() {
        return CityServicePortWSDDServiceName;
    }

    public void setCityServicePortWSDDServiceName(java.lang.String name) {
        CityServicePortWSDDServiceName = name;
    }

    public com.example.demo.Service.City.CityService getCityServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CityServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCityServicePort(endpoint);
    }

    public com.example.demo.Service.City.CityService getCityServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.demo.Service.City.CityServicePortBindingStub _stub = new com.example.demo.Service.City.CityServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCityServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCityServicePortEndpointAddress(java.lang.String address) {
        CityServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this Service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.demo.Service.City.CityService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.demo.Service.City.CityServicePortBindingStub _stub = new com.example.demo.Service.City.CityServicePortBindingStub(new java.net.URL(CityServicePort_address), this);
                _stub.setPortName(getCityServicePortWSDDServiceName());
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
        if ("CityServicePort".equals(inputPortName)) {
            return getCityServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service.example/", "CityServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service.example/", "CityServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CityServicePort".equals(portName)) {
            setCityServicePortEndpointAddress(address);
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
