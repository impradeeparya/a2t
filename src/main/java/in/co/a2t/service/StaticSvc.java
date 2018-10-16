package in.co.a2t.service;

import java.util.List;

import in.co.a2t.dto.DropDown;

public interface StaticSvc {
  List<DropDown> fetchDropDownData(String type, Long code);
}
