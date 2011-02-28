//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;


/**
 * <p>Java class for meetingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="accessControl" type="{http://www.webex.com/schemas/2002/06/service/meeting}accessControlType" minOccurs="0"/>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/meeting}metaDataType" minOccurs="0"/>
 *         &lt;element name="participants" type="{http://www.webex.com/schemas/2002/06/service/meeting}participantsType" minOccurs="0"/>
 *         &lt;element name="enableOptions" type="{http://www.webex.com/schemas/2002/06/service/meeting}enableOptionsType" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://www.webex.com/schemas/2002/06/service/meeting}scheduleType" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/meeting}telephonyType" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="repeat" type="{http://www.webex.com/schemas/2002/06/service/meeting}repeatType" minOccurs="0"/>
 *         &lt;element name="remind" type="{http://www.webex.com/schemas/2002/06/service/meeting}remindType" minOccurs="0"/>
 *         &lt;element name="attendeeOptions" type="{http://www.webex.com/schemas/2002/06/service/meeting}attendeeOptionsType" minOccurs="0"/>
 *         &lt;element name="assistService" type="{http://www.webex.com/schemas/2002/06/service}meetingAssistType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingType", propOrder = {
    "accessControl",
    "metaData",
    "participants",
    "enableOptions",
    "schedule",
    "telephony",
    "tracking",
    "repeat",
    "remind",
    "attendeeOptions",
    "assistService"
})
public class MeetingType
    extends BodyContentType
{

    protected AccessControlType accessControl;
    protected MetaDataType metaData;
    protected ParticipantsType participants;
    protected EnableOptionsType enableOptions;
    protected ScheduleType schedule;
    protected TelephonyType telephony;
    protected TrackingType tracking;
    protected RepeatType repeat;
    protected RemindType remind;
    protected AttendeeOptionsType attendeeOptions;
    protected MeetingAssistType assistService;

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlType }
     *     
     */
    public AccessControlType getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlType }
     *     
     */
    public void setAccessControl(AccessControlType value) {
        this.accessControl = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the value of the enableOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EnableOptionsType }
     *     
     */
    public EnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the value of the enableOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableOptionsType }
     *     
     */
    public void setEnableOptions(EnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyType }
     *     
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyType }
     *     
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTracking(TrackingType value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatType }
     *     
     */
    public RepeatType getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatType }
     *     
     */
    public void setRepeat(RepeatType value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the remind property.
     * 
     * @return
     *     possible object is
     *     {@link RemindType }
     *     
     */
    public RemindType getRemind() {
        return remind;
    }

    /**
     * Sets the value of the remind property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemindType }
     *     
     */
    public void setRemind(RemindType value) {
        this.remind = value;
    }

    /**
     * Gets the value of the attendeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the value of the attendeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
    }

    /**
     * Gets the value of the assistService property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingAssistType }
     *     
     */
    public MeetingAssistType getAssistService() {
        return assistService;
    }

    /**
     * Sets the value of the assistService property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingAssistType }
     *     
     */
    public void setAssistService(MeetingAssistType value) {
        this.assistService = value;
    }

}