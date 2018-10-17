package in.co.a2t.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.a2t.utility.ModelParser;
import in.co.a2t.dao.SubjectTopicDao;
import in.co.a2t.dto.DropDown;
import in.co.a2t.model.SubjectTopic;

@Service("subjectTopicSvc")
public class SubjectTopicSvcImpl implements SubjectTopicSvc {

  @Autowired
  private SubjectTopicDao subjectTopicDao;

  @Override
  public List<DropDown> fetchTopicDropDownBySubject(Long subjectId) {
    List<SubjectTopic> subjectTopics = subjectTopicDao.fetchBySubject(subjectId);
    return ModelParser.subjectTopicDropDown.apply(subjectTopics);
  }
}
