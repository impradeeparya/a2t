package in.co.a2t.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.a2t.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
