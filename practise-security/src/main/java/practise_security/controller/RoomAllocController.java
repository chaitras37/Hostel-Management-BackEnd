package practise_security.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practise_security.dao_service.RoomAllocService;
import practise_security.model.FemaleGuestRoomAllocation;
import practise_security.model.FemaleRoomAllocation;
import practise_security.model.MaleGuestRoomAllocation;
import practise_security.model.MaleRoomAllocation;


import java.util.List;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/roomalloc")

public class RoomAllocController {
@Autowired
private RoomAllocService roomAllocService;

//...........................male student room allocation.......................

@PostMapping("/insert")
public void insertOneRow(@RequestBody MaleRoomAllocation rooomalc) {
	roomAllocService.insertOne(rooomalc);
	
}

@PostMapping("/update/{room_no}/{bed_no}/{wing}")
public void updateRoomAlloc(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing,@RequestBody MaleRoomAllocation roomAllocation)
{
	
 roomAllocService.updateRoomAlloc(room_no,bed_no,wing,roomAllocation);
}


@GetMapping("/getoneroom/{room_no}/{bed_no}/{wing}")
public List<MaleRoomAllocation> getOneRoom(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing){
	
	return roomAllocService.getOneRoom(room_no,bed_no,wing);
}



@GetMapping("/deleteall")
public void deleteAll() {
	roomAllocService.deleteAll();
}

@GetMapping("/deleteone/{room_no}/{bed_no}/{wing}")
public void deleteOne(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing) {
	roomAllocService.deleteOne(room_no,bed_no,wing);
}

@GetMapping("/countroom")
public long countRoom() {
	return roomAllocService.countRoom();
}
@GetMapping("/checkoneroom/{room_no}/{bed_no}/{wing}")
public Boolean checkOneRoom(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing){
	System.out.println("Hey");
	return roomAllocService.checkRoom(room_no,bed_no,wing);
}

@GetMapping("/getallmalestu")
public List<MaleRoomAllocation> getAllThe() {
	return roomAllocService.getAllMaleStuRooms();
}

//...........................female student room allocation.......................

@GetMapping("/getallfemalestualloc")
public List<FemaleRoomAllocation> getAllThedet(){
	return roomAllocService.getFemaleRooms();
}

@PostMapping("/finsert")
public void finsertOneRow(@RequestBody FemaleRoomAllocation fRoomAllocation) {
	roomAllocService.finsertOne(fRoomAllocation);
	
}

@PostMapping("/fupdate/{room_no}/{bed_no}/{wing}")
public void fupdateRoomAlloc(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing,@RequestBody FemaleRoomAllocation fRoomAllocation)
{
	
 roomAllocService.fupdateRoomAlloc(room_no,bed_no,wing,fRoomAllocation);
}


@GetMapping("/fgetoneroom/{room_no}/{bed_no}/{wing}")
public List<FemaleRoomAllocation> fgetOneRoom(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing){
	
	return roomAllocService.fgetOneRoom(room_no,bed_no,wing);
}


@GetMapping("/fdeleteall")
public void fdeleteAll() {
	roomAllocService.fdeleteAll();
}

@GetMapping("/fdeleteone/{room_no}/{bed_no}/{wing}")
public void fdeleteOne(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing) {
	roomAllocService.fdeleteOne(room_no,bed_no,wing);
}

@GetMapping("/fcountroom")
public long fcountRoom() {
	return roomAllocService.fcountRoom();
}

@GetMapping("/fcheckoneroom/{room_no}/{bed_no}/{wing}")
public Boolean fcheckOneRoom(@PathVariable String room_no,@PathVariable char bed_no,@PathVariable String wing){
	System.out.println("Hey");
	return roomAllocService.fcheckRoom(room_no,bed_no,wing);
}

//........................ male guest room allocation................................

@GetMapping("/getallmaleguestalloc")
public List<MaleGuestRoomAllocation> getAllMaleGuestAlloc(){
	return roomAllocService.getAllMaleGuestRoomalloc();
}

@GetMapping("/getoneguestbygrid/{grid}")
public List<MaleGuestRoomAllocation> getOneGuestbyGRID(@PathVariable String grid){
	return roomAllocService.getOneGuestgrid(grid);
}

@PostMapping("/insertguest")
public void insertGuestOneRow(@RequestBody MaleGuestRoomAllocation guestRoomAllocation) {
	roomAllocService.insertGuestOneRow(guestRoomAllocation);
	
}

@GetMapping("/getguestrooms/{room_no}")
public boolean getGuestRoom(@PathVariable Integer room_no){
	return roomAllocService.getGuestRoom(room_no);
}

@PostMapping("/updateguest/{room_no}")
public void updateRoomAlloc(@PathVariable Integer room_no,@RequestBody MaleGuestRoomAllocation guestRoomAllocation)
{
	
 roomAllocService.updateGuestRoomAlloc(room_no,guestRoomAllocation);
}

@GetMapping("/deleteallguest")
public void deleteAllGuest() {
	roomAllocService.deleteAllGuest();
}

@GetMapping("/deleteoneguest/{room_no}")
public void deleteOneGuest(@PathVariable Integer room_no) {
	roomAllocService.deleteOneGuest(room_no);
}

@GetMapping("/countguestroom")
public long countGuestRoom() {
	return roomAllocService.countRoomGuest();
}

// ............................... female guest room allocation............................

@GetMapping("/getallfemaleguestroomalloc")
public List<FemaleGuestRoomAllocation> getAllFemaleGuestAllocRoom(){
	return roomAllocService.getallFGuestRoomAlloc();
}

@PostMapping("/finsertguest")
public void finsertGuestOneRow(@RequestBody FemaleGuestRoomAllocation fGuestRoomAllocation) {
	roomAllocService.finsertGuestOneRow(fGuestRoomAllocation);
	
}

@GetMapping("/fgetguestrooms/{room_no}")
public boolean fgetGuestRoom(@PathVariable Integer room_no){
	return roomAllocService.fgetGuestRoom(room_no);
}

@PostMapping("/fupdateguest/{room_no}")
public void fupdateRoomAlloc(@PathVariable Integer room_no,@RequestBody FemaleGuestRoomAllocation fGuestRoomAllocation)
{
	
 roomAllocService.fupdateGuestRoomAlloc(room_no,fGuestRoomAllocation);
}

@GetMapping("/fdeleteallguest")
public void fdeleteAllGuest() {
	roomAllocService.fdeleteAllGuest();
}

@GetMapping("/fdeleteoneguest/{room_no}")
public void fdeleteOneGuest(@PathVariable Integer room_no) {
	roomAllocService.fdeleteOneGuest(room_no);
}

@GetMapping("/fcountguestroom")
public long fcountGuestRoom() {
	return roomAllocService.fcountGuestRoom();
}

@GetMapping("/getfemaleguestroom/{guest_name}")
public List<FemaleGuestRoomAllocation> getFemaleGuestRoom(@PathVariable String guest_name){
 return roomAllocService.getFemaleGuestRoom(guest_name);
}
@GetMapping("/getfemaleroom/{student_name}")
public List<FemaleRoomAllocation> getFemaleRoom(@PathVariable String student_name){
	return roomAllocService.getFemaleRoom(student_name);
}

@GetMapping("/getmaleroom/{student_name}")
public List<MaleRoomAllocation> getMaleRoom(@PathVariable String student_name){
	return roomAllocService.getMaleRoom(student_name);
}
}
