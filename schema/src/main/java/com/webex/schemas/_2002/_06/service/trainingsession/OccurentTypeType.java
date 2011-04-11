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

package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum OccurentTypeType.
 */
@XmlType(name = "occurentTypeType")
@XmlEnum
public enum OccurentTypeType {

    /** The WEEKLY. */
    WEEKLY,
    
    /** The DAILY. */
    DAILY,
    
    /** The N o_ repeat. */
    NO_REPEAT,
    
    /** The CONSTANT. */
    CONSTANT,
    
    /** The MONTHLY. */
    MONTHLY,
    
    /** The IRREGULARLY. */
    IRREGULARLY;

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
        return name();
    }

    /**
     * From value.
     * 
     * @param v the v
     * 
     * @return the occurent type type
     */
    public static OccurentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
