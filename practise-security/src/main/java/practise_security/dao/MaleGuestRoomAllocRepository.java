package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.MaleGuestRoomAllocation;

@Repository
public interface MaleGuestRoomAllocRepository extends JpaRepository<MaleGuestRoomAllocation, Integer> {

	
	@Query(
			  value = "SELECT * FROM male_guest_room_allocation WHERE guest_name = ?1", 
			  nativeQuery = true)
	List<MaleGuestRoomAllocation> findbygrid(String grid);


}


