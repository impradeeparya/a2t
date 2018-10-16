package in.co.a2t.dto;

public class DropDown {

  private long code;
  private String description;

  public long getCode() {
    return code;
  }

  public DropDown setCode(long code) {
    this.code = code;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public DropDown setDescription(String description) {
    this.description = description;
    return this;
  }
}
