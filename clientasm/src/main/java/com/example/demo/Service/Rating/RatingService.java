/**
 * RatingService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Rating;

public interface RatingService extends java.rmi.Remote {
    public com.example.demo.Service.Rating.Place update(com.example.demo.Service.Rating.Place arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.Rating.Place store(com.example.demo.Service.Rating.Place arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.Rating.Place getById(long arg0) throws java.rmi.RemoteException;

    public com.example.demo.Service.Rating.Place[] getAll() throws java.rmi.RemoteException;

    public com.example.demo.Service.Rating.Comment[] getByPlaceId(long arg0) throws java.rmi.RemoteException;
}
