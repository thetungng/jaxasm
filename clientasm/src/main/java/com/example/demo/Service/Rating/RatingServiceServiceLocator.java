/**
 * RatingServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Rating;

public class RatingServiceServiceLocator extends org.apache.axis.client.Service implements com.example.demo.Service.Rating.RatingServiceService {

    public RatingServiceServiceLocator() {
    }


    public RatingServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RatingServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RatingServicePort
    private java.lang.String RatingServicePort_address = "http://localhost:9000/rating_service";

    public java.lang.String getRatingServicePortAddress() {
        return RatingServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RatingServicePortWSDDServiceName = "RatingServicePort";

    public java.lang.String getRatingServicePortWSDDServiceName() {
        return RatingServicePortWSDDServiceName;
    }

    public void setRatingServicePortWSDDServiceName(java.lang.String name) {
        RatingServicePortWSDDServiceName = name;
    }

    public com.example.demo.Service.Rating.RatingService getRatingServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RatingServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRatingServicePort(endpoint);
    }

    public com.example.demo.Service.Rating.RatingService getRatingServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.demo.Service.Rating.RatingServicePortBindingStub _stub = new com.example.demo.Service.Rating.RatingServicePortBindingStub(portAddress, this);
            _stub.setPortName(getRatingServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRatingServicePortEndpointAddress(java.lang.String address) {
        RatingServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.demo.Service.Rating.RatingService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.demo.Service.Rating.RatingServicePortBindingStub _stub = new com.example.demo.Service.Rating.RatingServicePortBindingStub(new java.net.URL(RatingServicePort_address), this);
                _stub.setPortName(getRatingServicePortWSDDServiceName());
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
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RatingServicePort".equals(inputPortName)) {
            return getRatingServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service.example/", "RatingServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service.example/", "RatingServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RatingServicePort".equals(portName)) {
            setRatingServicePortEndpointAddress(address);
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
