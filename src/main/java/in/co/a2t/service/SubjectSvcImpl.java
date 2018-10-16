package in.co.a2t.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.a2t.constant.ModelParser;
import in.co.a2t.dao.SubjectDao;
import in.co.a2t.dto.DropDown;
import in.co.a2t.model.Subject;

@Service("subjectSvc")
public class SubjectSvcImpl implements SubjectSvc {

  @Autowired
  private SubjectDao subjectDao;

  @Override
  public List<DropDown> fetchSubjectDropDown() {
    List<Subject> subjects = subjectDao.fetchAll();
    return ModelParser.subjectDropDown.apply(subjects);
  }
}
