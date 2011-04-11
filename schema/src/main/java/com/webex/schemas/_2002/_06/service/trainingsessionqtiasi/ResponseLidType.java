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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ResponseLidType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_lidType", propOrder = {
    "renderChoice"
})
public class ResponseLidType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The render choice. */
    @XmlElement(name = "render_choice", required = true)
    protected RenderChoiceType renderChoice;
    
    /** The ident. */
    @XmlAttribute(required = true)
    protected String ident;
    
    /** The rcardinality. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcardinality;

    /**
     * Gets the render choice.
     * 
     * @return the render choice
     */
    public RenderChoiceType getRenderChoice() {
        return renderChoice;
    }

    /**
     * Sets the render choice.
     * 
     * @param value the new render choice
     */
    public void setRenderChoice(RenderChoiceType value) {
        this.renderChoice = value;
    }

    /**
     * Gets the ident.
     * 
     * @return the ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the ident.
     * 
     * @param value the new ident
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the rcardinality.
     * 
     * @return the rcardinality
     */
    public String getRcardinality() {
        if (rcardinality == null) {
            return "Single";
        } else {
            return rcardinality;
        }
    }

    /**
     * Sets the rcardinality.
     * 
     * @param value the new rcardinality
     */
    public void setRcardinality(String value) {
        this.rcardinality = value;
    }

}
