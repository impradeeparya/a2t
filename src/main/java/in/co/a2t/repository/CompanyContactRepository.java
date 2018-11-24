package in.co.a2t.repository;

import in.co.a2t.model.CompanyContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyContactRepository extends JpaRepository<CompanyContact, Long> {
}
