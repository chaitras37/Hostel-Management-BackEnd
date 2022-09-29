package practise_security.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	private int guest_id;
	private String name;
	private String emailid;
	private String suggestion;
	private int rating;
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Review(int guest_id, String name, String emailid, String suggestion, int rating) {
		super();
		this.guest_id = guest_id;
		this.name = name;
		this.emailid = emailid;
		this.suggestion = suggestion;
		this.rating = rating;
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Review [guest_id=" + guest_id + ", name=" + name + ", emailid=" + emailid + ", suggestion=" + suggestion
				+ ", rating=" + rating + "]";
	}
	
	
	
	

}
