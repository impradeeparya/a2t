package in.co.a2t.utility;

import static in.co.a2t.constant.Message.BAD_REQUEST_ERROR_MSG;
import static in.co.a2t.constant.Message.INTERNAL_SERVER_ERROR_MSG;
import static in.co.a2t.constant.Message.SUCCESS;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

import java.util.function.Supplier;

import in.co.a2t.dto.ApplicationResponse;

public class ResponseUtil {

  public static Supplier<ApplicationResponse> successResponse =
      () -> new ApplicationResponse().setStatus(OK.toString()).setMessage(SUCCESS);

  public static Supplier<ApplicationResponse> internalServerResponse =
      () -> new ApplicationResponse().setStatus(INTERNAL_SERVER_ERROR.toString())
          .setMessage(INTERNAL_SERVER_ERROR_MSG);

  public static Supplier<ApplicationResponse> badRequest = () -> new ApplicationResponse()
      .setStatus(BAD_REQUEST.toString()).setMessage(BAD_REQUEST_ERROR_MSG);
}
