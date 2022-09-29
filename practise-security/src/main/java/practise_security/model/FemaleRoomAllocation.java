package practise_security.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
//@Table(name="student_room_allocation_female")

@IdClass(FemaleRoomAllocationId.class)
public class FemaleRoomAllocation {
	@Id
	@Column(length = 4, nullable = false)
	private String room_no;
	@Id
	@Column(nullable = false)
	private char bed_no;
	@Id
	@Column(length=8,nullable = false)
	private String wing;
//	@EmbeddedId
//	private RoomAllocationId roomAllocationId;

	@Column(length = 55, nullable = false)
	private String student_name;
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(nullable = false)
	private Date from_date;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(nullable = false)
	private Date till_date;
	@Column(nullable = false)
	private int fees;
	@Column(nullable = true)
	private int feepaid;
	@Column(nullable = true)
	private int dues;
	@Column(nullable = false)
	private boolean feestatus;
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public char getBed_no() {
		return bed_no;
	}
	public void setBed_no(char bed_no) {
		this.bed_no = bed_no;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTill_date() {
		return till_date;
	}
	public void setTill_date(Date till_date) {
		this.till_date = till_date;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getFeepaid() {
		return feepaid;
	}
	public void setFeepaid(int feepaid) {
		this.feepaid = feepaid;
	}
	public int getDues() {
		return dues;
	}
	public void setDues(int dues) {
		this.dues = dues;
	}
	public boolean isFeestatus() {
		return feestatus;
	}
	public void setFeestatus(boolean feestatus) {
		this.feestatus = feestatus;
	}
	public FemaleRoomAllocation(String room_no, char bed_no, String wing, String student_name, Student student,
			Date from_date, Date till_date, int fees, int feepaid, int dues, boolean feestatus) {
		super();
		this.room_no = room_no;
		this.bed_no = bed_no;
		this.wing = wing;
		this.student_name = student_name;
		this.student = student;
		this.from_date = from_date;
		this.till_date = till_date;
		this.fees = fees;
		this.feepaid = feepaid;
		this.dues = dues;
		this.feestatus = feestatus;
	}
	public FemaleRoomAllocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
