package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.FemaleRoomAllocation;
import practise_security.model.FemaleRoomAllocationId;

@Repository
public interface FemaleRoomAllocRepository extends JpaRepository<FemaleRoomAllocation, FemaleRoomAllocationId> {

	@Query("SELECT r FROM FemaleRoomAllocation r WHERE r.room_no=?1 and r.bed_no=?2 and r.wing=?3")
	List<FemaleRoomAllocation> fgetOneRoom(String room_no, char bed_no, String wing);

	@Query( value = "SELECT * FROM female_room_allocation WHERE student_name = ?1", 
			  nativeQuery = true)
	List<FemaleRoomAllocation> getFemaleRoom(String student_name);
}
