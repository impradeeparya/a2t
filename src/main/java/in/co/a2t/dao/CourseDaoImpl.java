package in.co.a2t.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.model.Course;
import in.co.a2t.repository.CourseRepository;

@Repository("CourseDao")
public class CourseDaoImpl implements CourseDao {

  @Autowired
  private CourseRepository courseRepository;

  @Override
  public List<Course> findAll() {
    return courseRepository.findAll();
  }
}
