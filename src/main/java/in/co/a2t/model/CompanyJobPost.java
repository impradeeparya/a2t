package in.co.a2t.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company_job_posting")
public class CompanyJobPost {

  @Id
  @Column(name = "job_seq")
  private Long id;
  @Column(name = "job_type_cd")
  private String code;
  @Column(name = "job_title")
  private String title;
  @ManyToOne
  @JoinColumn(name = "job_location_id")
  private Location location;
  @Column(name = "job_qualification")
  private int qualification;
  @Column(name = "year_of_passing_from")
  private int yearOfPassFrom;
  @Column(name = "year_of_passing_to")
  private int yearOfPassTo;
  @Column(name = "Marks_perc")
  private int marksPerc;
  @Column(name = "Skills")
  private String skill;
  @Column(name = "Gender")
  private String gender;
  @Column(name = "Exp_range_yrs")
  private String expRangeYrs;
  @Column(name = "job_desc")
  private String description;
  @Column(name = "salary_range")
  private String salaryRange;
  @Column(name = "vacancies_count")
  private int vacanciesCount;
  @Column(name = "last_date_to_apply")
  private Date lastDateToApply;
  @Column(name = "hiring_criteria")
  private String hiringCriteria;
  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;
  @Column(name = "company_job_postingcol")
  private String postingCol;

  public Long getId() {
    return id;
  }

  public CompanyJobPost setId(Long id) {
    this.id = id;
    return this;
  }

  public String getCode() {
    return code;
  }

  public CompanyJobPost setCode(String code) {
    this.code = code;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public CompanyJobPost setTitle(String title) {
    this.title = title;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public CompanyJobPost setLocation(Location location) {
    this.location = location;
    return this;
  }

  public int getQualification() {
    return qualification;
  }

  public CompanyJobPost setQualification(int qualification) {
    this.qualification = qualification;
    return this;
  }

  public int getYearOfPassFrom() {
    return yearOfPassFrom;
  }

  public CompanyJobPost setYearOfPassFrom(int yearOfPassFrom) {
    this.yearOfPassFrom = yearOfPassFrom;
    return this;
  }

  public int getYearOfPassTo() {
    return yearOfPassTo;
  }

  public CompanyJobPost setYearOfPassTo(int yearOfPassTo) {
    this.yearOfPassTo = yearOfPassTo;
    return this;
  }

  public int getMarksPerc() {
    return marksPerc;
  }

  public CompanyJobPost setMarksPerc(int marksPerc) {
    this.marksPerc = marksPerc;
    return this;
  }

  public String getSkill() {
    return skill;
  }

  public CompanyJobPost setSkill(String skill) {
    this.skill = skill;
    return this;
  }

  public String getGender() {
    return gender;
  }

  public CompanyJobPost setGender(String gender) {
    this.gender = gender;
    return this;
  }

  public String getExpRangeYrs() {
    return expRangeYrs;
  }

  public CompanyJobPost setExpRangeYrs(String expRangeYrs) {
    this.expRangeYrs = expRangeYrs;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CompanyJobPost setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getSalaryRange() {
    return salaryRange;
  }

  public CompanyJobPost setSalaryRange(String salaryRange) {
    this.salaryRange = salaryRange;
    return this;
  }

  public int getVacanciesCount() {
    return vacanciesCount;
  }

  public CompanyJobPost setVacanciesCount(int vacanciesCount) {
    this.vacanciesCount = vacanciesCount;
    return this;
  }

  public Date getLastDateToApply() {
    return lastDateToApply;
  }

  public CompanyJobPost setLastDateToApply(Date lastDateToApply) {
    this.lastDateToApply = lastDateToApply;
    return this;
  }

  public String getHiringCriteria() {
    return hiringCriteria;
  }

  public CompanyJobPost setHiringCriteria(String hiringCriteria) {
    this.hiringCriteria = hiringCriteria;
    return this;
  }

  public Company getCompany() {
    return company;
  }

  public CompanyJobPost setCompany(Company company) {
    this.company = company;
    return this;
  }

  public String getPostingCol() {
    return postingCol;
  }

  public CompanyJobPost setPostingCol(String postingCol) {
    this.postingCol = postingCol;
    return this;
  }
}
