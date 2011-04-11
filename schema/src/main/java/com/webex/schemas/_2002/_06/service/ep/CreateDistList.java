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
import javax.xml.bind.annotation.XmlType;

import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class CreateDistList.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDistList", propOrder = {
    "distList"
})
public class CreateDistList
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The dist list. */
    @XmlElement(required = true)
    protected DistListWithContactType distList;

    /**
     * Gets the dist list.
     * 
     * @return the dist list
     */
    public DistListWithContactType getDistList() {
        return distList;
    }

    /**
     * Sets the dist list.
     * 
     * @param value the new dist list
     */
    public void setDistList(DistListWithContactType value) {
        this.distList = value;
    }

}
