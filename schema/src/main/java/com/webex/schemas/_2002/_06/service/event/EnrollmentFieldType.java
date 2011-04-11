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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnrollmentFieldType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollmentFieldType", propOrder = {
    "incl",
    "req"
})
@XmlSeeAlso({
    EnrollmentFieldInstanceType.class,
    CheckboxGroupType.class,
    TextboxType.class,
    ChoiceGroupType.class
})
public class EnrollmentFieldType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The incl. */
    @XmlElement(defaultValue = "true")
    protected Boolean incl;
    
    /** The req. */
    protected Boolean req;

    /**
     * Checks if is incl.
     * 
     * @return the boolean
     */
    public Boolean isIncl() {
        return incl;
    }

    /**
     * Sets the incl.
     * 
     * @param value the new incl
     */
    public void setIncl(Boolean value) {
        this.incl = value;
    }

    /**
     * Checks if is req.
     * 
     * @return the boolean
     */
    public Boolean isReq() {
        return req;
    }

    /**
     * Sets the req.
     * 
     * @param value the new req
     */
    public void setReq(Boolean value) {
        this.req = value;
    }

}
