package practise_security.dao_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practise_security.dao.FemaleGuestRoomRepository;
import practise_security.dao.FemaleRoomRepository;
import practise_security.dao.MaleGuestRoomRepository;
import practise_security.dao.MaleRoomRepository;
import practise_security.model.FemaleGuestRoom;
import practise_security.model.FemaleRoom;
import practise_security.model.FemaleRoomId;
import practise_security.model.MaleGuestRoom;
import practise_security.model.MaleRoom;
import practise_security.model.MaleRoomId;

@Service
public class RoomService {
	
	//.....................Male room.................................................................

	@Autowired
	private MaleRoomRepository maleRoomRepository;
	
	public void updateMaleRoom(String room_no, char bed_no, String wing, MaleRoom maleRoom) {
		// TODO Auto-generated method stub
		System.out.println(maleRoomRepository.existsById(new MaleRoomId(room_no,bed_no,wing)));
		if(maleRoomRepository.existsById(new MaleRoomId(room_no,bed_no,wing)))
		{
			maleRoomRepository.save(maleRoom);
		}
		
	}
	
	public List<MaleRoom> getAllMaleStu(Boolean room_status) {
		// TODO Auto-generated method stub
		return maleRoomRepository.findAvailable(room_status);
	}
	
	//...........................female room.........................................................
	
	@Autowired
	private FemaleRoomRepository femaleRoomRepository;
  
	public void updateFemleRoom(String room_no, char bed_no, String wing,FemaleRoom femaleRoom) {
		// TODO Auto-generated method stub
		if(femaleRoomRepository.existsById(new FemaleRoomId(room_no,bed_no,wing))) 
		{
			femaleRoomRepository.save(femaleRoom);
		}
	}
	
	public List<FemaleRoom> getAllFemalestu(Boolean room_status) {
		// TODO Auto-generated method stub
		return femaleRoomRepository.findAvailable(room_status);
	}
	
	//..............................male guest room..................................................
	
	@Autowired
	private MaleGuestRoomRepository maleGuestRoomRepository;

	public void updateMaleGuestRoom(int room_no, MaleGuestRoom maleGuestRoom) {
		// TODO Auto-generated method stub
		if(maleGuestRoomRepository.existsById(room_no))
		{
			maleGuestRoomRepository.save(maleGuestRoom);
		}
	}
	
	public List<MaleGuestRoom> getAllMaleGuests(Boolean room_status) {
		// TODO Auto-generated method stub
		return maleGuestRoomRepository.findAvailable(room_status);
	}

	//....................female guest room..........................................................
	
	@Autowired
	private FemaleGuestRoomRepository femaleGuestRoomRepository;
	
	public void updateFemaleGuestRoom(int room_no, FemaleGuestRoom femaleGuestRoom) {
		// TODO Auto-generated method stub
		if(femaleGuestRoomRepository.existsById(room_no))
		{
			femaleGuestRoomRepository.save(femaleGuestRoom);
		}
		
	}
	
	public List<FemaleGuestRoom> getAllFemaleGuests(Boolean room_status) {
		// TODO Auto-generated method stub
		return femaleGuestRoomRepository.findAvailable(room_status);
	}
	
	

}
