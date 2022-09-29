package practise_security.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
//@Table(name="student_details")
public class Student {

	@Id
	
//	@SequenceGenerator(name = "port_gen", sequenceName = "port_gen",  initialValue = 9891170 )
//	@GeneratedValue(strategy = GenerationType.AUTO, generator="port_gen")
	@SequenceGenerator(name = "seqn_gen",sequenceName = "seqn_gen",initialValue = 9891170)
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "seqn_gen")
    private int srid;
	@Column(length = 45, nullable = false)
    private String student_full_name;
	@Column(length = 45, nullable = false)
    private String  parent_full_name;
	@Column(length = 45, nullable = false)
    private String email;
	@Column(length = 10,nullable = false)
    private long  student_mo_no;
	@Column(length = 10,nullable = false)
    private long  parent_mo_no;
	@Column(length = 6,nullable = false)
    private String gender;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
    private Date dob;
	@Column(length = 225,nullable = false)
    private String address;
	@Column(length = 45,nullable = false)
	private String city;
	@Column(length = 6,nullable = false)
    private int pincode;
	@Column(length = 45,nullable = false)
	private String state;
	@Column(length = 45,nullable = false)
	private String course_applied;
	@Column(length = 45,nullable = false)
	private String college_name;
	@Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date admission_date;
	@Column(length = 30,nullable = false)
    private String branch;
	public int getSrid() {
		return srid;
	}
	public void setSrid(int srid) {
		this.srid = srid;
	}
	public String getStudent_full_name() {
		return student_full_name;
	}
	public void setStudent_full_name(String student_full_name) {
		this.student_full_name = student_full_name;
	}
	public String getParent_full_name() {
		return parent_full_name;
	}
	public void setParent_full_name(String parent_full_name) {
		this.parent_full_name = parent_full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getStudent_mo_no() {
		return student_mo_no;
	}
	public void setStudent_mo_no(long student_mo_no) {
		this.student_mo_no = student_mo_no;
	}
	public long getParent_mo_no() {
		return parent_mo_no;
	}
	public void setParent_mo_no(long parent_mo_no) {
		this.parent_mo_no = parent_mo_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCourse_applied() {
		return course_applied;
	}
	public void setCourse_applied(String course_applied) {
		this.course_applied = course_applied;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public Date getAdmission_date() {
		return admission_date;
	}
	public void setAdmission_date(Date admission_date) {
		this.admission_date = admission_date;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String student_full_name, String parent_full_name, String email, long student_mo_no,
			long parent_mo_no, String gender, Date dob, String address, String city, int pincode, String state,
			String course_applied, String college_name, Date admission_date, String branch) {
		super();
		this.student_full_name = student_full_name;
		this.parent_full_name = parent_full_name;
		this.email = email;
		this.student_mo_no = student_mo_no;
		this.parent_mo_no = parent_mo_no;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.course_applied = course_applied;
		this.college_name = college_name;
		this.admission_date = admission_date;
		this.branch = branch;
	}
	
	
	
      
	
	
}
