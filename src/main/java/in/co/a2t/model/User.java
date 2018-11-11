package in.co.a2t.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "a2t_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "user_id")
  @NotNull(message = "user id can't be null")
  private String userId;

  @Column(name = "user_name")
  @NotNull(message = "user name can't be null")
  private String name;

  @Column(name = "user_login_id")
  @NotNull(message = "user login id can't be null")
  private String loginId;

  @Column(name = "user_password")
  @NotNull(message = "user login id can't be null")
  private String password;

  @OneToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "user_type_id")
  private UserType userType;

  public long getId() {
    return id;
  }

  public User setId(long id) {
    this.id = id;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public User setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getLoginId() {
    return loginId;
  }

  public User setLoginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public User setPassword(String password) {
    this.password = password;
    return this;
  }

  public UserType getUserType() {
    return userType;
  }

  public User setUserType(UserType userType) {
    this.userType = userType;
    return this;
  }
}
