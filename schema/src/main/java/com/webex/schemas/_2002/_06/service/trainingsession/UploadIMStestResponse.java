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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class UploadIMStestResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadIMStestResponse", propOrder = {
    "testID"
})
public class UploadIMStestResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The test id. */
    protected Long testID;

    /**
     * Gets the test id.
     * 
     * @return the test id
     */
    public Long getTestID() {
        return testID;
    }

    /**
     * Sets the test id.
     * 
     * @param value the new test id
     */
    public void setTestID(Long value) {
        this.testID = value;
    }

}
