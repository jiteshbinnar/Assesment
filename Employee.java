package com.springcore.com.springcore;

public class Employee {
private int eid;
private String eName;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((eName == null) ? 0 : eName.hashCode());
	result = prime * result + eid;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (eName == null) {
		if (other.eName != null)
			return false;
	} else if (!eName.equals(other.eName))
		return false;
	if (eid != other.eid)
		return false;
	return true;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", eName=" + eName + "]";
}

	
	
}
