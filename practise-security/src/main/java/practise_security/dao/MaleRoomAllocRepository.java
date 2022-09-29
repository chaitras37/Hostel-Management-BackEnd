package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.MaleRoomAllocation;
import practise_security.model.MaleRoomAllocationId;

@Repository
public interface MaleRoomAllocRepository extends JpaRepository<MaleRoomAllocation, MaleRoomAllocationId>{

	@Query("SELECT r FROM MaleRoomAllocation r WHERE r.room_no=?1 and r.bed_no=?2 and r.wing=?3")
	List<MaleRoomAllocation> getOneRoom(String room_no, char bed_no, String wing);
	@Query( value = "SELECT * FROM male_room_allocation WHERE student_name = ?1", 
			  nativeQuery = true)
	List<MaleRoomAllocation> getMaleRoom(String student_name);
}
