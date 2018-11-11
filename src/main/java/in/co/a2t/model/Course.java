package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

  @Id
  @Column(name = "course_id")
  private long id;
  @Column(name = "course_short_name")
  private String shortName;
  @Column(name = "course_name")
  private String name;
  @Column(name = "course_duration")
  private long duration;
  @Column(name = "course_desc")
  private String desc;

  public long getId() {
    return id;
  }

  public Course setId(long id) {
    this.id = id;
    return this;
  }

  public String getShortName() {
    return shortName;
  }

  public Course setShortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  public String getName() {
    return name;
  }

  public Course setName(String name) {
    this.name = name;
    return this;
  }

  public long getDuration() {
    return duration;
  }

  public Course setDuration(long duration) {
    this.duration = duration;
    return this;
  }

  public String getDesc() {
    return desc;
  }

  public Course setDesc(String desc) {
    this.desc = desc;
    return this;
  }

  @Override
  public String toString() {
    return "Course{" + "id=" + id + ", shortName='" + shortName + '\'' + ", name='" + name + '\''
        + ", duration=" + duration + ", desc='" + desc + '\'' + '}';
  }
}
