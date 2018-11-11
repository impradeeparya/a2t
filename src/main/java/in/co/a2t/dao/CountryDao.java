package in.co.a2t.dao;

import java.util.List;

import in.co.a2t.model.Country;

public interface CountryDao {

  List<Country> findAll();
}
