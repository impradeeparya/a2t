package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject_topics")
public class SubjectTopic {

  @Id
  @Column(name = "topic_id")
  private long id;
  @Column(name = "topic_name")
  private String name;
  @Column(name = "topic_desc")
  private String description;
  @ManyToOne
  @JoinColumn(name = "subject_id")
  private Subject subject;

  public long getId() {
    return id;
  }

  public SubjectTopic setId(long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public SubjectTopic setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SubjectTopic setDescription(String description) {
    this.description = description;
    return this;
  }

  public Subject getSubject() {
    return subject;
  }

  public SubjectTopic setSubject(Subject subject) {
    this.subject = subject;
    return this;
  }
}
