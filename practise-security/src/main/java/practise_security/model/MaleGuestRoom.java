package practise_security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "maleguestroom")
public class MaleGuestRoom {
	
	@Id
	@Column(nullable = false)
	private int room_no;
	@Column(length = 8,nullable = false)
	private String wing;
	@Column(nullable = false)
	private boolean room_status;
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
	public boolean isRoom_status() {
		return room_status;
	}
	public void setRoom_status(boolean room_status) {
		this.room_status = room_status;
	}
	public MaleGuestRoom(int room_no, String wing, boolean room_status) {
		super();
		this.room_no = room_no;
		this.wing = wing;
		this.room_status = room_status;
	}
	public MaleGuestRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
