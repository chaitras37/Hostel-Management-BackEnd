//package practise_security.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import practise_security.dao_service.StudentService;
//import practise_security.model.Student;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/basic")
//public class StuandGuestBasic {
//	@Autowired
//	private StudentService studentService;
//	
//  @GetMapping("/all")
//  public String allAccess() {
//    return "Public Content.";
//  }
//
//  @GetMapping("/user/{email}")
//
//  public List<Student> userReturn(@PathVariable String email) {
//	  System.out.println(email);
//    return studentService.oneReturn(email);
//  }
//  
//  @PostMapping("/insertdata")
//
//  public void createStudent(@RequestBody Student student) {
//	  studentService.createStudent(student);
//  }
//  
//  @GetMapping("/user")
//
//   public List<Student> allStudents() {
//     return studentService.allStu();
//   }
//  
////  @PostMapping("/update")
////  @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
////   public void updateStudent(@RequestBody Student student) {
////      //studentService.updateStudent(id,student);
////	  studentService.updateStudent(student);
////   }
//  
//  @GetMapping("/delete/{id}")
//
//   public void deleteStudent(@PathVariable int id) {
//     studentService.deleteStudent(id);
//   }
//  
//  
//  
//  @GetMapping("/inf")
//
//  public String userinfAccess() {
//    return "hello";
//  }
//  
//  
//
//  @GetMapping("/guest")
//
//  public String moderatorAccess() {
//    return "Guest Content.";
//  }
//}
