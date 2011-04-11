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

package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum TspAccessCodeOrderType.
 */
@XmlType(name = "tspAccessCodeOrderType")
@XmlEnum
public enum TspAccessCodeOrderType {

    /** The SUBSCRIBE r_1_ st. */
    @XmlEnumValue("SUBSCRIBER_1ST")
    SUBSCRIBER_1_ST("SUBSCRIBER_1ST"),
    
    /** The PARTICIPAN t_1_ st. */
    @XmlEnumValue("PARTICIPANT_1ST")
    PARTICIPANT_1_ST("PARTICIPANT_1ST");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new tsp access code order type.
     * 
     * @param v the v
     */
    TspAccessCodeOrderType(String v) {
        value = v;
    }

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * From value.
     * 
     * @param v the v
     * 
     * @return the tsp access code order type
     */
    public static TspAccessCodeOrderType fromValue(String v) {
        for (TspAccessCodeOrderType c: TspAccessCodeOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
