package practise_security.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
private long rid;
@Enumerated(EnumType.STRING)
private ERole name;
public Role(ERole name) {
	
	this.name = name;
}
public Role() {

	// TODO Auto-generated constructor stub
}
public long getRid() {
	return rid;
}
public void setRid(long rid) {
	this.rid = rid;
}
public ERole getName() {
	return name;
}
public void setName(ERole name) {
	this.name = name;
}


}
