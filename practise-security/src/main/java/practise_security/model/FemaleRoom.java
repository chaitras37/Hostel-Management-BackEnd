package practise_security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
//@Table(name = "femaleroom")
@IdClass(FemaleRoomId.class)
public class FemaleRoom {
	
	@Id
	@Column(length = 4, nullable = false)
	private String room_no;
	@Id
	@Column(nullable = false)
	private char bed_no;
	@Id
	@Column(length = 8,nullable = false)
	private String wing;
	@Column(nullable = false)
	private boolean room_status;
	
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
	public boolean isRoom_status() {
		return room_status;
	}
	public void setRoom_status(boolean room_status) {
		this.room_status = room_status;
	}
	public FemaleRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FemaleRoom(String room_no, char bed_no, String wing, boolean room_status) {
		super();
		this.room_no = room_no;
		this.bed_no = bed_no;
		this.wing = wing;
		this.room_status = room_status;
	}
	
	
}
