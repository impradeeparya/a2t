package in.co.a2t.repository;

import in.co.a2t.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRespository extends JpaRepository<Company, Long> {
}
