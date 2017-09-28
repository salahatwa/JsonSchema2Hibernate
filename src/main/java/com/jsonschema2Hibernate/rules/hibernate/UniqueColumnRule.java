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

package com.jsonschema2Hibernate.rules.hibernate;


import javax.persistence.Id;

import com.fasterxml.jackson.databind.JsonNode;
import com.jsonschema2Hibernate.settings.rules.Rule;
import com.jsonschema2Hibernate.settings.schema.Schema;
import com.sun.codemodel.JDocCommentable;
import com.sun.codemodel.JFieldVar;

/**
 * Applies the "uniqueColumn" schema rule.
 */
public class UniqueColumnRule extends Rule<JDocCommentable, JDocCommentable> {



	/**
	 * Applies This Rule Only when Field property 
	 * uniqueColumn value <code>true</code> 
	 * annotate Field With @Id
	 */

	public JDocCommentable apply(String nodeName, JsonNode node, JDocCommentable generatableType, Schema schema) {

		if ( generatableType instanceof JFieldVar && node.asBoolean())
		((JFieldVar) generatableType).annotate(Id.class);

		return generatableType;
	}
}
