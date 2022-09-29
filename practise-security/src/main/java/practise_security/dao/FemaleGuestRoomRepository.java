package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.FemaleGuestRoom;
@Repository
public interface FemaleGuestRoomRepository extends JpaRepository<FemaleGuestRoom, Integer> {

	@Query("select r from FemaleGuestRoom r where r.room_status=?1 ")
	List<FemaleGuestRoom> findAvailable(Boolean room_status);
	
	

}
