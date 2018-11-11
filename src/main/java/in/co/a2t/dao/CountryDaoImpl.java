package in.co.a2t.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.a2t.model.Country;
import in.co.a2t.repository.CountryRepository;

@Repository("CountryDao")
public class CountryDaoImpl implements CountryDao {

  @Autowired
  private CountryRepository countryRepository;

  @Override
  public List<Country> findAll() {
    return countryRepository.findAll();
  }
}
