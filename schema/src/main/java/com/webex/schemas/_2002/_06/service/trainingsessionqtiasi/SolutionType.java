//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:48:01 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for solutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *         &lt;element name="solutionmaterial" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}solutionmaterialType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="feedbackstyle" default="Complete">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Complete"/>
 *             &lt;enumeration value="Incremental"/>
 *             &lt;enumeration value="Multilevel"/>
 *             &lt;enumeration value="Proprietary"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solutionType", propOrder = {
    "qticomment",
    "solutionmaterial"
})
public class SolutionType {

    protected QticommentType qticomment;
    @XmlElement(required = true)
    protected List<SolutionmaterialType> solutionmaterial;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackstyle;

    /**
     * Gets the value of the qticomment property.
     * 
     * @return
     *     possible object is
     *     {@link QticommentType }
     *     
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the value of the qticomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QticommentType }
     *     
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

    /**
     * Gets the value of the solutionmaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solutionmaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolutionmaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolutionmaterialType }
     * 
     * 
     */
    public List<SolutionmaterialType> getSolutionmaterial() {
        if (solutionmaterial == null) {
            solutionmaterial = new ArrayList<SolutionmaterialType>();
        }
        return this.solutionmaterial;
    }

    /**
     * Gets the value of the feedbackstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackstyle() {
        if (feedbackstyle == null) {
            return "Complete";
        } else {
            return feedbackstyle;
        }
    }

    /**
     * Sets the value of the feedbackstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackstyle(String value) {
        this.feedbackstyle = value;
    }

}