
package org.test.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Product Type
 * <p>
 * 
 * 
 */
@Entity
@Table(name = "ProductType")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long typeId;
    private String type;
    private Long price;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductType() {
    }

    /**
     * 
     * @param price
     * @param typeId
     * @param type
     */
    public ProductType(Long typeId, String type, Long price) {
        super();
        this.typeId = typeId;
        this.type = type;
        this.price = price;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public ProductType withTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductType withType(String type) {
        this.type = type;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public ProductType withPrice(Long price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("typeId", typeId).append("type", type).append("price", price).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(typeId).append(type).append(price).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductType) == false) {
            return false;
        }
        ProductType rhs = ((ProductType) other);
        return new EqualsBuilder().append(typeId, rhs.typeId).append(type, rhs.type).append(price, rhs.price).isEquals();
    }

}
