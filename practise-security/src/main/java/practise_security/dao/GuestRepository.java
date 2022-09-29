package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {

	

	List<Guest> findByEmail(String email);
	@Query(
			  value = "SELECT EXISTS(SELECT * FROM guest WHERE email = ?1)", 
			  nativeQuery = true)
	Long checkbyemail(String email);

}
