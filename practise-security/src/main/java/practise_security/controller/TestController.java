package practise_security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practise_security.dao.StudentRepository;
import practise_security.dao_service.StudentService;
import practise_security.model.Complaint;
import practise_security.model.Guest;
import practise_security.model.Review;
import practise_security.model.Student;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dao")
public class TestController {
	@Autowired
	private StudentService studentService;
	
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }
  @GetMapping("/checkstuuser/{email}")
  //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public Long checkStudata(@PathVariable String email) {
 	  System.out.println(email);
     return studentService.checkOnedata(email);
   }
  
  @GetMapping("/checkguestuser/{email}")
  //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public Long checkGuestdata(@PathVariable String email) {
 	  System.out.println(email);
     return studentService.checkOneGuestdata(email);
   }
  
  
  
  @GetMapping("/user/{email}")
 //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
  public List<Student> userReturn(@PathVariable String email) {
	  System.out.println(email);
    return studentService.oneReturn(email);
  }
  
  @PostMapping("/insertdata")
 // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
  public void createStudent(@RequestBody Student student) {
	  studentService.createStudent(student);
  }
  
  @GetMapping("/user")
 // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public List<Student> allUsers() {
     return studentService.allUsers();
   }
  
  @PostMapping("/update/{srid}")
 // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public void updateStudent(@PathVariable int srid, @RequestBody Student student) {
      //studentService.updateStudent(id,student);
	  studentService.updateStudent(srid,student);
   }
  
  
  @GetMapping("/delete/{srid}")
 // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public void deleteStudent(@PathVariable int srid) {
     studentService.deleteStudent(srid);
   }
  
  
  
  @GetMapping("/inf")
 // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
  public String userinfAccess() {
    return "hello";
  }
  
  

//  @GetMapping("/guest")
// // @PreAuthorize("hasRole('GUEST') or hasRole('ADMIN')")
//  public String moderatorAccess() {
//    return "Guest Content.";
//  }

  @GetMapping("/admin")
 // @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Admin Content.";
  }
  
  
  
  @PostMapping("/insertguestdata")
  // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public void createGuest(@RequestBody Guest guest) {
 	  studentService.createGuest(guest);
   }
   
   @GetMapping("/guest")
  // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Guest> allGuests() {
      return studentService.allGuests();
    }
   
   @PostMapping("/updateguest/{grid}")
  // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public void updateGuest(@PathVariable int grid, @RequestBody Guest guest) {
       //studentService.updateStudent(id,student);
 	  studentService.updateGuest(grid,guest);
    }
   
   
   @GetMapping("/deleteguest/{srid}")
  // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public void deleteGuest(@PathVariable int grid) {
      studentService.deleteGuest(grid);
    }
   
   @GetMapping("/currentguest/{email}")
   // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
     public List<Guest> allParticularGuest(@PathVariable String email) {
       return studentService.currentGuest(email);
     }
   
   //reviews
   @PostMapping("/review")
   // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
     public void insertreview(@RequestBody Review review) {
	   System.out.println(review);
       studentService.insertreview(review);
     }
   
   //complaint
   @PostMapping("/complaintBox")
   // @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
   public void insertcomplaint(@RequestBody Complaint complaint) {
	   studentService.insertcomplaint(complaint);
   }
  
}