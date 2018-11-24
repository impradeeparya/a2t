package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject_category")
public class SubjectCategory {

  @Id
  @Column(name = "sub_catg_id")
  private Long id;
  @Column(name = "sub_catg_name")
  private String name;

  public Long getId() {
    return id;
  }

  public SubjectCategory setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public SubjectCategory setName(String name) {
    this.name = name;
    return this;
  }
}
