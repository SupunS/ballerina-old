/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.ballerina.core.model.types;

import org.wso2.ballerina.core.model.Connector;

/**
 * {@code ConnectorType} represents a  Connector
 *
 * @since 1.0.0
 */
public class ConnectorType extends TypeC {
    /**
     * Create a type from the given name
     *
     * @param typeName string name of the type
     */
    protected ConnectorType(String typeName) {
        super(typeName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Connector) {
            Connector connector = (Connector) obj;
            //  typeName.equals(connector)
        }
        return false;
    }
}
