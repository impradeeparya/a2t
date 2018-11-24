package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_role_functions")
public class JobRoleFunction {

  @Id
  @Column(name = "job_func_id")
  private Long id;
  @Column(name = "job_func_name")
  private String name;

  public Long getId() {
    return id;
  }

  public JobRoleFunction setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public JobRoleFunction setName(String name) {
    this.name = name;
    return this;
  }
}
