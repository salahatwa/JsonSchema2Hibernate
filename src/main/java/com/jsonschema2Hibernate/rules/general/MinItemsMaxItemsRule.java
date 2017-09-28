/**
 * Copyright © 2010-2017 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jsonschema2Hibernate.rules.general;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.JsonNode;
import com.jsonschema2Hibernate.settings.rules.Rule;
import com.jsonschema2Hibernate.settings.rules.RuleFactory;
import com.jsonschema2Hibernate.settings.schema.Schema;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JFieldVar;

public class MinItemsMaxItemsRule extends Rule<JFieldVar, JFieldVar> {

    private final RuleFactory ruleFactory;

    public MinItemsMaxItemsRule(RuleFactory ruleFactory) {
        this.ruleFactory = ruleFactory;
    }

    
    public JFieldVar apply(String nodeName, JsonNode node, JFieldVar field, Schema currentSchema) {

        if (ruleFactory.getGenerationConfig().isIncludeJsr303Annotations()
                && (node.has("minItems") || node.has("maxItems"))) {

            JAnnotationUse annotation = field.annotate(Size.class);

            if (node.has("minItems")) {
                annotation.param("min", node.get("minItems").asInt());
            }

            if (node.has("maxItems")) {
                annotation.param("max", node.get("maxItems").asInt());
            }
        }

        return field;
    }

}
