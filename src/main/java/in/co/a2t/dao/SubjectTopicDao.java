package in.co.a2t.dao;

import java.util.List;

import in.co.a2t.model.SubjectTopic;

public interface SubjectTopicDao {

  List<SubjectTopic> fetchBySubject(long subjectId);
}
