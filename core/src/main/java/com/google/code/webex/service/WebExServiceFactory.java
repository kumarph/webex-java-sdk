/*
 * Copyright 2010 Nabeel Mukhtar 
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
package com.google.code.webex.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.webex.service.impl.MeetingServiceImpl;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class WebExServiceFactory {

    /** The Constant factoriesMap. */
    private static final Map<WebExConsumer, WebExServiceFactory> factoriesMap =
        new ConcurrentHashMap<WebExConsumer, WebExServiceFactory>();
    
    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The api consumer. */
    private WebExConsumer apiConsumer;

    /**
     * Instantiates a new linked in api client factory.
     * 
     * @param apiConsumer the api consumer
     */
	private WebExServiceFactory(WebExConsumer apiConsumer) {
        this.apiConsumer = apiConsumer;
    }
	
    /**
     * Sets the task executor to be used for asynchronous API calls.
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param consumerKey the consumer key
     * @param consumerSecret the consumer secret
     * 
     * @return the linked in api client factory
     */
    public static WebExServiceFactory newInstance(String webExId, String password, Long siteId, String siteName, String partnerId) {
        return newInstance(new WebExConsumer(webExId, password, siteId, siteName, partnerId));
    }

    /**
     * New instance.
     * 
     * @param apiConsumer the api consumer
     * 
     * @return the linked in api client factory
     */
    public static synchronized WebExServiceFactory newInstance(WebExConsumer apiConsumer) {
        WebExServiceFactory factory = factoriesMap.get(apiConsumer);

        if (factory == null) {
            factory = new WebExServiceFactory(apiConsumer);
            factoriesMap.put(apiConsumer, factory);
        }

        return factory;
    }

    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @return the linked in api client
     */
	public MeetingService createMeetingService() {
		return new MeetingServiceImpl(apiConsumer.getWebExId(), apiConsumer.getPassword(), apiConsumer.getSiteId(), apiConsumer.getSiteName(), apiConsumer.getPartnerId());
    }
}