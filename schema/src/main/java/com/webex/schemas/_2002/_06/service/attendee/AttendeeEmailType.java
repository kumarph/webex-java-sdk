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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AttendeeEmailType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeEmailType", propOrder = {
    "email",
    "sessionKey"
})
public class AttendeeEmailType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The email. */
    @XmlElement(required = true)
    protected String email;
    
    /** The session key. */
    protected long sessionKey;

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

}
