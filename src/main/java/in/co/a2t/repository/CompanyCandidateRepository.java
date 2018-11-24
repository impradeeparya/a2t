package in.co.a2t.repository;

import in.co.a2t.model.CompanyCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyCandidateRepository extends JpaRepository<CompanyCandidate, Long> {
}
