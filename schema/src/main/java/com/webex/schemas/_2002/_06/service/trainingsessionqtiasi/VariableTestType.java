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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for variable_testType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variable_testType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="varname" type="{http://www.w3.org/2001/XMLSchema}string" default="SCORE" />
 *       &lt;attribute name="testoperator" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="EQ"/>
 *             &lt;enumeration value="NEQ"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="LTE"/>
 *             &lt;enumeration value="GT"/>
 *             &lt;enumeration value="GTE"/>
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
@XmlType(name = "variable_testType", propOrder = {
    "value"
})
public class VariableTestType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlValue
    protected String value;
    @XmlAttribute
    protected String varname;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String testoperator;

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
     * Gets the value of the varname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarname() {
        if (varname == null) {
            return "SCORE";
        } else {
            return varname;
        }
    }

    /**
     * Sets the value of the varname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarname(String value) {
        this.varname = value;
    }

    /**
     * Gets the value of the testoperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestoperator() {
        return testoperator;
    }

    /**
     * Sets the value of the testoperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestoperator(String value) {
        this.testoperator = value;
    }

}
