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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * The Class LstMeetingResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstMeetingResponse", propOrder = {
    "meeting",
    "matchingRecords"
})
public class LstMeetingResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting. */
    protected List<MeetingInstanceType> meeting;
    
    /** The matching records. */
    protected MatchingRecordsType matchingRecords;

    /**
     * Gets the meeting.
     * 
     * @return the meeting
     */
    public List<MeetingInstanceType> getMeeting() {
        if (meeting == null) {
            meeting = new ArrayList<MeetingInstanceType>();
        }
        return this.meeting;
    }

    /**
     * Gets the matching records.
     * 
     * @return the matching records
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the matching records.
     * 
     * @param value the new matching records
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

}
