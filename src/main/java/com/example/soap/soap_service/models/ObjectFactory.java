//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.28 at 04:26:17 PM GMT+04:00 
//


package com.example.soap.soap_service.models;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.soap_service.models package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.soap_service.models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentsRequest }
     * 
     */
    public GetStudentsRequest createGetStudentsRequest() {
        return new GetStudentsRequest();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link SetStudentsRequest }
     * 
     */
    public SetStudentsRequest createSetStudentsRequest() {
        return new SetStudentsRequest();
    }

    /**
     * Create an instance of {@link SetStudentsResponse }
     * 
     */
    public SetStudentsResponse createSetStudentsResponse() {
        return new SetStudentsResponse();
    }

}
