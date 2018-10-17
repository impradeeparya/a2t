package in.co.a2t.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.a2t.model.Question;
import in.co.a2t.model.Subject;

public interface QuestionRepository extends JpaRepository<Question, Long> {

  List<Question> findBySubject(Subject subject);
}
