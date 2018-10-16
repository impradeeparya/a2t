package in.co.a2t.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.model.Subject;
import in.co.a2t.model.SubjectTopic;
import in.co.a2t.repository.SubjectTopicRepository;

@Repository("subjectTopicDao")
public class SubjectTopicDaoImpl implements SubjectTopicDao {

  @Autowired
  private SubjectTopicRepository subjectTopicRepository;

  @Override
  public List<SubjectTopic> fetchBySubject(long subjectId) {
    return subjectTopicRepository.findBySubject(new Subject().setId(subjectId));
  }
}
