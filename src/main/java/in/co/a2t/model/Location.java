package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "a2t_location")
public class Location {

  @Id
  @Column(name = "location_id")
  private long id;
  @Column(name = "location_code")
  private String code;
  @Column(name = "location_name")
  private String name;

  public long getId() {
    return id;
  }

  public Location setId(long id) {
    this.id = id;
    return this;
  }

  public String getCode() {
    return code;
  }

  public Location setCode(String code) {
    this.code = code;
    return this;
  }

  public String getName() {
    return name;
  }

  public Location setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    return "Location{" + "id=" + id + ", code='" + code + '\'' + ", name='" + name + '\'' + '}';
  }
}
