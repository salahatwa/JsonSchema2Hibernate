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

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.Iterator;

import com.jsonschema2Hibernate.annotators.NoopAnnotator;
import com.jsonschema2Hibernate.settings.rules.RuleFactory;


/**
 * A generation config that returns default values for all behavioural options.
 */
public class DefaultGenerationConfig implements GenerationConfig {

    /**
     * @return <code>false</code>
     */
    
    public boolean isGenerateBuilders() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isUsePrimitives() {
        return false;
    }

    /**
     * Unsupported since no default source is possible.
     */
    
    public Iterator<URL> getSource() {
        throw new UnsupportedOperationException("No default source available");
    }

    /**
     * @return the current working directory
     */
    
    public File getTargetDirectory() {
        return new File(".");
    }

    /**
     * @return the 'default' package (i.e. an empty string)
     */
    
    public String getTargetPackage() {
        return "";
    }

    /**
     * @return an empty array (i.e. no word delimiters)
     */
    
    public char[] getPropertyWordDelimiters() {
        return new char[] { '-', ' ', '_' };
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isUseLongIntegers() {
        return false;
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isUseDoubleNumbers() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isIncludeHashcodeAndEquals() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isIncludeToString() {
        return true;
    }
    
    /**
     * @return no exclusions
     */
    
    public String[] getToStringExcludes() {
        return new String[] {};
    }

    /**
     * @return {@link AnnotationStyle#JACKSON2}
     */
    
    public AnnotationStyle getAnnotationStyle() {
        return AnnotationStyle.JACKSON;
    }

    /**
     * @return {@link InclusionLevel#NON_NULL}
     */
    
    public InclusionLevel getInclusionLevel() {
        return InclusionLevel.NON_NULL;
    }

    /**
     * {@link NoopAnnotator}
     */
    
    public Class<? extends Annotator> getCustomAnnotator() {
        return NoopAnnotator.class;
    }

    
    public Class<? extends RuleFactory> getCustomRuleFactory() {
        return RuleFactory.class;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isIncludeJsr303Annotations() {
        return false;
    }

    
    public boolean isIncludeJsr305Annotations() {
        return false;
    }

    /**
     * @return {@link SourceType#JSONSCHEMA}
     */
    
    public SourceType getSourceType() {
        return SourceType.JSONSCHEMA;
    }

    /**
     * @return UTF-8
     */
    
    public String getOutputEncoding() {
        return "UTF-8";
    }

    /**
     * @return false
     */
    
    public boolean isRemoveOldOutput() {
        return false;
    }

    /**
     * @return false
     */
    
    public boolean isUseJodaDates() {
        return false;
    }

    /**
     * @return false
     */
    
    public boolean isUseJodaLocalDates() {
        return false;
    }

    /**
     * @return false
     */
    
    public boolean isUseJodaLocalTimes() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isUseCommonsLang3() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isParcelable() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isSerializable() {
        return false;
    }

    
    public FileFilter getFileFilter() {
        return new AllFileFilter();
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isInitializeCollections() {
        return true;
    }

    
    public String getClassNamePrefix() {
        return "";
    }

    
    public String getClassNameSuffix() {
        return "";
    }

    
    public String[] getFileExtensions() {
        return new String[] {};
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isUseBigIntegers() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isUseBigDecimals() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isIncludeConstructors() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isConstructorsRequiredPropertiesOnly() {
        return false;
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isIncludeAdditionalProperties() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    public boolean isIncludeAccessors() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isIncludeGetters() {
        return false;
    }

    /**
     * @return <code>true</code>
     */
    
    public boolean isIncludeSetters() {
        return false;
    }

    /**
     * @return <code>1.6</code>
     */
    
    public String getTargetVersion() {
        return "1.6";
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isIncludeDynamicAccessors() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isIncludeDynamicGetters() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isIncludeDynamicSetters() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isIncludeDynamicBuilders() {
        return false;
    }

    
    public String getDateTimeType() {
        return null;
    }

    
    public String getDateType() {
        return null;
    }

    
    public String getTimeType() {
        return null;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isFormatDateTimes() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isFormatDates() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    
    public boolean isFormatTimes() {
        return false;
    }

    /**
     * @return "#/."
     */
    
    public String getRefFragmentPathDelimiters() {
        return "#/.";
    }

    
    public String getCustomDatePattern() {
        return null;
    }

    
    public String getCustomTimePattern() {
        return null;
    }

    
    public String getCustomDateTimePattern() {
        return null;
    }

    /**
     * @return {@link SourceSortOrder#OS}
     */
    
    public SourceSortOrder getSourceSortOrder() {
        return SourceSortOrder.OS;
    }
}