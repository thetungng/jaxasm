/**
 * CommentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Comment;

public interface CommentService extends java.rmi.Remote {
    public com.example.demo.Service.Comment.Place update(com.example.demo.Service.Comment.Place arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.Comment.Place store(com.example.demo.Service.Comment.Place arg0) throws java.rmi.RemoteException;
    public com.example.demo.Service.Comment.Place[] getAll() throws java.rmi.RemoteException;
    public com.example.demo.Service.Comment.Comment[] getByPlaceId(long arg0) throws java.rmi.RemoteException;
}
