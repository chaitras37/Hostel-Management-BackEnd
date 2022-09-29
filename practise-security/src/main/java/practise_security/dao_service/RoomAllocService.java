package practise_security.dao_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practise_security.dao.FemaleGuestRoomAllocRepository;
import practise_security.dao.FemaleRoomAllocRepository;
import practise_security.dao.GuestRepository;
import practise_security.dao.MaleGuestRoomAllocRepository;
import practise_security.dao.MaleRoomAllocRepository;
import practise_security.dao.StudentRepository;
import practise_security.model.FemaleGuestRoomAllocation;
import practise_security.model.FemaleRoomAllocation;
import practise_security.model.FemaleRoomAllocationId;
import practise_security.model.Guest;
import practise_security.model.MaleGuestRoomAllocation;
import practise_security.model.MaleRoomAllocation;
import practise_security.model.MaleRoomAllocationId;
import practise_security.model.Student;





@Service
public class RoomAllocService {
	
//.......................student room allocation.........................
@Autowired
private MaleRoomAllocRepository roomAllocRepository;
@Autowired
private StudentRepository studentRepository;
@Autowired
private GuestRepository guestRepository;

public void registerStudent(Student student) {
	studentRepository.save(student);
}


public void insertOne(MaleRoomAllocation rooomalc) {
	roomAllocRepository.save(rooomalc);
}


public List<MaleRoomAllocation> getOneRoom(String room_no, char bed_no, String wing) {
	// TODO Auto-generated method stub
	return roomAllocRepository.getOneRoom(room_no,bed_no,wing);
}


public void updateRoomAlloc(String room_no, char bed_no, String wing, MaleRoomAllocation roomAllocation) {
	// TODO Auto-generated method stub
	if(roomAllocRepository.existsById(new MaleRoomAllocationId(room_no,bed_no,wing)));
	{
		roomAllocRepository.save(roomAllocation);
	}
}
public Boolean checkRoom(String room_no, char bed_no, String wing) {
	// TODO Auto-generated method stub
	return roomAllocRepository.existsById(new MaleRoomAllocationId(room_no,bed_no,wing));
}



public void deleteAll() {
	// TODO Auto-generated method stub
	roomAllocRepository.deleteAll();
	
}


public void deleteOne(String room_no, char bed_no, String wing) {
	// TODO Auto-generated method stub
	if(roomAllocRepository.existsById(new MaleRoomAllocationId(room_no,bed_no,wing)));
	{
		roomAllocRepository.deleteById(new MaleRoomAllocationId(room_no,bed_no,wing));
	}
}



public long countRoom() {
	// TODO Auto-generated method stub
	return roomAllocRepository.count();
}

public List<MaleRoomAllocation> getAllMaleStuRooms() {
	return roomAllocRepository.findAll();
	
}

//......................female student room allocation...............

@Autowired
private FemaleRoomAllocRepository fRoomAllocRepository;

public void finsertOne(FemaleRoomAllocation fRoomAllocation) {
	// TODO Auto-generated method stub
	fRoomAllocRepository.save(fRoomAllocation);
	
}


public void fupdateRoomAlloc(String room_no, char bed_no, String wing, FemaleRoomAllocation fRoomAllocation) {
	// TODO Auto-generated method stub
	if(fRoomAllocRepository.existsById(new FemaleRoomAllocationId(room_no,bed_no,wing)));
	{
		fRoomAllocRepository.save(fRoomAllocation);
	}
}

public List<FemaleRoomAllocation> fgetOneRoom(String room_no, char bed_no, String wing) {
	// TODO Auto-generated method stub
	return fRoomAllocRepository.fgetOneRoom(room_no, bed_no, wing);
}

public void fdeleteAll() {
	// TODO Auto-generated method stub
	fRoomAllocRepository.deleteAll();
}

public void fdeleteOne(String room_no, char bed_no, String wing) {
	// TODO Auto-generated method stub
	if(fRoomAllocRepository.existsById(new FemaleRoomAllocationId(room_no,bed_no,wing)));
	{
		fRoomAllocRepository.deleteById(new FemaleRoomAllocationId(room_no,bed_no,wing));
	}
}

public long fcountRoom() {
	// TODO Auto-generated method stub
	return fRoomAllocRepository.count();
}
public Boolean fcheckRoom(String room_no, char bed_no, String wing) {
	return  fRoomAllocRepository.existsById(new FemaleRoomAllocationId(room_no,bed_no,wing));
	
}

public List<FemaleRoomAllocation> getFemaleRooms() {
	// TODO Auto-generated method stub
	return fRoomAllocRepository.findAll();
}


//........................... male guest room allocation....................

@Autowired
private MaleGuestRoomAllocRepository guestRoomAllocRepository;

public void insertGuestOneRow(MaleGuestRoomAllocation guestRoomAllocation) {
	// TODO Auto-generated method stub
	guestRoomAllocRepository.save(guestRoomAllocation);
}

public void registerGuest(Guest guest) {
	guestRepository.save(guest);
}

public boolean getGuestRoom(Integer room_no) {
	// TODO Auto-generated method stub
	System.out.println("pls work");
	return guestRoomAllocRepository.existsById(room_no );
}


public void updateGuestRoomAlloc(Integer room_no, MaleGuestRoomAllocation guestRoomAllocation) {
	// TODO Auto-generated method stub
	if(guestRoomAllocRepository.existsById(room_no));
	{
		guestRoomAllocRepository.save(guestRoomAllocation);
	}
}


public void deleteAllGuest() {
	// TODO Auto-generated method stub
	guestRoomAllocRepository.deleteAll();
}


public void deleteOneGuest(Integer room_no) {
	// TODO Auto-generated method stub
	if(guestRoomAllocRepository.existsById(room_no)){
		guestRoomAllocRepository.deleteById(room_no);
	}
	
}


public long countRoomGuest() {
	// TODO Auto-generated method stub
	return guestRoomAllocRepository.count();
}


public List<MaleGuestRoomAllocation> getAllMaleGuestRoomalloc() {
	// TODO Auto-generated method stub
	return guestRoomAllocRepository.findAll();
}


//............................female guest room allocation......................

@Autowired
private FemaleGuestRoomAllocRepository fGuestRoomAllocRepository;


public void finsertGuestOneRow(FemaleGuestRoomAllocation fGuestRoomAllocation) {
	// TODO Auto-generated method stub
	fGuestRoomAllocRepository.save(fGuestRoomAllocation);
	
}


public boolean fgetGuestRoom(Integer room_no) {
	// TODO Auto-generated method stub
	return fGuestRoomAllocRepository.existsById(room_no);
}


public void fupdateGuestRoomAlloc(Integer room_no, FemaleGuestRoomAllocation fGuestRoomAllocation) {
	// TODO Auto-generated method stub
	if(fGuestRoomAllocRepository.existsById(room_no));
	{
		fGuestRoomAllocRepository.save(fGuestRoomAllocation);
	}
	
}


public void fdeleteAllGuest() {
	// TODO Auto-generated method stub
	fGuestRoomAllocRepository.deleteAll();
}


public void fdeleteOneGuest(Integer room_no) {
	// TODO Auto-generated method stub
	if(fGuestRoomAllocRepository.existsById(room_no)){
		fGuestRoomAllocRepository.deleteById(room_no);
	}
}


public long fcountGuestRoom() {
	// TODO Auto-generated method stub
	return fGuestRoomAllocRepository.count();
}


public List<FemaleGuestRoomAllocation> getallFGuestRoomAlloc() {
	// TODO Auto-generated method stub
	return fGuestRoomAllocRepository.findAll();
}


public List<MaleGuestRoomAllocation> getOneGuestgrid(String grid) {
	// TODO Auto-generated method stub
	return guestRoomAllocRepository.findbygrid(grid);
}
public List<FemaleGuestRoomAllocation> getFemaleGuestRoom(String guest_name) {
	// TODO Auto-generated method stub
	return fGuestRoomAllocRepository.getFemaleGuestRoom(guest_name);
}

public List<MaleRoomAllocation> getMaleRoom(String student_name) {
	// TODO Auto-generated method stub
	return roomAllocRepository.getMaleRoom(student_name);
}


public List<FemaleRoomAllocation> getFemaleRoom(String student_name) {
	// TODO Auto-generated method stub
	return fRoomAllocRepository.getFemaleRoom(student_name);
}






















}

