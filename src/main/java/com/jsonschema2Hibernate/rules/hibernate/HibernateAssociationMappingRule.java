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

import java.util.Iterator;
import java.util.Map;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.xmlunit.util.Nodes;

import com.fasterxml.jackson.databind.JsonNode;
import com.jsonschema2Hibernate.settings.rules.Rule;
import com.jsonschema2Hibernate.settings.schema.Schema;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;

public class HibernateAssociationMappingRule extends Rule<JFieldVar, JDefinedClass> {

	public void apply(String nodeName, JsonNode node, JFieldVar field, JDefinedClass jclass, Schema currentSchema) {

		// JAnnotationUse annotation = field.annotate(Pattern.class);
		// annotation.param("regexp", node.asText());

		
		
		
		
		System.err.println("::" + node.asText());
		System.err.println("!::" + node.textValue());
		System.err.println(":::" + nodeName+"*");
		System.err.println("::::" + node.isPojo());
		System.err.println("!::::" + node.isObject());
		System.err.println("@:::"+jclass.fullName()+":::"+jclass.name());
		
		getAssociationMapFactory(HibernateAssosiationMapTypes.MANY_TO_MANY, nodeName, node, field,jclass);

	}

	/**
	 * This Factory To Switch Hiberenate Relationship
	 * @param mapType
	 * @param nodeName
	 * @param node
	 * @param field
	 */
	public void getAssociationMapFactory(HibernateAssosiationMapTypes mapType, String nodeName, JsonNode node,
			JFieldVar field,JDefinedClass jclass) {
		switch (mapType) {
		case MANY_TO_MANY: {

			// @JoinTable(
			// name = "jhi_user_authority",
			// joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
			// inverseJoinColumns = {@JoinColumn(name = "authority_name",
			// referencedColumnName = "name")})

			//
			String parentID=node.asText().substring(0,node.asText().indexOf("::"));
			String childID=node.asText().substring(node.asText().indexOf("::")+2, node.asText().length());
			
			System.out.println("!!!!!!!!!!!"+parentID+"\n"+childID);
			
			field.annotate(ManyToMany.class);
			JAnnotationUse joinTable = field.annotate(JoinTable.class);
			joinTable.param("name", jclass.name()+"_"+nodeName);

			joinTable.paramArray("joinColumns").annotate(JoinColumn.class).param("name", jclass.name()+"_id")
					.param("referencedColumnName", parentID);
			joinTable.paramArray("inverseJoinColumns").annotate(JoinColumn.class).param("name", nodeName+"_id")
					.param("referencedColumnName", childID);

			break;
		}
		default:
			break;

		}
	}
	
	
		
}
