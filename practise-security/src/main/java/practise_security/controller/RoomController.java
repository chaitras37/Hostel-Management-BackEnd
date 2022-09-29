package practise_security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practise_security.dao_service.RoomService;
import practise_security.model.FemaleGuestRoom;
import practise_security.model.FemaleRoom;
import practise_security.model.MaleGuestRoom;
import practise_security.model.MaleRoom;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/room")
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	//.........................male room...............
	
	@PostMapping("/updatemaleroom/{room_no}/{bed_no}/{wing}")
	public void updateMaleRoom(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing, @RequestBody MaleRoom maleRoom) {
		roomService.updateMaleRoom(room_no,bed_no,wing,maleRoom);
	}
	
	@GetMapping("/allstumalerooms/{room_status}")
	public List<MaleRoom> getAllMaleStuRooms(@PathVariable Boolean room_status) {
		return roomService.getAllMaleStu(room_status);
	}
	
	
	//..........................female room...........
	
	@PostMapping("/updatefemaleroom/{room_no}/{bed_no}/{wing}")
	public void updateFemleRoom(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing, @RequestBody FemaleRoom femaleRoom) {
		roomService.updateFemleRoom(room_no,bed_no,wing,femaleRoom);
	}
	
	@GetMapping("/allstufemalerooms/{room_status}")
	public List<FemaleRoom> getAllFemaleStuRooms(@PathVariable Boolean room_status){
		return roomService.getAllFemalestu(room_status);
	}
	//........................male guest room..................
		
	@PostMapping("/updateguestmaleroom/{room_no}")
	public void updateMaleGuestRoom(@PathVariable int room_no,@RequestBody MaleGuestRoom maleGuestRoom)
	{
		roomService.updateMaleGuestRoom(room_no,maleGuestRoom);
	}
	
	@GetMapping("/getallmaleguestrooms/{room_status}")
	public List<MaleGuestRoom> getAllMaleGuestRooms(@PathVariable Boolean room_status){
		return roomService.getAllMaleGuests(room_status);
	}
	
	//.........................female guest room.................
	
	@PostMapping("/updateguestfemaleroom/{room_no}")
	public void updateFemaleGuestRoom(@PathVariable int room_no,@RequestBody FemaleGuestRoom femaleGuestRoom)
	{
		roomService.updateFemaleGuestRoom(room_no,femaleGuestRoom);
	}
	
	@GetMapping("/getallfemaleguestrooms/{room_status}")
	public List<FemaleGuestRoom> getAllFemaleGuestRooms(@PathVariable Boolean room_status){
		return roomService.getAllFemaleGuests(room_status);
	}
}
