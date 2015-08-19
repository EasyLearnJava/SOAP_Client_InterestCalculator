
package com.easylearnjava.webserviceprovider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="interestPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="purchaseAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchase", propOrder = {
    "id",
    "interestPercent",
    "purchaseAmount"
})
public class Purchase {

    protected int id;
    protected double interestPercent;
    protected double purchaseAmount;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the interestPercent property.
     * 
     */
    public double getInterestPercent() {
        return interestPercent;
    }

    /**
     * Sets the value of the interestPercent property.
     * 
     */
    public void setInterestPercent(double value) {
        this.interestPercent = value;
    }

    /**
     * Gets the value of the purchaseAmount property.
     * 
     */
    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * Sets the value of the purchaseAmount property.
     * 
     */
    public void setPurchaseAmount(double value) {
        this.purchaseAmount = value;
    }

}
