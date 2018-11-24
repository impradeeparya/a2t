package in.co.a2t.repository;

import in.co.a2t.model.ContributorProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributorProfileRepository extends JpaRepository<ContributorProfile, Long> {
}
