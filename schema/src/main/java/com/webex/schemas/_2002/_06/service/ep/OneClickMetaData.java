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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class OneClickMetaData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickMetaData", propOrder = {
    "serviceType",
    "sessionType"
})
@XmlSeeAlso({
    OneClickMetaDataType.class
})
public class OneClickMetaData
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The service type. */
    @XmlElement(required = true)
    protected ServiceTypeType serviceType;
    
    /** The session type. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;

    /**
     * Gets the service type.
     * 
     * @return the service type
     */
    public ServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the service type.
     * 
     * @param value the new service type
     */
    public void setServiceType(ServiceTypeType value) {
        this.serviceType = value;
    }

    /**
     * Gets the session type.
     * 
     * @return the session type
     */
    public Long getSessionType() {
        return sessionType;
    }

    /**
     * Sets the session type.
     * 
     * @param value the new session type
     */
    public void setSessionType(Long value) {
        this.sessionType = value;
    }

}
