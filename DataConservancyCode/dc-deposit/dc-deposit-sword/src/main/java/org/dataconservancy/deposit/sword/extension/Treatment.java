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
package org.dataconservancy.deposit.sword.extension;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.apache.abdera.model.ElementWrapper;

/**
 * sword:treatment element.
 * <p>
 * MAY be included in collection element. Used for a human-readable statement
 * about what treatment the deposited resource will receive.
 * </p>
 * <p>
 * MUST be present in atom entry documents and contain either a human-readable
 * statement describing treatment the deposited resource has received or a
 * URI that dereferences to such a description.
 * </p>
 * <p>
 * Found in:
 * <ul>
 * <li>app:collection</li>
 * <li>atom:entry</li>
 * </ul>
 * </p>
 */
public class Treatment extends ElementWrapper {

    public Treatment(Element internal) {
        super(internal);
    }

    public Treatment(Factory factory, QName qname) {
        super(factory, qname);
    }

    /**
     * Specify a treatment.
     *
     * @param value Text containing human description, \
     *              or a link to a document that does.
     */
    public void setTreatment(String value) {
        setText(value);
    }

    /**
     * Get the current treatment
     */
    public String getTreatment() {
        return getText();
    }

}
