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

package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderMCAttenHisByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderMCAttenHisByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFID"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="CITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderMCAttenHisByType")
@XmlEnum
public enum OrderMCAttenHisByType {

    CONFID,
    STARTTIME,
    COMPANY,
    COUNTRY,
    STATE,
    CITY;

    public String value() {
        return name();
    }

    public static OrderMCAttenHisByType fromValue(String v) {
        return valueOf(v);
    }

}
