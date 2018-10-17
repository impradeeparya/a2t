package in.co.a2t.dto;

public class SubjectDto {

  private long id;
  private String name;

  public long getId() {
    return id;
  }

  public SubjectDto setId(long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public SubjectDto setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    return "SubjectDto{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
