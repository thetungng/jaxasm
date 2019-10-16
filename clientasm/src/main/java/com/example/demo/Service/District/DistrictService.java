/**
 * DistrictService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.District;

public interface DistrictService extends java.rmi.Remote {
    public com.example.demo.Service.District.Place update(com.example.demo.Service.District.Place arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.District.Place store(com.example.demo.Service.District.Place arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.District.Place getById(long arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.District.Place[] getAll() throws java.rmi.RemoteException;
}
