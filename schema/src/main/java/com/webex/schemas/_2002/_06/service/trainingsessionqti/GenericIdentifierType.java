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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class GenericIdentifierType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generic_identifierType", propOrder = {
    "typeLabel",
    "identifierString"
})
public class GenericIdentifierType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The type label. */
    @XmlElement(name = "type_label", required = true)
    protected TypeLabelType typeLabel;
    
    /** The identifier string. */
    @XmlElement(name = "identifier_string", required = true)
    protected String identifierString;

    /**
     * Gets the type label.
     * 
     * @return the type label
     */
    public TypeLabelType getTypeLabel() {
        return typeLabel;
    }

    /**
     * Sets the type label.
     * 
     * @param value the new type label
     */
    public void setTypeLabel(TypeLabelType value) {
        this.typeLabel = value;
    }

    /**
     * Gets the identifier string.
     * 
     * @return the identifier string
     */
    public String getIdentifierString() {
        return identifierString;
    }

    /**
     * Sets the identifier string.
     * 
     * @param value the new identifier string
     */
    public void setIdentifierString(String value) {
        this.identifierString = value;
    }

}
