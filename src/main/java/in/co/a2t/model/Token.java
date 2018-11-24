package in.co.a2t.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "api_tokens")
public class Token {

  @Id
  @Column(name = "token_id")
  private Long id;
  @Column(name = "token_value")
  private String value;
  @Column(name = "ip_auth")
  private String ipAuth;
  @Column(name = "token_user")
  private String user;
  @Column(name = "display_status")
  private boolean status;
  @Column(name = "created_date")
  private Date createAt;
  @Column(name = "updated_date")
  private Date updateAt;

  public Long getId() {
    return id;
  }

  public Token setId(Long id) {
    this.id = id;
    return this;
  }

  public String getValue() {
    return value;
  }

  public Token setValue(String value) {
    this.value = value;
    return this;
  }

  public String getIpAuth() {
    return ipAuth;
  }

  public Token setIpAuth(String ipAuth) {
    this.ipAuth = ipAuth;
    return this;
  }

  public String getUser() {
    return user;
  }

  public Token setUser(String user) {
    this.user = user;
    return this;
  }

  public boolean isStatus() {
    return status;
  }

  public Token setStatus(boolean status) {
    this.status = status;
    return this;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public Token setCreateAt(Date createAt) {
    this.createAt = createAt;
    return this;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public Token setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
    return this;
  }
}
