package placement.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Placement {
@Id
private long id;
private String name;
private LocalDate date;
private String qualification;
private int year;

@ManyToOne(optional=false)
@JoinColumn(name="coll_Id")
private College college;

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
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification + ", year="
			+ year + ", college=" + college + "]";
}

}
