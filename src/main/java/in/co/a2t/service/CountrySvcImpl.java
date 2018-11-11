package in.co.a2t.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.dao.CountryDao;
import in.co.a2t.dto.DropDown;
import in.co.a2t.model.Country;
import in.co.a2t.utility.ModelParser;

@Repository("CountrySvc")
public class CountrySvcImpl implements CountrySvc {

  @Autowired
  private CountryDao countryDao;

  @Override
  public List<DropDown> countries() {
    List<Country> countryList = countryDao.findAll();
    return ModelParser.countryDropDown.apply(countryList);
  }
}
