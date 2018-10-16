package in.co.a2t.dto;

public class ApplicationResponse {

  private String message;
  private String status;
  private String code;
  private Object payload;

  public String getMessage() {
    return message;
  }

  public ApplicationResponse setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public ApplicationResponse setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getCode() {
    return code;
  }

  public ApplicationResponse setCode(String code) {
    this.code = code;
    return this;
  }

  public Object getPayload() {
    return payload;
  }

  public ApplicationResponse setPayload(Object payload) {
    this.payload = payload;
    return this;
  }

  @Override
  public String toString() {
    return "ApplicationResponse{" + "message='" + message + '\'' + ", status='" + status + '\''
        + ", code='" + code + '\'' + ", payload=" + payload + '}';
  }
}
