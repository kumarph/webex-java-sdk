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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AndSelectionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "and_selectionType", propOrder = {
    "selectionMetadataOrAndSelectionOrOrSelection"
})
public class AndSelectionType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The selection metadata or and selection or or selection. */
    @XmlElements({
        @XmlElement(name = "and_selection", type = AndSelectionType.class),
        @XmlElement(name = "not_selection", type = NotSelectionType.class),
        @XmlElement(name = "selection_metadata", type = SelectionMetadataType.class),
        @XmlElement(name = "or_selection", type = OrSelectionType.class)
    })
    protected List<Object> selectionMetadataOrAndSelectionOrOrSelection;

    /**
     * Gets the selection metadata or and selection or or selection.
     * 
     * @return the selection metadata or and selection or or selection
     */
    public List<Object> getSelectionMetadataOrAndSelectionOrOrSelection() {
        if (selectionMetadataOrAndSelectionOrOrSelection == null) {
            selectionMetadataOrAndSelectionOrOrSelection = new ArrayList<Object>();
        }
        return this.selectionMetadataOrAndSelectionOrOrSelection;
    }

}
