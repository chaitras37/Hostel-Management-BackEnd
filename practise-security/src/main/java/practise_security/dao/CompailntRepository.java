package practise_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practise_security.model.Complaint;

@Repository
public interface CompailntRepository extends JpaRepository<Complaint, Integer> {

}
