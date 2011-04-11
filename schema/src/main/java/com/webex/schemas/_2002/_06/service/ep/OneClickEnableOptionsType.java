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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OneClickEnableOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickEnableOptionsType", propOrder = {
    "voip"
})
public class OneClickEnableOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The voip. */
    protected Boolean voip;

    /**
     * Checks if is voip.
     * 
     * @return the boolean
     */
    public Boolean isVoip() {
        return voip;
    }

    /**
     * Sets the voip.
     * 
     * @param value the new voip
     */
    public void setVoip(Boolean value) {
        this.voip = value;
    }

}
