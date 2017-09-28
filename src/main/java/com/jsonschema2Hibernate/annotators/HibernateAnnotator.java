package com.jsonschema2Hibernate.annotators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.metamodel.domain.JavaType;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jsonschema2Hibernate.settings.annotators.AbstractAnnotator;
import com.jsonschema2Hibernate.settings.annotators.GenerationConfig;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JFormatter;
import com.sun.codemodel.JType;

public class HibernateAnnotator extends AbstractAnnotator {

	public HibernateAnnotator(GenerationConfig generationConfig) {
		super(generationConfig);
	}

	@Override
	public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {

		/**
		 * JDefinedClass clazz Parent class
		 */
		
		
//		if (propertyName.equals("id")) {
//			field.annotate(Id.class);
//			field.annotate(GeneratedValue.class).param("strategy", GenerationType.AUTO);
//		}else if (field.type().erasure().equals(field.type().owner().ref(List.class))) {
//            field.annotate(Column.class).param("as", clazz);
//            
//          
//            field.annotate(ManyToMany.class).param("fetch", FetchType.EAGER).param("cascade", CascadeType.ALL ).param("target", field.type());
//		    field.annotate(Column.class).param("target",field);
//		
//		}
//		else if(field.type().erasure().elementType().  isReference())
//		{
//			 field.annotate(Column.class).param("as", "hhhhhhhhhhhhhhhhhhhhhhhhhh");
//			@OneToMany(fetch = FetchType.EAGER , targetEntity = WorkExperince.class, cascade = { CascadeType.ALL  })
//			@JoinColumn(name = "employee_id")
//		}
//			else {
//
//			field.annotate(Column.class).param("name", propertyName).param("nullable", false);
//		}

		// field.annotate(Expose.class);
	}

	@Override
	public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
		clazz.annotate(Entity.class);
		clazz.annotate(Table.class).param("name", clazz.name().trim());
	}

	@Override
	public void enumConstant(JEnumConstant constant, String value) {
		 constant.annotate(SerializedName.class).param("value", value);
	}

}
