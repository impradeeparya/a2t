package in.co.a2t.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.dao.CourseDao;
import in.co.a2t.dto.DropDown;
import in.co.a2t.model.Course;
import in.co.a2t.utility.ModelParser;

@Repository("CourseSvc")
public class CourseSvcImpl implements CourseSvc {

  @Autowired
  private CourseDao courseDao;

  @Override
  public List<DropDown> courses() {
    List<Course> countryList = courseDao.findAll();
    return ModelParser.courseDropDown.apply(countryList);
  }
}
