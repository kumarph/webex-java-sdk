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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AndType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "andType", propOrder = {
    "notOrAndOrOr"
})
public class AndType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The not or and or or. */
    @XmlElements({
        @XmlElement(name = "varequal", type = VarequalType.class),
        @XmlElement(name = "and", type = AndType.class),
        @XmlElement(name = "not", type = NotType.class),
        @XmlElement(name = "or", type = OrType.class)
    })
    protected List<Serializable> notOrAndOrOr;

    /**
     * Gets the not or and or or.
     * 
     * @return the not or and or or
     */
    public List<Serializable> getNotOrAndOrOr() {
        if (notOrAndOrOr == null) {
            notOrAndOrOr = new ArrayList<Serializable>();
        }
        return this.notOrAndOrOr;
    }

}
