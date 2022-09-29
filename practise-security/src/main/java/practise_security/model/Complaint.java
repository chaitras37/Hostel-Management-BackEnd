package practise_security.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="complaint")
public class Complaint {
	
@Id
private int s_no;
@Column(length = 55, nullable = false)
private String stdent_name;
@Column(length = 4,nullable = false)
private String room_no;
@Column(length = 5,nullable = false)
private String electricity;
@Column(length = 5,nullable = false)
private String drinking;
@Column(length = 5,nullable = false)
private String wi_fi;
@Column(length = 5,nullable = true)
private String laundary;
@Column(length = 5,nullable = true)
private String food_quality;
@Column(length = 5,nullable = true)
private String staff_behaviour;
@Column(length = 5,nullable = true)
private String cleanliness;
@Column(length = 5,nullable = true)
private String security;
@Column(length = 255)
private String other_complaintString;
@OneToOne(cascade = CascadeType.ALL)
private Student student;

public int getS_no() {
	return s_no;
}

public void setS_no(int s_no) {
	this.s_no = s_no;
}

public String getStdent_name() {
	return stdent_name;
}

public void setStdent_name(String stdent_name) {
	this.stdent_name = stdent_name;
}

public String getRoom_no() {
	return room_no;
}

public void setRoom_no(String room_no) {
	this.room_no = room_no;
}

public String getElectricity() {
	return electricity;
}

public void setElectricity(String electricity) {
	this.electricity = electricity;
}

public String getDrinking() {
	return drinking;
}

public void setDrinking(String drinking) {
	this.drinking = drinking;
}

public String getWi_fi() {
	return wi_fi;
}

public void setWi_fi(String wi_fi) {
	this.wi_fi = wi_fi;
}

public String getLaundary() {
	return laundary;
}

public void setLaundary(String laundary) {
	this.laundary = laundary;
}

public String getFood_quality() {
	return food_quality;
}

public void setFood_quality(String food_quality) {
	this.food_quality = food_quality;
}

public String getStaff_behaviour() {
	return staff_behaviour;
}

public void setStaff_behaviour(String staff_behaviour) {
	this.staff_behaviour = staff_behaviour;
}

public String getCleanliness() {
	return cleanliness;
}

public void setCleanliness(String cleanliness) {
	this.cleanliness = cleanliness;
}

public String getSecurity() {
	return security;
}

public void setSecurity(String security) {
	this.security = security;
}

public String getOther_complaintString() {
	return other_complaintString;
}

public void setOther_complaintString(String other_complaintString) {
	this.other_complaintString = other_complaintString;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public Complaint(int s_no, String stdent_name, String room_no, String electricity, String drinking, String wi_fi,
		String laundary, String food_quality, String staff_behaviour, String cleanliness, String security,
		String other_complaintString, Student student) {
	super();
	this.s_no = s_no;
	this.stdent_name = stdent_name;
	this.room_no = room_no;
	this.electricity = electricity;
	this.drinking = drinking;
	this.wi_fi = wi_fi;
	this.laundary = laundary;
	this.food_quality = food_quality;
	this.staff_behaviour = staff_behaviour;
	this.cleanliness = cleanliness;
	this.security = security;
	this.other_complaintString = other_complaintString;
	this.student = student;
}

public Complaint() {
	super();
	// TODO Auto-generated constructor stub
}





}
