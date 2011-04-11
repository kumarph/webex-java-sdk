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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AttendeeInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeInstanceType", propOrder = {
    "attendeeId",
    "confID",
    "status",
    "registerID"
})
public class AttendeeInstanceType
    extends AttendeeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee id. */
    protected long attendeeId;
    
    /** The conf id. */
    protected Long confID;
    
    /** The status. */
    protected AttendeeStatusType status;
    
    /** The register id. */
    protected Long registerID;

    /**
     * Gets the attendee id.
     * 
     * @return the attendee id
     */
    public long getAttendeeId() {
        return attendeeId;
    }

    /**
     * Sets the attendee id.
     * 
     * @param value the new attendee id
     */
    public void setAttendeeId(long value) {
        this.attendeeId = value;
    }

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public AttendeeStatusType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(AttendeeStatusType value) {
        this.status = value;
    }

    /**
     * Gets the register id.
     * 
     * @return the register id
     */
    public Long getRegisterID() {
        return registerID;
    }

    /**
     * Sets the register id.
     * 
     * @param value the new register id
     */
    public void setRegisterID(Long value) {
        this.registerID = value;
    }

}
