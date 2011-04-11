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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.PersonType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class AttendeeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeType", propOrder = {
    "person",
    "contactID",
    "joinStatus",
    "meetingKey",
    "sessionKey",
    "language",
    "role",
    "emailInvitations",
    "locale",
    "timeZoneID",
    "languageID"
})
@XmlSeeAlso({
    CreateMeetingAttendee.class,
    AttendeeInstanceType.class
})
public class AttendeeType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The person. */
    @XmlElement(required = true)
    protected PersonType person;
    
    /** The contact id. */
    protected Long contactID;
    
    /** The join status. */
    protected JoinStatusType joinStatus;
    
    /** The meeting key. */
    protected Long meetingKey;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The language. */
    protected String language;
    
    /** The role. */
    protected RoleType role;
    
    /** The email invitations. */
    @XmlElement(defaultValue = "false")
    protected Boolean emailInvitations;
    
    /** The locale. */
    protected String locale;
    
    /** The time zone id. */
    protected Long timeZoneID;
    
    /** The language id. */
    protected Long languageID;

    /**
     * Gets the person.
     * 
     * @return the person
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the person.
     * 
     * @param value the new person
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the contact id.
     * 
     * @return the contact id
     */
    public Long getContactID() {
        return contactID;
    }

    /**
     * Sets the contact id.
     * 
     * @param value the new contact id
     */
    public void setContactID(Long value) {
        this.contactID = value;
    }

    /**
     * Gets the join status.
     * 
     * @return the join status
     */
    public JoinStatusType getJoinStatus() {
        return joinStatus;
    }

    /**
     * Sets the join status.
     * 
     * @param value the new join status
     */
    public void setJoinStatus(JoinStatusType value) {
        this.joinStatus = value;
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

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the language.
     * 
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     * 
     * @param value the new language
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the role.
     * 
     * @return the role
     */
    public RoleType getRole() {
        return role;
    }

    /**
     * Sets the role.
     * 
     * @param value the new role
     */
    public void setRole(RoleType value) {
        this.role = value;
    }

    /**
     * Checks if is email invitations.
     * 
     * @return the boolean
     */
    public Boolean isEmailInvitations() {
        return emailInvitations;
    }

    /**
     * Sets the email invitations.
     * 
     * @param value the new email invitations
     */
    public void setEmailInvitations(Boolean value) {
        this.emailInvitations = value;
    }

    /**
     * Gets the locale.
     * 
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the locale.
     * 
     * @param value the new locale
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the language id.
     * 
     * @return the language id
     */
    public Long getLanguageID() {
        return languageID;
    }

    /**
     * Sets the language id.
     * 
     * @param value the new language id
     */
    public void setLanguageID(Long value) {
        this.languageID = value;
    }

}
