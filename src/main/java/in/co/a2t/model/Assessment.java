package in.co.a2t.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assessments")
public class Assessment {

  @Id
  @Column(name = "assessment_id")
  private Long id;
  @Column(name = "assessment_name")
  private String name;
  @Column(name = "created_on")
  private Date createdOn;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @Column(name = "ques_count")
  private int questionCount;
  @Column(name = "valid_upto")
  private Date validUpto;
  @Column(name = "max_marks")
  private int maxMarks;
  @ManyToOne
  @JoinColumn(name = "subject_id")
  private Subject subject;
  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;
  @Column(name = "time_allowed")
  private int timeAllowed;

  public Long getId() {
    return id;
  }

  public Assessment setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Assessment setName(String name) {
    this.name = name;
    return this;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  public Assessment setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  public User getUser() {
    return user;
  }

  public Assessment setUser(User user) {
    this.user = user;
    return this;
  }

  public int getQuestionCount() {
    return questionCount;
  }

  public Assessment setQuestionCount(int questionCount) {
    this.questionCount = questionCount;
    return this;
  }

  public Date getValidUpto() {
    return validUpto;
  }

  public Assessment setValidUpto(Date validUpto) {
    this.validUpto = validUpto;
    return this;
  }

  public int getMaxMarks() {
    return maxMarks;
  }

  public Assessment setMaxMarks(int maxMarks) {
    this.maxMarks = maxMarks;
    return this;
  }

  public Subject getSubject() {
    return subject;
  }

  public Assessment setSubject(Subject subject) {
    this.subject = subject;
    return this;
  }

  public Company getCompany() {
    return company;
  }

  public Assessment setCompany(Company company) {
    this.company = company;
    return this;
  }

  public int getTimeAllowed() {
    return timeAllowed;
  }

  public Assessment setTimeAllowed(int timeAllowed) {
    this.timeAllowed = timeAllowed;
    return this;
  }
}
