/*
 * Copyright 2012 Johns Hopkins University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dataconservancy.ui.eventing.api;

/**
 * Acts on events that are fired by its {@link EventManager}.
 */
public interface EventListener {

    /**
     * A short name describing this listener.
     *
     * @return the name
     */
    public String getName();

    /**
     * Handle the supplied event.
     *
     * @param eventContext the event context
     * @param event the event object
     */
    public void handleEvent(EventContext eventContext, Event<?> event);
    
}
