package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.FemaleGuestRoomAllocation;

@Repository
public interface FemaleGuestRoomAllocRepository extends JpaRepository<FemaleGuestRoomAllocation, Integer> {
	@Query( value = "SELECT * FROM  female_guest_room_allocation WHERE guest_name = ?1", 
			nativeQuery = true)
			List<FemaleGuestRoomAllocation> getFemaleGuestRoom(String guest_name);
}
