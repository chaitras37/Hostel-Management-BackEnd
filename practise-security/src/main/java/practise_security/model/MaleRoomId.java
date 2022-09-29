package practise_security.model;

import java.io.Serializable;
import java.util.Objects;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class MaleRoomId implements Serializable {

	private String room_no;
	private char bed_no;
	private String wing;
	
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
	public MaleRoomId(String room_no, char bed_no, String wing) {
		super();
		this.room_no = room_no;
		this.bed_no = bed_no;
		this.wing = wing;
	}
	public MaleRoomId() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(bed_no, room_no, wing);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaleRoomId other = (MaleRoomId) obj;
		return bed_no == other.bed_no && Objects.equals(room_no, other.room_no) && Objects.equals(wing, other.wing);
	}
	
	
}
	
	
