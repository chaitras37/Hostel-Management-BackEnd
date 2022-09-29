package practise_security.dao;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import practise_security.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("SELECT s FROM Student s WHERE s.email=:e")
	public List<Student> findByEmail(@Param("e") String email_id);
	
	@Query(
			  value = "SELECT EXISTS(SELECT * FROM student WHERE email = ?1)", 
			  nativeQuery = true)
	public Long checkbyemail(String email);
	

}
