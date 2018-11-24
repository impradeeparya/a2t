package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institutes")
public class Institute {

  @Id
  @Column(name = "institute_id")
  private Long id;
  @Column(name = "institute_name")
  private String name;
  @Column(name = "institute_desc")
  private String description;
  @Column(name = "institute_web")
  private String web;
  @Column(name = "institute_email")
  private String email;
  @Column(name = "institute_logo_name")
  private String logoName;
  @Column(name = "institute_logo_loc")
  private String logoLoc;
  @Column(name = "institute_image")
  private String image;
  @Column(name = "contact_person")
  private String contactPerson;
  @Column(name = "contact_pers_email")
  private String contactPersonEmail;
  @Column(name = "contact_person_mobile")
  private String contactPersonMobile;

  public Long getId() {
    return id;
  }

  public Institute setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Institute setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Institute setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getWeb() {
    return web;
  }

  public Institute setWeb(String web) {
    this.web = web;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public Institute setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getLogoName() {
    return logoName;
  }

  public Institute setLogoName(String logoName) {
    this.logoName = logoName;
    return this;
  }

  public String getLogoLoc() {
    return logoLoc;
  }

  public Institute setLogoLoc(String logoLoc) {
    this.logoLoc = logoLoc;
    return this;
  }

  public String getImage() {
    return image;
  }

  public Institute setImage(String image) {
    this.image = image;
    return this;
  }

  public String getContactPerson() {
    return contactPerson;
  }

  public Institute setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  public String getContactPersonEmail() {
    return contactPersonEmail;
  }

  public Institute setContactPersonEmail(String contactPersonEmail) {
    this.contactPersonEmail = contactPersonEmail;
    return this;
  }

  public String getContactPersonMobile() {
    return contactPersonMobile;
  }

  public Institute setContactPersonMobile(String contactPersonMobile) {
    this.contactPersonMobile = contactPersonMobile;
    return this;
  }
}
