package com.jsonschema2Hibernate.example;

import com.jsonschema2Hibernate.settings.annotators.DefaultGenerationConfig;
import com.jsonschema2Hibernate.settings.annotators.SourceType;

public class MyConfig extends DefaultGenerationConfig {
   
	public SourceType getSourceType() {
        return SourceType.JSONSCHEMA;
    }
	
	@Override
	public boolean isSerializable() {
		return false;
	}

	@Override
	public boolean isUseLongIntegers() {
		return true;
	}
	
	@Override
	public boolean isUseBigDecimals() {
		return true;
	}
	
	@Override
	public boolean isInitializeCollections() {
		return true;
	}
	
	@Override
	public boolean isIncludeAdditionalProperties() {
		return false;
	}
	
	@Override
	public boolean isIncludeConstructors() {
		return true;
	}
	
	@Override
	public boolean isIncludeAccessors() {
		return true;
	}
	
	
	@Override
	public boolean isGenerateBuilders() {
		return true;
	}
	
	@Override
	public boolean isParcelable() {
		return false;
	}
	
	
	@Override
	public boolean isIncludeJsr305Annotations() {
		return true;
	}
	
	@Override
	public boolean isIncludeJsr303Annotations() {
		return false;
	}
	
	
	
	/*@Override
    public char[] getPropertyWordDelimiters() {
        return "-_".toCharArray();
    }*/

	
}