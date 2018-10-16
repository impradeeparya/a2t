package in.co.a2t.constant;

public enum Licence {
  PRACTICE("Practice"), PREMIUM("Premium"), ASSESSMENT("Assessment");

  private String type;

  Licence(String type) {
    this.type = type;
  }
}
