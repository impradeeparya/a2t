package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contributor_profile")
public class ContributorProfile {

  @Id
  @Column(name = "contributor_id")
  private Long id;
  @Column(name = "contributor_name")
  private String name;
  @Column(name = "contributor_email")
  private String email;
  @Column(name = "contributor_mobile")
  private String mobile;
  @ManyToOne
  @JoinColumn(name = "contributor_company")
  private Company company;
  @Column(name = "contributor_highest_qual")
  private String highestQualification;
  @Column(name = "contributor_exp_yrs")
  private int exp;
  @ManyToOne
  @JoinColumn(name = "contributor_location_id")
  private Location location;
  @Column(name = "contributor_skills")
  private String skill;
  @Column(name = "contributor_pic")
  private String pic;
  @Column(name = "contributor_designation")
  private String designation;
  @Column(name = "contributor_about")
  private String about;

  public Long getId() {
    return id;
  }

  public ContributorProfile setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public ContributorProfile setName(String name) {
    this.name = name;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public ContributorProfile setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public ContributorProfile setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public Company getCompany() {
    return company;
  }

  public ContributorProfile setCompany(Company company) {
    this.company = company;
    return this;
  }

  public String getHighestQualification() {
    return highestQualification;
  }

  public ContributorProfile setHighestQualification(String highestQualification) {
    this.highestQualification = highestQualification;
    return this;
  }

  public int getExp() {
    return exp;
  }

  public ContributorProfile setExp(int exp) {
    this.exp = exp;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public ContributorProfile setLocation(Location location) {
    this.location = location;
    return this;
  }

  public String getSkill() {
    return skill;
  }

  public ContributorProfile setSkill(String skill) {
    this.skill = skill;
    return this;
  }

  public String getPic() {
    return pic;
  }

  public ContributorProfile setPic(String pic) {
    this.pic = pic;
    return this;
  }

  public String getDesignation() {
    return designation;
  }

  public ContributorProfile setDesignation(String designation) {
    this.designation = designation;
    return this;
  }

  public String getAbout() {
    return about;
  }

  public ContributorProfile setAbout(String about) {
    this.about = about;
    return this;
  }
}
