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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstMeeting.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstMeeting", propOrder = {
    "listControl",
    "order",
    "dateScope",
    "meetingKey"
})
public class LstMeeting
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderType order;
    
    /** The date scope. */
    protected DateScopeType dateScope;
    
    /** The meeting key. */
    protected Long meetingKey;

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the date scope.
     * 
     * @return the date scope
     */
    public DateScopeType getDateScope() {
        return dateScope;
    }

    /**
     * Sets the date scope.
     * 
     * @param value the new date scope
     */
    public void setDateScope(DateScopeType value) {
        this.dateScope = value;
    }

    /**
     * Gets the meeting key.
     * 
     * @return the meeting key
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the meeting key.
     * 
     * @param value the new meeting key
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

}
