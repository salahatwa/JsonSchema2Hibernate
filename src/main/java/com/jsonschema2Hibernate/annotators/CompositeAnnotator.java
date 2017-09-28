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

package com.jsonschema2Hibernate.annotators;

import com.fasterxml.jackson.databind.JsonNode;
import com.jsonschema2Hibernate.settings.annotators.Annotator;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;

/**
 * An annotator (implementing the composite pattern) that can be used to compose
 * many annotators together.
 */
public class CompositeAnnotator implements Annotator {

    final Annotator[] annotators;

    /**
     * Create a new composite annotator, made up of a given set of child
     * annotators.
     *
     * @param annotators
     *            The annotators that will be called whenever this annotator is
     *            called. The child annotators provided will called in the order
     *            that they appear in this argument list.
     */
    public CompositeAnnotator(Annotator... annotators) {
        this.annotators = annotators;
    }

    
    public void propertyOrder(JDefinedClass clazz, JsonNode propertiesNode) {
        for (Annotator annotator : annotators) {
            annotator.propertyOrder(clazz, propertiesNode);
        }
    }

    
    public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
        for (Annotator annotator : annotators) {
            annotator.propertyInclusion(clazz, schema);
        }
    }

    
    public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {
        for (Annotator annotator : annotators) {
            annotator.propertyField(field, clazz, propertyName, propertyNode);
        }
    }

    
    public void propertyGetter(JMethod getter, String propertyName) {
        for (Annotator annotator : annotators) {
            annotator.propertyGetter(getter, propertyName);
        }
    }

    
    public void propertySetter(JMethod setter, String propertyName) {
        for (Annotator annotator : annotators) {
            annotator.propertySetter(setter, propertyName);
        }
    }

    
    public void anyGetter(JMethod getter) {
        for (Annotator annotator : annotators) {
            annotator.anyGetter(getter);
        }
    }

    
    public void anySetter(JMethod setter) {
        for (Annotator annotator : annotators) {
            annotator.anySetter(setter);
        }
    }

    
    public void enumCreatorMethod(JMethod creatorMethod) {
        for (Annotator annotator : annotators) {
            annotator.enumCreatorMethod(creatorMethod);
        }
    }

    
    public void enumValueMethod(JMethod valueMethod) {
        for (Annotator annotator : annotators) {
            annotator.enumValueMethod(valueMethod);
        }
    }

    
    public void enumConstant(JEnumConstant constant, String value) {
        for (Annotator annotator : annotators) {
            annotator.enumConstant(constant, value);
        }
    }

    
    public boolean isAdditionalPropertiesSupported() {
        for (Annotator annotator : annotators) {
            if (!annotator.isAdditionalPropertiesSupported()) {
                return false;
            }
        }
        return true;
    }

    
    public void additionalPropertiesField(JFieldVar field, JDefinedClass clazz, String propertyName) {
        for (Annotator annotator : annotators) {
            annotator.additionalPropertiesField(field, clazz, propertyName);
        }
    }

   
   public void dateTimeField(JFieldVar field, JsonNode propertyNode) {
      for (Annotator annotator : annotators) {
            annotator.dateTimeField(field, propertyNode);
        }
   }

   
   public void dateField(JFieldVar field, JsonNode propertyNode) {
      for (Annotator annotator : annotators) {
            annotator.dateField(field, propertyNode);
        }
   }

    
    public void timeField(JFieldVar field, JsonNode propertyNode) {
        for (Annotator annotator : annotators) {
            annotator.timeField(field, propertyNode);
        }
    }
}
