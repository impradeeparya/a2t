package in.co.a2t.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "industry_jobs")
public class IndustryJob {

  @Id
  @Column(name = "job_id")
  private Long id;
  @Column(name = "job_name")
  private String name;
  @ManyToOne
  @JoinColumn(name = "industry_id")
  private Institute institute;
  @Column(name = "job_desc")
  private String description;
  @Column(name = "job_responsility")
  private String responsibility;

  public Long getId() {
    return id;
  }

  public IndustryJob setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public IndustryJob setName(String name) {
    this.name = name;
    return this;
  }

  public Institute getInstitute() {
    return institute;
  }

  public IndustryJob setInstitute(Institute institute) {
    this.institute = institute;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public IndustryJob setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getResponsibility() {
    return responsibility;
  }

  public IndustryJob setResponsibility(String responsibility) {
    this.responsibility = responsibility;
    return this;
  }
}
