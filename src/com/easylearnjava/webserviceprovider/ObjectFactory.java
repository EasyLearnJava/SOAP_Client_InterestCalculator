
package com.easylearnjava.webserviceprovider;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.easylearnjava.webserviceprovider package. 
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

    private final static QName _InterestException_QNAME = new QName("http://webserviceprovider.easylearnjava.com/", "InterestException");
    private final static QName _Purchase_QNAME = new QName("http://webserviceprovider.easylearnjava.com/", "purchase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.easylearnjava.webserviceprovider
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link InterestException }
     * 
     */
    public InterestException createInterestException() {
        return new InterestException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterestException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceprovider.easylearnjava.com/", name = "InterestException")
    public JAXBElement<InterestException> createInterestException(InterestException value) {
        return new JAXBElement<InterestException>(_InterestException_QNAME, InterestException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceprovider.easylearnjava.com/", name = "purchase")
    public JAXBElement<Purchase> createPurchase(Purchase value) {
        return new JAXBElement<Purchase>(_Purchase_QNAME, Purchase.class, null, value);
    }

}
