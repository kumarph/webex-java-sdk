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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.WebACDRoleType;
import com.webex.schemas._2002._06.service.ep.ListControlType;


/**
 * The Class GetWebACDQueues.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWebACDQueues", propOrder = {
    "webExId",
    "type",
    "listControl"
})
public class GetWebACDQueues
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The web ex id. */
    protected String webExId;
    
    /** The type. */
    protected WebACDRoleType type;
    
    /** The list control. */
    protected ListControlType listControl;

    /**
     * Gets the web ex id.
     * 
     * @return the web ex id
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the web ex id.
     * 
     * @param value the new web ex id
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public WebACDRoleType getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public void setType(WebACDRoleType value) {
        this.type = value;
    }

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public ListControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(ListControlType value) {
        this.listControl = value;
    }

}
