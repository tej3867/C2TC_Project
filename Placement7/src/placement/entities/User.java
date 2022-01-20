package placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
@Id
private long id;
private String name;
private String type;
private String password;

@OneToOne(mappedBy = "collegeAdmin")
private College coll;

public College getColl() {
	return coll;
}
public void setColl(College coll) {
	this.coll = coll;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", coll=" + coll + "]";
}


}
