package in.co.a2t.constant;

import java.util.HashMap;
import java.util.Map;

public enum DropDownType {
  SUBJECT("subject"), SUBJECT_TOPIC("subject_topic"), USER_TYPE("user_type");

  private String name;

  DropDownType(String name) {
    this.name = name;
  }

  private static Map<String, DropDownType> map = new HashMap<>();
  static {
    for (DropDownType dropDownType : DropDownType.values()) {
      map.put(dropDownType.name, dropDownType);
    }

  }

  public static DropDownType getByName(String name) {
    return name != null ? map.get(name.toLowerCase()) : null;
  }
}
