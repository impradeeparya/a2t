package in.co.a2t.dao;

import java.util.List;

import in.co.a2t.model.Question;

public interface QuestionDao {
  Question saveQuestion(Question question);

  List<Question> fetchBySubjectId(Long subjectId);
}
