/*
 * Copyright 2013 The Trustees of Indiana University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dataconservancy.dcs.access.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class GoogleDetails
        implements IsSerializable {

    private String clientId;
    private String googleAuthUrl;
    public GoogleDetails() {

    }
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getGoogleAuthUrl() {
		return googleAuthUrl;
	}
	public void setGoogleAuthUrl(String googleAuthUrl) {
		this.googleAuthUrl = googleAuthUrl;
	}

   
}
