//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:48:01 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for matapplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matapplicationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="apptype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embedded" type="{http://www.w3.org/2001/XMLSchema}string" default="base64" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matapplicationType", propOrder = {
    "value"
})
public class MatapplicationType {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String apptype;
    @XmlAttribute
    protected String embedded;
    @XmlAttribute
    protected String label;
    @XmlAttribute
    protected String uri;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the apptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptype() {
        return apptype;
    }

    /**
     * Sets the value of the apptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptype(String value) {
        this.apptype = value;
    }

    /**
     * Gets the value of the embedded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbedded() {
        if (embedded == null) {
            return "base64";
        } else {
            return embedded;
        }
    }

    /**
     * Sets the value of the embedded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbedded(String value) {
        this.embedded = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}