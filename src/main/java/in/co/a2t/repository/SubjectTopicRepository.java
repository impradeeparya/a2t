package in.co.a2t.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.a2t.model.Subject;
import in.co.a2t.model.SubjectTopic;

public interface SubjectTopicRepository extends JpaRepository<SubjectTopic, Long> {

  List<SubjectTopic> findBySubject(Subject subject);
}
