/**
 * MemberServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Member;

public class MemberServiceServiceLocator extends org.apache.axis.client.Service implements com.example.demo.Service.Member.MemberServiceService {

    public MemberServiceServiceLocator() {
    }


    public MemberServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MemberServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MemberServicePort
    private java.lang.String MemberServicePort_address = "http://localhost:9000/member_service";

    public java.lang.String getMemberServicePortAddress() {
        return MemberServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MemberServicePortWSDDServiceName = "MemberServicePort";

    public java.lang.String getMemberServicePortWSDDServiceName() {
        return MemberServicePortWSDDServiceName;
    }

    public void setMemberServicePortWSDDServiceName(java.lang.String name) {
        MemberServicePortWSDDServiceName = name;
    }

    public com.example.demo.Service.Member.MemberService getMemberServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MemberServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMemberServicePort(endpoint);
    }

    public com.example.demo.Service.Member.MemberService getMemberServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.demo.Service.Member.MemberServicePortBindingStub _stub = new com.example.demo.Service.Member.MemberServicePortBindingStub(portAddress, this);
            _stub.setPortName(getMemberServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMemberServicePortEndpointAddress(java.lang.String address) {
        MemberServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.demo.Service.Member.MemberService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.demo.Service.Member.MemberServicePortBindingStub _stub = new com.example.demo.Service.Member.MemberServicePortBindingStub(new java.net.URL(MemberServicePort_address), this);
                _stub.setPortName(getMemberServicePortWSDDServiceName());
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
        if ("MemberServicePort".equals(inputPortName)) {
            return getMemberServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service.example/", "MemberServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service.example/", "MemberServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MemberServicePort".equals(portName)) {
            setMemberServicePortEndpointAddress(address);
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
