
package org.test.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * A representation of a person, company, organization, or place
 * 
 */
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Formatted Name
     * 
     */
    private String fn;
    @NotNull
    private String familyName;
    @NotNull
    private String givenName;
    private List<String> additionalName = new ArrayList<String>();
    private List<String> honorificPrefix = new ArrayList<String>();
    private List<String> honorificSuffix = new ArrayList<String>();
    private String nickname;
    private String url;
    @ManyToMany
    @JoinTable(name = "Product_productType", joinColumns = {
        @JoinColumn(name = "Product_id", referencedColumnName = "id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "productType_id", referencedColumnName = "type_id")
    })
    private List<ProductType> productType = new ArrayList<ProductType>();
    private Tel tel;
    private String tz;
    private String photo;
    private String logo;
    private String sound;
    private String bday;
    private String title;
    private String role;
    private Org org;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param role
     * @param org
     * @param tz
     * @param givenName
     * @param sound
     * @param fn
     * @param honorificPrefix
     * @param photo
     * @param title
     * @param url
     * @param honorificSuffix
     * @param bday
     * @param familyName
     * @param nickname
     * @param logo
     * @param tel
     * @param id
     * @param additionalName
     * @param productType
     */
    public Product(Long id, String fn, String familyName, String givenName, List<String> additionalName, List<String> honorificPrefix, List<String> honorificSuffix, String nickname, String url, List<ProductType> productType, Tel tel, String tz, String photo, String logo, String sound, String bday, String title, String role, Org org) {
        super();
        this.id = id;
        this.fn = fn;
        this.familyName = familyName;
        this.givenName = givenName;
        this.additionalName = additionalName;
        this.honorificPrefix = honorificPrefix;
        this.honorificSuffix = honorificSuffix;
        this.nickname = nickname;
        this.url = url;
        this.productType = productType;
        this.tel = tel;
        this.tz = tz;
        this.photo = photo;
        this.logo = logo;
        this.sound = sound;
        this.bday = bday;
        this.title = title;
        this.role = role;
        this.org = org;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Formatted Name
     * 
     */
    public String getFn() {
        return fn;
    }

    /**
     * Formatted Name
     * 
     */
    public void setFn(String fn) {
        this.fn = fn;
    }

    public Product withFn(String fn) {
        this.fn = fn;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Product withFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public Product withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    public List<String> getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(List<String> additionalName) {
        this.additionalName = additionalName;
    }

    public Product withAdditionalName(List<String> additionalName) {
        this.additionalName = additionalName;
        return this;
    }

    public List<String> getHonorificPrefix() {
        return honorificPrefix;
    }

    public void setHonorificPrefix(List<String> honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
    }

    public Product withHonorificPrefix(List<String> honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
        return this;
    }

    public List<String> getHonorificSuffix() {
        return honorificSuffix;
    }

    public void setHonorificSuffix(List<String> honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
    }

    public Product withHonorificSuffix(List<String> honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Product withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product withUrl(String url) {
        this.url = url;
        return this;
    }

    public List<ProductType> getProductType() {
        return productType;
    }

    public void setProductType(List<ProductType> productType) {
        this.productType = productType;
    }

    public Product withProductType(List<ProductType> productType) {
        this.productType = productType;
        return this;
    }

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

    public Product withTel(Tel tel) {
        this.tel = tel;
        return this;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public Product withTz(String tz) {
        this.tz = tz;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Product withPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Product withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Product withSound(String sound) {
        this.sound = sound;
        return this;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public Product withBday(String bday) {
        this.bday = bday;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Product withRole(String role) {
        this.role = role;
        return this;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public Product withOrg(Org org) {
        this.org = org;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("fn", fn).append("familyName", familyName).append("givenName", givenName).append("additionalName", additionalName).append("honorificPrefix", honorificPrefix).append("honorificSuffix", honorificSuffix).append("nickname", nickname).append("url", url).append("productType", productType).append("tel", tel).append("tz", tz).append("photo", photo).append("logo", logo).append("sound", sound).append("bday", bday).append("title", title).append("role", role).append("org", org).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(fn).append(familyName).append(givenName).append(additionalName).append(honorificPrefix).append(honorificSuffix).append(nickname).append(url).append(productType).append(tel).append(tz).append(photo).append(logo).append(sound).append(bday).append(title).append(role).append(org).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(id, rhs.id).append(fn, rhs.fn).append(familyName, rhs.familyName).append(givenName, rhs.givenName).append(additionalName, rhs.additionalName).append(honorificPrefix, rhs.honorificPrefix).append(honorificSuffix, rhs.honorificSuffix).append(nickname, rhs.nickname).append(url, rhs.url).append(productType, rhs.productType).append(tel, rhs.tel).append(tz, rhs.tz).append(photo, rhs.photo).append(logo, rhs.logo).append(sound, rhs.sound).append(bday, rhs.bday).append(title, rhs.title).append(role, rhs.role).append(org, rhs.org).isEquals();
    }

}
