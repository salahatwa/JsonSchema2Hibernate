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

package com.jsonschema2Hibernate.settings.annotators;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;

/**
 * A default implementation of the Annotator interface that makes it easier to
 * plug in different Annotator implementations.
 * <p>
 * Annotators that need the generation configuration should add a constructor
 * with {@link GenerationConfig} arg. Annotators that don't need the
 * configuration need only add a default constructor.
 */
public abstract class AbstractAnnotator implements Annotator {

    private GenerationConfig generationConfig;

    public AbstractAnnotator() {
    }

    public AbstractAnnotator(GenerationConfig generationConfig) {
        this.generationConfig = generationConfig;
    }

    public void propertyOrder(JDefinedClass clazz, JsonNode propertiesNode) {
    }

    public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
    }

    public void propertyField(JFieldVar field, JDefinedClass clazz,
            String propertyName, JsonNode propertyNode) {
    }

    public void propertyGetter(JMethod getter, String propertyName) {
    }

    public void propertySetter(JMethod setter, String propertyName) {
    }

    public void anyGetter(JMethod getter) {
    }

    public void anySetter(JMethod setter) {
    }

    public void enumCreatorMethod(JMethod creatorMethod) {
    }

    public void enumValueMethod(JMethod valueMethod) {
    }

    public void enumConstant(JEnumConstant constant, String value) {
    }

    public boolean isAdditionalPropertiesSupported() {
        return true;
    }

    public void additionalPropertiesField(JFieldVar field, JDefinedClass clazz, String propertyName) {
    }

    public GenerationConfig getGenerationConfig() {
        return generationConfig;
    }

    public void dateField(JFieldVar field, JsonNode node) {
    }

    public void timeField(JFieldVar field, JsonNode node) {
    }

    public void dateTimeField(JFieldVar field, JsonNode node) {
    }
}
