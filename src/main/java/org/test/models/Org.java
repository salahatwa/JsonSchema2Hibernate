
package org.test.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Entity
@Table(name = "Org")
public class Org {

    private String organizationName;
    private String organizationUnit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Org() {
    }

    /**
     * 
     * @param organizationName
     * @param organizationUnit
     */
    public Org(String organizationName, String organizationUnit) {
        super();
        this.organizationName = organizationName;
        this.organizationUnit = organizationUnit;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Org withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    public Org withOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("organizationName", organizationName).append("organizationUnit", organizationUnit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationName).append(organizationUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Org) == false) {
            return false;
        }
        Org rhs = ((Org) other);
        return new EqualsBuilder().append(organizationName, rhs.organizationName).append(organizationUnit, rhs.organizationUnit).isEquals();
    }

}
