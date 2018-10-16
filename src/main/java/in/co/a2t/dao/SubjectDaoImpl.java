package in.co.a2t.dao;

import in.co.a2t.model.Subject;
import in.co.a2t.repository.SubjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("subjectDao")
public class SubjectDaoImpl implements SubjectDao {

  @Autowired
  private SubjectRepository subjectRepository;

  @Override
  public List<Subject> fetchAll() {
    return subjectRepository.findAll();
  }
}
