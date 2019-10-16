/**
 * MemberService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Member;

public interface MemberService extends java.rmi.Remote {
    public com.example.demo.Service.Member.Member register(com.example.demo.Service.Member.Member arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.Member.Member login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
