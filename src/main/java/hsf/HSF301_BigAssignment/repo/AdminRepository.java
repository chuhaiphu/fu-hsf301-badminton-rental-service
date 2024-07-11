package hsf.HSF301_BigAssignment.repo;

import hsf.HSF301_BigAssignment.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String email);
}
