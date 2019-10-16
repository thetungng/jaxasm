/**
 * CityService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.City;

public interface CityService extends java.rmi.Remote {
    public com.example.demo.Service.City.Place update(com.example.demo.Service.City.Place arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.City.Place store(com.example.demo.Service.City.Place arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.City.Place getById(long arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.City.Place[] getAll() throws java.rmi.RemoteException;
}
