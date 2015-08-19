
package com.easylearnjava.webserviceprovider;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InterestException", targetNamespace = "http://webserviceprovider.easylearnjava.com/")
public class InterestException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InterestException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InterestException_Exception(String message, InterestException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InterestException_Exception(String message, InterestException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.easylearnjava.webserviceprovider.InterestException
     */
    public InterestException getFaultInfo() {
        return faultInfo;
    }

}