package in.co.a2t.dto;

public class QuestionDto {

  private String description;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String answer;
  private SubjectDto subject;
  private String hint;

  public String getDescription() {
    return description;
  }

  public QuestionDto setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getOption1() {
    return option1;
  }

  public QuestionDto setOption1(String option1) {
    this.option1 = option1;
    return this;
  }

  public String getOption2() {
    return option2;
  }

  public QuestionDto setOption2(String option2) {
    this.option2 = option2;
    return this;
  }

  public String getOption3() {
    return option3;
  }

  public QuestionDto setOption3(String option3) {
    this.option3 = option3;
    return this;
  }

  public String getOption4() {
    return option4;
  }

  public QuestionDto setOption4(String option4) {
    this.option4 = option4;
    return this;
  }

  public String getAnswer() {
    return answer;
  }

  public QuestionDto setAnswer(String answer) {
    this.answer = answer;
    return this;
  }

  public SubjectDto getSubject() {
    return subject;
  }

  public QuestionDto setSubject(SubjectDto subject) {
    this.subject = subject;
    return this;
  }

  public String getHint() {
    return hint;
  }

  public QuestionDto setHint(String hint) {
    this.hint = hint;
    return this;
  }

  @Override
  public String toString() {
    return "QuestionDto{" + "description='" + description + '\'' + ", option1='" + option1 + '\''
        + ", option2='" + option2 + '\'' + ", option3='" + option3 + '\'' + ", option4='" + option4
        + '\'' + ", answer='" + answer + '\'' + ", subject=" + subject + ", hint='" + hint + '\''
        + '}';
  }
}
