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


@Entity
//@Table(name="guest_details")
public class Guest {
@Id
@SequenceGenerator(name = "seqn_gen",sequenceName = "seqn_gen",initialValue = 1000)
@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "seqn_gen")
private int grid;
@Column(length=55, nullable = false)
private String email;
@Column(length=55, nullable = false)
private String guest_name;
@Column(length = 6,nullable = false)
private String gender;
@Column(length = 10,nullable = false)
private long mobile_no;
@Column(nullable = false)
@Temporal(TemporalType.DATE)
private Date dob;
@Column(length = 12,nullable = false)
private long aadhar_no;
@Column(length = 20,nullable = false)
private String id_proof;
@Column(nullable = false)
@Temporal(TemporalType.DATE)
private Date check_in_date;
@Column(nullable = false)
@Temporal(TemporalType.DATE)
private Date check_out_date;
@Column(length = 45,nullable = false)
private String room_type;
@Column (length = 225,nullable = false)
private String address;
@Column(length = 45,nullable = false)
private String city;
@Column(length = 45,nullable = false)
private String state;
@Column(length = 6,nullable = false)
private int pincode;
public int getGrid() {
	return grid;
}
public void setGrid(int grid) {
	this.grid = grid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGuest_name() {
	return guest_name;
}
public void setGuest_name(String guest_name) {
	this.guest_name = guest_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getMobile_no() {
	return mobile_no;
}
public void setMobile_no(long mobile_no) {
	this.mobile_no = mobile_no;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public long getAadhar_no() {
	return aadhar_no;
}
public void setAadhar_no(long aadhar_no) {
	this.aadhar_no = aadhar_no;
}
public String getId_proof() {
	return id_proof;
}
public void setId_proof(String id_proof) {
	this.id_proof = id_proof;
}
public Date getCheck_in_date() {
	return check_in_date;
}
public void setCheck_in_date(Date check_in_date) {
	this.check_in_date = check_in_date;
}
public Date getCheck_out_date() {
	return check_out_date;
}
public void setCheck_out_date(Date check_out_date) {
	this.check_out_date = check_out_date;
}
public String getRoom_type() {
	return room_type;
}
public void setRoom_type(String room_type) {
	this.room_type = room_type;
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Guest(String email, String guest_name, String gender, long mobile_no, Date dob, long aadhar_no, String id_proof,
		Date check_in_date, Date check_out_date, String room_type, String address, String city, String state,
		int pincode) {
	super();
	this.email = email;
	this.guest_name = guest_name;
	this.gender = gender;
	this.mobile_no = mobile_no;
	this.dob = dob;
	this.aadhar_no = aadhar_no;
	this.id_proof = id_proof;
	this.check_in_date = check_in_date;
	this.check_out_date = check_out_date;
	this.room_type = room_type;
	this.address = address;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}
public Guest() {
	super();
	// TODO Auto-generated constructor stub
}










}

