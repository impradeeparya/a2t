package in.co.a2t.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.a2t.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
