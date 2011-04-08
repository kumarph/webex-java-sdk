/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for controlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="controlType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="hint_switch" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="solution_switch" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="feedback_switch" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlType", propOrder = {
    "value"
})
public class ControlType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "hint_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hintSwitch;
    @XmlAttribute(name = "solution_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solutionSwitch;
    @XmlAttribute(name = "feedback_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackSwitch;

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
     * Gets the value of the hintSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintSwitch() {
        if (hintSwitch == null) {
            return "No";
        } else {
            return hintSwitch;
        }
    }

    /**
     * Sets the value of the hintSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHintSwitch(String value) {
        this.hintSwitch = value;
    }

    /**
     * Gets the value of the solutionSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionSwitch() {
        if (solutionSwitch == null) {
            return "No";
        } else {
            return solutionSwitch;
        }
    }

    /**
     * Sets the value of the solutionSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionSwitch(String value) {
        this.solutionSwitch = value;
    }

    /**
     * Gets the value of the feedbackSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackSwitch() {
        if (feedbackSwitch == null) {
            return "No";
        } else {
            return feedbackSwitch;
        }
    }

    /**
     * Sets the value of the feedbackSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackSwitch(String value) {
        this.feedbackSwitch = value;
    }

}
