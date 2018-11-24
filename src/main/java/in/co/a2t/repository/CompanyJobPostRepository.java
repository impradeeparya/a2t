package in.co.a2t.repository;

import in.co.a2t.model.CompanyJobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyJobPostRepository extends JpaRepository<CompanyJobPost, Long> {
}
