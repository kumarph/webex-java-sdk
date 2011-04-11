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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SalesSmeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesSmeType", propOrder = {
    "description",
    "products"
})
public class SalesSmeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The description. */
    protected String description;
    
    /** The products. */
    protected SalesProductsType products;

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the products.
     * 
     * @return the products
     */
    public SalesProductsType getProducts() {
        return products;
    }

    /**
     * Sets the products.
     * 
     * @param value the new products
     */
    public void setProducts(SalesProductsType value) {
        this.products = value;
    }

}
