package in.co.a2t.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import in.co.a2t.dto.DropDown;
import in.co.a2t.dto.QuestionDto;
import in.co.a2t.dto.SubjectDto;
import in.co.a2t.model.Question;
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

  Function<QuestionDto, Question> question =
      (questionDto) -> new Question().setAnswer(questionDto.getAnswer())
          .setDescription(questionDto.getDescription()).setHint(questionDto.getHint())
          .setOption1(questionDto.getOption1()).setOption2(questionDto.getOption2())
          .setOption3(questionDto.getOption3()).setOption4(questionDto.getOption4())
          .setSubject(new Subject().setId(questionDto.getSubject().getId()));

  Function<List<Question>, List<QuestionDto>> questionDto = (questions) -> {
    List<QuestionDto> questionDtos = new ArrayList<>();
    questions.forEach(question -> {
      questionDtos.add(new QuestionDto().setAnswer(question.getAnswer())
          .setDescription(question.getDescription()).setHint(question.getHint())
          .setOption1(question.getOption1()).setOption2(question.getOption2())
          .setOption3(question.getOption3()).setOption4(question.getOption4())
          .setSubject(new SubjectDto().setId(question.getSubject().getId())
              .setName(question.getSubject().getName())));
    });
    return questionDtos;
  };
}
