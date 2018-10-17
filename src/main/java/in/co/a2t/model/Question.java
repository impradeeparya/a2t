package in.co.a2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_bank")
public class Question {

  @Id
  @Column(name = "ques_id")
  private long id;
  @Column(name = "ques_desc")
  private String description;
  @Column(name = "ques_opt1")
  private String option1;
  @Column(name = "ques_opt2")
  private String option2;
  @Column(name = "ques_opt3")
  private String option3;
  @Column(name = "ques_opt4")
  private String option4;
  @Column(name = "ques_ans")
  private String answer;
  @ManyToOne
  @JoinColumn(name = "ques_subj_id")
  private Subject subject;
  @Column(name = "ques_hint")
  private String hint;

  public long getId() {
    return id;
  }

  public Question setId(long id) {
    this.id = id;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Question setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getOption1() {
    return option1;
  }

  public Question setOption1(String option1) {
    this.option1 = option1;
    return this;
  }

  public String getOption2() {
    return option2;
  }

  public Question setOption2(String option2) {
    this.option2 = option2;
    return this;
  }

  public String getOption3() {
    return option3;
  }

  public Question setOption3(String option3) {
    this.option3 = option3;
    return this;
  }

  public String getOption4() {
    return option4;
  }

  public Question setOption4(String option4) {
    this.option4 = option4;
    return this;
  }

  public String getAnswer() {
    return answer;
  }

  public Question setAnswer(String answer) {
    this.answer = answer;
    return this;
  }

  public Subject getSubject() {
    return subject;
  }

  public Question setSubject(Subject subject) {
    this.subject = subject;
    return this;
  }

  public String getHint() {
    return hint;
  }

  public Question setHint(String hint) {
    this.hint = hint;
    return this;
  }

  @Override
  public String toString() {
    return "Question{" + "id=" + id + ", description='" + description + '\'' + ", option1='"
        + option1 + '\'' + ", option2='" + option2 + '\'' + ", option3='" + option3 + '\''
        + ", option4='" + option4 + '\'' + ", answer='" + answer + '\'' + ", subject=" + subject
        + ", hint='" + hint + '\'' + '}';
  }
}
