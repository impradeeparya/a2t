package in.co.a2t.controller;

import static in.co.a2t.constant.Message.FAILURE;
import static in.co.a2t.constant.Message.FETCH_FAILURE_MSG;
import static in.co.a2t.constant.Message.FETCH_SUCCESS_MSG;
import static in.co.a2t.constant.Message.INTERNAL_SERVER_ERROR_CODE;
import static in.co.a2t.constant.Message.SUCCESS;
import static in.co.a2t.constant.Message.SUCCESS_CODE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.a2t.dto.ApplicationResponse;
import in.co.a2t.dto.QuestionDto;
import in.co.a2t.service.QuestionSvc;

@RestController
@RequestMapping("/a2t/question/")
public class QuestionController {

  @Autowired
  private QuestionSvc questionSvc;

  @PostMapping("/")
  public ResponseEntity<ApplicationResponse> create(@RequestBody QuestionDto questionDto) {
    ApplicationResponse applicationResponse;
    try {
      questionSvc.saveQuestion(questionDto);
      applicationResponse = new ApplicationResponse().setCode(SUCCESS_CODE)
          .setMessage(FETCH_SUCCESS_MSG).setPayload(questionDto).setStatus(SUCCESS);
    } catch (Exception ex) {
      ex.printStackTrace();
      applicationResponse = new ApplicationResponse().setCode(INTERNAL_SERVER_ERROR_CODE)
          .setMessage(FETCH_FAILURE_MSG).setPayload(null).setStatus(FAILURE);
    }

    return new ResponseEntity<>(applicationResponse, HttpStatus.OK);
  }

  @GetMapping("/{subjectId}")
  public ResponseEntity<ApplicationResponse> fetchBySubject(
      @RequestParam("subjectId") Long subjectId) {
    ApplicationResponse applicationResponse;
    try {
      List<QuestionDto> questions = questionSvc.fetchBySubjectId(subjectId);
      applicationResponse = new ApplicationResponse().setCode(SUCCESS_CODE)
          .setMessage(FETCH_SUCCESS_MSG).setPayload(questions).setStatus(SUCCESS);
    } catch (Exception ex) {
      ex.printStackTrace();
      applicationResponse = new ApplicationResponse().setCode(INTERNAL_SERVER_ERROR_CODE)
          .setMessage(FETCH_FAILURE_MSG).setPayload(null).setStatus(FAILURE);
    }

    return new ResponseEntity<>(applicationResponse, HttpStatus.OK);
  }


}
