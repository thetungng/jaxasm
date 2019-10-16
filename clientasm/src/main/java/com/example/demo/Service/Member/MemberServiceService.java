/**
 * MemberServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Member;

public interface MemberServiceService extends javax.xml.rpc.Service {
    public java.lang.String getMemberServicePortAddress();

    public com.example.demo.Service.Member.MemberService getMemberServicePort() throws javax.xml.rpc.ServiceException;

    public com.example.demo.Service.Member.MemberService getMemberServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
