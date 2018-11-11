package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a2t_country")
public class Country {

  @Id
  @Column(name = "country_id")
  private long id;
  @Column(name = "country_code")
  private String code;
  @Column(name = "country_name")
  private String name;

  public long getId() {
    return id;
  }

  public Country setId(long id) {
    this.id = id;
    return this;
  }

  public String getCode() {
    return code;
  }

  public Country setCode(String code) {
    this.code = code;
    return this;
  }

  public String getName() {
    return name;
  }

  public Country setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    return "Country{" + "id=" + id + ", code='" + code + '\'' + ", name='" + name + '\'' + '}';
  }
}
