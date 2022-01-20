package placement.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class College {
@Id
private long id;
private String collegeName;
private String location;

@OneToOne
@JoinColumn(name = "Coll_Admin", referencedColumnName = "id")
private User collegeAdmin;


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}
public User getCollegeAdmin() {
	return collegeAdmin;
}
public void setCollegeAdmin(User collegeAdmin) {
	this.collegeAdmin = collegeAdmin;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

@Override
public String toString() {
	return "College [id=" + id + ", collegeName=" + collegeName + ", location=" + location + ", collegeAdmin="
			+ collegeAdmin + "]";
}



}
