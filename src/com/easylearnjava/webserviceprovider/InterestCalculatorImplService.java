
package com.easylearnjava.webserviceprovider;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InterestCalculatorImplService", targetNamespace = "http://webserviceprovider.easylearnjava.com/", wsdlLocation = "http://localhost:8080/SOAP_Calculator_WebService_Provider/icalc?wsdl")
public class InterestCalculatorImplService
    extends Service
{

    private final static URL INTERESTCALCULATORIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException INTERESTCALCULATORIMPLSERVICE_EXCEPTION;
    private final static QName INTERESTCALCULATORIMPLSERVICE_QNAME = new QName("http://webserviceprovider.easylearnjava.com/", "InterestCalculatorImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAP_Calculator_WebService_Provider/icalc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTERESTCALCULATORIMPLSERVICE_WSDL_LOCATION = url;
        INTERESTCALCULATORIMPLSERVICE_EXCEPTION = e;
    }

    public InterestCalculatorImplService() {
        super(__getWsdlLocation(), INTERESTCALCULATORIMPLSERVICE_QNAME);
    }

    public InterestCalculatorImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTERESTCALCULATORIMPLSERVICE_QNAME, features);
    }

    public InterestCalculatorImplService(URL wsdlLocation) {
        super(wsdlLocation, INTERESTCALCULATORIMPLSERVICE_QNAME);
    }

    public InterestCalculatorImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTERESTCALCULATORIMPLSERVICE_QNAME, features);
    }

    public InterestCalculatorImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InterestCalculatorImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InterestCalculator
     */
    @WebEndpoint(name = "InterestCalculatorImplPort")
    public InterestCalculator getInterestCalculatorImplPort() {
        return super.getPort(new QName("http://webserviceprovider.easylearnjava.com/", "InterestCalculatorImplPort"), InterestCalculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InterestCalculator
     */
    @WebEndpoint(name = "InterestCalculatorImplPort")
    public InterestCalculator getInterestCalculatorImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webserviceprovider.easylearnjava.com/", "InterestCalculatorImplPort"), InterestCalculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INTERESTCALCULATORIMPLSERVICE_EXCEPTION!= null) {
            throw INTERESTCALCULATORIMPLSERVICE_EXCEPTION;
        }
        return INTERESTCALCULATORIMPLSERVICE_WSDL_LOCATION;
    }

}
