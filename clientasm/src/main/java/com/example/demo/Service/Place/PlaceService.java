/**
 * PlaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Place;

public interface PlaceService extends java.rmi.Remote {
    public com.example.demo.Service.Place.Place update(com.example.demo.Service.Place.Place arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.Place.Place store(com.example.demo.Service.Place.Place arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.Place.Place[] getAll() throws java.rmi.RemoteException;
    public com.example.demo.Service.Place.City[] getAllCity() throws java.rmi.RemoteException;
    public com.example.demo.Service.Place.District[] getAllDistrict() throws java.rmi.RemoteException;
    public com.example.demo.Service.Place.Place getById(long arg0) throws java.rmi.RemoteException;
}
