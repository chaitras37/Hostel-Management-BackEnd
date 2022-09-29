package practise_security.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practise_security.model.MaleRoom;
import practise_security.model.MaleRoomId;
@Repository
public interface MaleRoomRepository extends JpaRepository<MaleRoom, MaleRoomId> {

	@Query("select r from  MaleRoom r where r.room_status=?1")
	List<MaleRoom> findAvailable(Boolean room_status);

}
