package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_type")
public class QuestionType {

  @Id
  @Column(name = "question_type_id")
  private Long id;
  @Column(name = "question_type_cd")
  private String code;
  @Column(name = "question_type_desc")
  private String description;
  @Column(name = "scoring")
  private String score;
  @Column(name = "options")
  private String option;

  public Long getId() {
    return id;
  }

  public QuestionType setId(Long id) {
    this.id = id;
    return this;
  }

  public String getCode() {
    return code;
  }

  public QuestionType setCode(String code) {
    this.code = code;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public QuestionType setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getScore() {
    return score;
  }

  public QuestionType setScore(String score) {
    this.score = score;
    return this;
  }

  public String getOption() {
    return option;
  }

  public QuestionType setOption(String option) {
    this.option = option;
    return this;
  }
}
