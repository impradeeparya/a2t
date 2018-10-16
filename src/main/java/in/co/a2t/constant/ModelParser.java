package in.co.a2t.constant;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import in.co.a2t.dto.DropDown;
import in.co.a2t.model.Subject;
import in.co.a2t.model.SubjectTopic;

public interface ModelParser {

  Function<List<Subject>, List<DropDown>> subjectDropDown = (subjects) -> {
    List<DropDown> dropDown = new ArrayList<>();
    subjects.forEach(subject -> {
      DropDown data = new DropDown().setCode(subject.getId()).setDescription(subject.getName());
      dropDown.add(data);
    });
    return dropDown;
  };

  Function<List<SubjectTopic>, List<DropDown>> subjectTopicDropDown = (subjectTopics) -> {
    List<DropDown> dropDown = new ArrayList<>();
    subjectTopics.forEach(topic -> {
      DropDown data = new DropDown().setCode(topic.getId()).setDescription(topic.getName());
      dropDown.add(data);
    });
    return dropDown;
  };
}
