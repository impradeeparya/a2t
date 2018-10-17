package in.co.a2t.service;

import static in.co.a2t.utility.ModelParser.question;
import static in.co.a2t.utility.ModelParser.questionDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.a2t.dao.QuestionDao;
import in.co.a2t.dto.QuestionDto;
import in.co.a2t.model.Question;

@Service("questionSvc")
public class QuestionSvcImpl implements QuestionSvc {

  @Autowired
  private QuestionDao questionDao;

  @Override
  public QuestionDto saveQuestion(QuestionDto questionDto) {
    questionDao.saveQuestion(question.apply(questionDto));
    return questionDto;
  }

  @Override
  public List<QuestionDto> fetchBySubjectId(Long subjectId) {
    List<Question> questions = questionDao.fetchBySubjectId(subjectId);
    return questionDto.apply(questions);
  }
}
