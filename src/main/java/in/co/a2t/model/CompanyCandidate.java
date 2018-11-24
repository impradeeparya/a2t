package in.co.a2t.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company_candidates")
public class CompanyCandidate {
  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;

  @Id
  @Column(name = "candidate_id")
  private Long id;
  @ManyToOne
  @JoinColumn(name = "company_id")
  private Assessment assessment;

  @Column(name = "assessment_sch_date")
  private Date schDate;
  @Column(name = "assessment_valid_upto")
  private Date validUpto;
  @Column(name = "candidate_name")
  private String name;
  @Column(name = "candidate_email_id")
  private String email;
  @Column(name = "candidate_mobile")
  private String mobile;
  @Column(name = "marks_obtained_tech")
  private int techMarks;
  @Column(name = "marks_obtained_arith")
  private int arithMarks;
  @Column(name = "marks_obtaied_cogn")
  private int congMarks;

  public Company getCompany() {
    return company;
  }

  public CompanyCandidate setCompany(Company company) {
    this.company = company;
    return this;
  }

  public Long getId() {
    return id;
  }

  public CompanyCandidate setId(Long id) {
    this.id = id;
    return this;
  }

  public Assessment getAssessment() {
    return assessment;
  }

  public CompanyCandidate setAssessment(Assessment assessment) {
    this.assessment = assessment;
    return this;
  }

  public Date getSchDate() {
    return schDate;
  }

  public CompanyCandidate setSchDate(Date schDate) {
    this.schDate = schDate;
    return this;
  }

  public Date getValidUpto() {
    return validUpto;
  }

  public CompanyCandidate setValidUpto(Date validUpto) {
    this.validUpto = validUpto;
    return this;
  }

  public String getName() {
    return name;
  }

  public CompanyCandidate setName(String name) {
    this.name = name;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public CompanyCandidate setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public CompanyCandidate setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public int getTechMarks() {
    return techMarks;
  }

  public CompanyCandidate setTechMarks(int techMarks) {
    this.techMarks = techMarks;
    return this;
  }

  public int getArithMarks() {
    return arithMarks;
  }

  public CompanyCandidate setArithMarks(int arithMarks) {
    this.arithMarks = arithMarks;
    return this;
  }

  public int getCongMarks() {
    return congMarks;
  }

  public CompanyCandidate setCongMarks(int congMarks) {
    this.congMarks = congMarks;
    return this;
  }
}
