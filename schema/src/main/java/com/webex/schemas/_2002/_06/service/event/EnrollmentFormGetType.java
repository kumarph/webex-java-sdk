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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollmentFormGetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollmentFormGetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardFields" type="{http://www.webex.com/schemas/2002/06/service/event}standardFieldsInstanceType" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.webex.com/schemas/2002/06/service/event}customFieldsInstanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollmentFormGetType", propOrder = {
    "standardFields",
    "customFields"
})
public class EnrollmentFormGetType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected StandardFieldsInstanceType standardFields;
    protected CustomFieldsInstanceType customFields;

    /**
     * Gets the value of the standardFields property.
     * 
     * @return
     *     possible object is
     *     {@link StandardFieldsInstanceType }
     *     
     */
    public StandardFieldsInstanceType getStandardFields() {
        return standardFields;
    }

    /**
     * Sets the value of the standardFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardFieldsInstanceType }
     *     
     */
    public void setStandardFields(StandardFieldsInstanceType value) {
        this.standardFields = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsInstanceType }
     *     
     */
    public CustomFieldsInstanceType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsInstanceType }
     *     
     */
    public void setCustomFields(CustomFieldsInstanceType value) {
        this.customFields = value;
    }

}
