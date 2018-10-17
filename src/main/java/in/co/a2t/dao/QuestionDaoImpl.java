package in.co.a2t.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.model.Question;
import in.co.a2t.model.Subject;
import in.co.a2t.repository.QuestionRepository;

@Repository("questionDao")
public class QuestionDaoImpl implements QuestionDao {

  @Autowired
  private QuestionRepository questionRepository;

  @Override
  public Question saveQuestion(Question question) {
    return questionRepository.save(question);
  }

  @Override
  public List<Question> fetchBySubjectId(Long subjectId) {
    return questionRepository.findBySubject(new Subject().setId(subjectId));
  }
}
