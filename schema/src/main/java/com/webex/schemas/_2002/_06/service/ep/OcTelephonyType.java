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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.EntryExitToneType;


/**
 * The Class OcTelephonyType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocTelephonyType", propOrder = {
    "telephonySupport",
    "extTelephonyDescription",
    "tspAccountIndex",
    "personalAccountIndex",
    "intlLocalCallIn",
    "tollfree",
    "entryExitTone",
    "isMPAudio"
})
public class OcTelephonyType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The telephony support. */
    @XmlElement(required = true)
    protected TelephonySupportType telephonySupport;
    
    /** The ext telephony description. */
    protected String extTelephonyDescription;
    
    /** The tsp account index. */
    protected Integer tspAccountIndex;
    
    /** The personal account index. */
    protected Integer personalAccountIndex;
    
    /** The intl local call in. */
    protected Boolean intlLocalCallIn;
    
    /** The tollfree. */
    protected Boolean tollfree;
    
    /** The entry exit tone. */
    protected EntryExitToneType entryExitTone;
    
    /** The is mp audio. */
    protected Boolean isMPAudio;

    /**
     * Gets the telephony support.
     * 
     * @return the telephony support
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the telephony support.
     * 
     * @param value the new telephony support
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Gets the ext telephony description.
     * 
     * @return the ext telephony description
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the ext telephony description.
     * 
     * @param value the new ext telephony description
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
    }

    /**
     * Gets the tsp account index.
     * 
     * @return the tsp account index
     */
    public Integer getTspAccountIndex() {
        return tspAccountIndex;
    }

    /**
     * Sets the tsp account index.
     * 
     * @param value the new tsp account index
     */
    public void setTspAccountIndex(Integer value) {
        this.tspAccountIndex = value;
    }

    /**
     * Gets the personal account index.
     * 
     * @return the personal account index
     */
    public Integer getPersonalAccountIndex() {
        return personalAccountIndex;
    }

    /**
     * Sets the personal account index.
     * 
     * @param value the new personal account index
     */
    public void setPersonalAccountIndex(Integer value) {
        this.personalAccountIndex = value;
    }

    /**
     * Checks if is intl local call in.
     * 
     * @return the boolean
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the intl local call in.
     * 
     * @param value the new intl local call in
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

    /**
     * Checks if is tollfree.
     * 
     * @return the boolean
     */
    public Boolean isTollfree() {
        return tollfree;
    }

    /**
     * Sets the tollfree.
     * 
     * @param value the new tollfree
     */
    public void setTollfree(Boolean value) {
        this.tollfree = value;
    }

    /**
     * Gets the entry exit tone.
     * 
     * @return the entry exit tone
     */
    public EntryExitToneType getEntryExitTone() {
        return entryExitTone;
    }

    /**
     * Sets the entry exit tone.
     * 
     * @param value the new entry exit tone
     */
    public void setEntryExitTone(EntryExitToneType value) {
        this.entryExitTone = value;
    }

    /**
     * Checks if is is mp audio.
     * 
     * @return the boolean
     */
    public Boolean isIsMPAudio() {
        return isMPAudio;
    }

    /**
     * Sets the checks if is mp audio.
     * 
     * @param value the new checks if is mp audio
     */
    public void setIsMPAudio(Boolean value) {
        this.isMPAudio = value;
    }

}
