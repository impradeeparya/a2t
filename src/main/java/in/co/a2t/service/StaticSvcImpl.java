package in.co.a2t.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.a2t.constant.DropDownType;
import in.co.a2t.dto.DropDown;

@Service("staticSvc")
public class StaticSvcImpl implements StaticSvc {

  @Autowired
  private SubjectSvc subjectSvc;

  @Autowired
  private SubjectTopicSvc subjectTopicSvc;

  @Autowired
  private UserProfileSvc userProfileSvc;

  @Override
  public List<DropDown> fetchDropDownData(String type, Long code) {

    DropDownType dropDownType = DropDownType.getByName(type);
    List<DropDown> dropDown;
    if (dropDownType != null) {
      switch (dropDownType) {
        case SUBJECT:
          dropDown = subjectSvc.fetchSubjectDropDown();
          break;

        case SUBJECT_TOPIC:
          if (code != null) {
            dropDown = subjectTopicSvc.fetchTopicDropDownBySubject(code);
          } else {
            dropDown = Collections.emptyList();
          }
          break;

        case USER_TYPE:
          dropDown = userProfileSvc.userTypes();
          break;

        default:
          dropDown = Collections.emptyList();
          break;
      }
    } else {
      dropDown = Collections.emptyList();
    }

    return dropDown;
  }
}
