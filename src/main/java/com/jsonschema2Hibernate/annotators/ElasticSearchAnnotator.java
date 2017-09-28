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

import org.springframework.data.elasticsearch.annotations.Document;

public class ElasticSearchAnnotator extends AbstractAnnotator {

	public ElasticSearchAnnotator(GenerationConfig generationConfig) {
		super(generationConfig);
	}

	@Override
	public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {

	

	}

	@Override
	public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
		clazz.annotate(Document.class).param("indexName", clazz.name().trim());
	}

	@Override
	public void enumConstant(JEnumConstant constant, String value) {
		 constant.annotate(SerializedName.class).param("value", value);
	}

}
