package practise_security.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
//@Table(name="guest_room_allocation_female")

public class FemaleGuestRoomAllocation {
	
	@Id
	private int room_no;
	@Column(length = 8)
	private String wing;	
	@Column(length = 55)
	private String guest_name;
	@OneToOne(cascade = CascadeType.ALL)
	private Guest guest;
	@Temporal(TemporalType.DATE)
	private Date from_date;
	@Temporal(TemporalType.DATE)
	private Date till_date;
	private int fees;
	@Column(nullable = true)
	private int feepaid;
	@Column(nullable = true)
	private int dues;
	private boolean feestatus;
	
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
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
	public FemaleGuestRoomAllocation(int room_no, String wing, String guest_name, Guest guest, Date from_date,
			Date till_date, int fees, int feepaid, int dues, boolean feestatus) {
		super();
		this.room_no = room_no;
		this.wing = wing;
		this.guest_name = guest_name;
		this.guest = guest;
		this.from_date = from_date;
		this.till_date = till_date;
		this.fees = fees;
		this.feepaid = feepaid;
		this.dues = dues;
		this.feestatus = feestatus;
	}
	public FemaleGuestRoomAllocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
