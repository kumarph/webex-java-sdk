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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class RemindType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remindType", propOrder = {
    "enableReminder",
    "daysAhead",
    "hoursAhead",
    "minutesAhead"
})
public class RemindType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enable reminder. */
    protected Boolean enableReminder;
    
    /** The days ahead. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long daysAhead;
    
    /** The hours ahead. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long hoursAhead;
    
    /** The minutes ahead. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minutesAhead;

    /**
     * Checks if is enable reminder.
     * 
     * @return the boolean
     */
    public Boolean isEnableReminder() {
        return enableReminder;
    }

    /**
     * Sets the enable reminder.
     * 
     * @param value the new enable reminder
     */
    public void setEnableReminder(Boolean value) {
        this.enableReminder = value;
    }

    /**
     * Gets the days ahead.
     * 
     * @return the days ahead
     */
    public Long getDaysAhead() {
        return daysAhead;
    }

    /**
     * Sets the days ahead.
     * 
     * @param value the new days ahead
     */
    public void setDaysAhead(Long value) {
        this.daysAhead = value;
    }

    /**
     * Gets the hours ahead.
     * 
     * @return the hours ahead
     */
    public Long getHoursAhead() {
        return hoursAhead;
    }

    /**
     * Sets the hours ahead.
     * 
     * @param value the new hours ahead
     */
    public void setHoursAhead(Long value) {
        this.hoursAhead = value;
    }

    /**
     * Gets the minutes ahead.
     * 
     * @return the minutes ahead
     */
    public Long getMinutesAhead() {
        return minutesAhead;
    }

    /**
     * Sets the minutes ahead.
     * 
     * @param value the new minutes ahead
     */
    public void setMinutesAhead(Long value) {
        this.minutesAhead = value;
    }

}
