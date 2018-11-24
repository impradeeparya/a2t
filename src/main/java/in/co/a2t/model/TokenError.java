package in.co.a2t.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "api_token_errors")
public class TokenError {

  @Id
  @Column(name = "error_id")
  private Long id;
  @Column(name = "error_method")
  private String method;
  @Column(name = "error_token")
  private String token;
  @Column(name = "error_message")
  private String message;
  @Column(name = "ip")
  private String ip;
  @Column(name = "error_date_time")
  @CreationTimestamp
  private Date createdAt;

  public Long getId() {
    return id;
  }

  public TokenError setId(Long id) {
    this.id = id;
    return this;
  }

  public String getMethod() {
    return method;
  }

  public TokenError setMethod(String method) {
    this.method = method;
    return this;
  }

  public String getToken() {
    return token;
  }

  public TokenError setToken(String token) {
    this.token = token;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public TokenError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public TokenError setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public TokenError setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
}
