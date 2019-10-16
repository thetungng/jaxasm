/**
 * CommentServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.Service.Comment;

public interface CommentServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCommentServicePortAddress();

    public com.example.demo.Service.Comment.CommentService getCommentServicePort() throws javax.xml.rpc.ServiceException;

    public com.example.demo.Service.Comment.CommentService getCommentServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
