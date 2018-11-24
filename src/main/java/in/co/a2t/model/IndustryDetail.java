package in.co.a2t.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "industry_details")
public class IndustryDetail {

  @Id
  @Column(name = "industry_id")
  private Long id;
  @Column(name = "industry_name")
  private String name;

  public Long getId() {
    return id;
  }

  public IndustryDetail setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public IndustryDetail setName(String name) {
    this.name = name;
    return this;
  }
}
