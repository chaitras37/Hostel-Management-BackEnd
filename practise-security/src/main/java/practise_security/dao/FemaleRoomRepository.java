package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.FemaleRoom;
import practise_security.model.FemaleRoomId;
@Repository
public interface FemaleRoomRepository extends JpaRepository<FemaleRoom, FemaleRoomId> {

	@Query("select r from FemaleRoom r where r.room_status=?1 ")
	List<FemaleRoom> findAvailable(Boolean room_status);

}
