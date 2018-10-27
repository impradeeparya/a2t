package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_type")
public class UserType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "type")
  @NotNull(message = "user type can't be null")
  private String type;

  public long getId() {
    return id;
  }

  public UserType setId(long id) {
    this.id = id;
    return this;
  }

  public String getType() {
    return type;
  }

  public UserType setType(String type) {
    this.type = type;
    return this;
  }
}
