package in.co.a2t.service;

import java.util.List;

import in.co.a2t.dto.QuestionDto;

public interface QuestionSvc {

  QuestionDto saveQuestion(QuestionDto questionDto);

  List<QuestionDto> fetchBySubjectId(Long subjectId);
}
