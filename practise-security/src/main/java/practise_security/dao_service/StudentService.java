package practise_security.dao_service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practise_security.dao.CompailntRepository;
import practise_security.dao.GuestRepository;
import practise_security.dao.ReviewRepo;
import practise_security.dao.StudentRepository;
import practise_security.model.Complaint;
import practise_security.model.Guest;
import practise_security.model.Review;
import practise_security.model.Student;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;

@Autowired GuestRepository guestRepository;
@Autowired CompailntRepository complaintRepository;
@Autowired ReviewRepo reviewRepo;

public  List<Student> oneReturn(String email) {
	
	return studentRepository.findByEmail(email);
}

public void createStudent(Student student) {
	studentRepository.save(student);
	
}

public List<Student> allUsers() {
	// TODO Auto-generated method stub
	return studentRepository.findAll();
}

public void updateStudent(int srid,Student student) {
	// TODO Auto-generated method stub
	if(studentRepository.existsById(srid)) {
		studentRepository.save(student);
	}
	
}

public void deleteStudent(int srid) {
	if(studentRepository.existsById(srid))
	{
		studentRepository.deleteById(srid);
			
	}
}

public void createGuest(Guest guest) {
	// TODO Auto-generated method stub
	guestRepository.save(guest);
	
}

public List<Guest> allGuests() {
	// TODO Auto-generated method stub
	return guestRepository.findAll();
}

public void updateGuest(int grid, Guest guest) {
	// TODO Auto-generated method stub
	if(guestRepository.existsById(grid))
	{
		guestRepository.save(guest);
	}
	
}

public void deleteGuest(int grid) {
	// TODO Auto-generated method stub
	if(guestRepository.existsById(grid))
	{
		guestRepository.deleteById(grid);
	}
}

public Long checkOnedata(String email) {
	// TODO Auto-generated method stub
	return studentRepository.checkbyemail(email);
}

public List<Guest> currentGuest(String email) {
	// TODO Auto-generated method stub
	return guestRepository.findByEmail(email);
}

public Long checkOneGuestdata(String email) {
	// TODO Auto-generated method stub
	return guestRepository.checkbyemail(email);
}

public void insertreview(Review review) {
	// TODO Auto-generated method stub
	reviewRepo.save(review);
	
}

public void insertcomplaint(Complaint complaint) {
	// TODO Auto-generated method stub
	complaintRepository.save(complaint);
}





}
