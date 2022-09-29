package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.MaleGuestRoom;
@Repository
public interface MaleGuestRoomRepository extends JpaRepository<MaleGuestRoom, Integer> {

	@Query("select r from MaleGuestRoom r where r.room_status=?1")
	List<MaleGuestRoom> findAvailable(Boolean room_status);

}
