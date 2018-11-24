package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company_contacts")
public class CompanyContact {

  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;

  @Id
  @Column(name = "contact_id")
  private Long id;
  @Column(name = "conact_first_name")
  private String firstName;
  @Column(name = "contact_last_name")
  private String lastName;
  @Column(name = "contact_email")
  private String email;
  @Column(name = "contac_mobile")
  private String mobile;
  @Column(name = "contact_designation")
  private String designation;

  public Company getCompany() {
    return company;
  }

  public CompanyContact setCompany(Company company) {
    this.company = company;
    return this;
  }

  public Long getId() {
    return id;
  }

  public CompanyContact setId(Long id) {
    this.id = id;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public CompanyContact setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public CompanyContact setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public CompanyContact setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public CompanyContact setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public String getDesignation() {
    return designation;
  }

  public CompanyContact setDesignation(String designation) {
    this.designation = designation;
    return this;
  }
}
