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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class OpptyInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opptyInstanceType", propOrder = {
    "intOpptyID"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.sales.LstOpportunitiesResponse.Opportunity.class
})
public class OpptyInstanceType
    extends OpptyType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The int oppty id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intOpptyID;

    /**
     * Gets the int oppty id.
     * 
     * @return the int oppty id
     */
    public Long getIntOpptyID() {
        return intOpptyID;
    }

    /**
     * Sets the int oppty id.
     * 
     * @param value the new int oppty id
     */
    public void setIntOpptyID(Long value) {
        this.intOpptyID = value;
    }

}
