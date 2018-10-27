package in.co.a2t.dto;

public class UserInfo {

  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;

  public String getFirstName() {
    return firstName;
  }

  public UserInfo setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public UserInfo setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserInfo setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public UserInfo setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

}
