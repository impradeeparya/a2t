package in.co.a2t.dao;

import java.util.List;

import in.co.a2t.model.Course;

public interface CourseDao {

  List<Course> findAll();
}
