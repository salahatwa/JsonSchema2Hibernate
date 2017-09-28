package com.jsonschema2Hibernate.example;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import com.jsonschema2Hibernate.annotators.HibernateAnnotator;
import com.jsonschema2Hibernate.settings.rules.RuleFactory;
import com.jsonschema2Hibernate.settings.schema.SchemaGenerator;
import com.jsonschema2Hibernate.settings.schema.SchemaMapper;
import com.jsonschema2Hibernate.settings.schema.SchemaStore;
import com.sun.codemodel.JCodeModel;


public class MainAPP {

	public static void main(String[] args) throws IOException, URISyntaxException {

		// BEGIN EXAMPLE

		JCodeModel codeModel = new JCodeModel();
		
		URI schemaUri = MainAPP.class.getClass().getResource("/schema/card.json").toURI();
		
		MyConfig generationConfig = new MyConfig();
//		DefaultGenerationConfig generationConfig=new DefaultGenerationConfig();
		RuleFactory ruleFactory = new RuleFactory(generationConfig, new HibernateAnnotator(generationConfig), new SchemaStore());
		
//		RuleFactory ruleFactory = new RuleFactory(generationConfig, new HibernateAnnotator(generationConfig),new SchemaStore() );
		
		ruleFactory.getDefaultRule();
		SchemaGenerator generator = new SchemaGenerator();
		
		SchemaMapper mapper = new SchemaMapper(ruleFactory, generator);

		mapper.generate(codeModel, "Address", "org.test", schemaUri.toURL());
		
		File file2 = new File("Test");

		if (!file2.exists()) {
			file2.mkdirs();
		}
		
		codeModel.build(file2);

		// END EXAMPLE

	}


}
