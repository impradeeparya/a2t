package in.co.a2t.dto;

import in.co.a2t.model.User;

public class CreateUserRequest {

  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String password;
  private String loginId;


  public String getFirstName() {
    return firstName;
  }

  public CreateUserRequest setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public CreateUserRequest setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public CreateUserRequest setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public CreateUserRequest setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public CreateUserRequest setPassword(String password) {
    this.password = password;
    return this;
  }


  public User toEntity() {
    User user = new User();
    user.setName(this.firstName).setLoginId(this.loginId);
    return user;
  }

  public String getLoginId() {
    return loginId;
  }

  public CreateUserRequest setLoginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  @Override
  public String toString() {
    return "CreateUserRequest{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName
        + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\''
        + ", password='" + password + '\'' + ", loginId='" + loginId + '\'' + '}';
  }
}
