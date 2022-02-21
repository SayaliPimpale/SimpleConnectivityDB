package com.CRUIDSpring1;

public class Student {
 private int  employee_id;
 private  String  Firstname;
 private String lastname;
 private String city;
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [employee_id=" + employee_id + ", Firstname=" + Firstname + ", lastname=" + lastname + ", city="
			+ city + "]";
}
 
}
