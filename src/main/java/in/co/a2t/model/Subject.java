package in.co.a2t.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import in.co.a2t.constant.Licence;

@Entity
@Table(name = "subjects")
public class Subject {

  @Id
  @Column(name = "subject_id")
  private long id;
  @Column(name = "subject_name")
  private String name;
  @Column(name = "licence_type")
  private Licence licence;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
  private Set<SubjectTopic> topics;

  public long getId() {
    return id;
  }

  public Subject setId(long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Subject setName(String name) {
    this.name = name;
    return this;
  }

  public Licence getLicence() {
    return licence;
  }

  public Subject setLicence(Licence licence) {
    this.licence = licence;
    return this;
  }

  public Set<SubjectTopic> getTopics() {
    return topics;
  }

  public Subject setTopics(Set<SubjectTopic> topics) {
    this.topics = topics;
    return this;
  }
}
