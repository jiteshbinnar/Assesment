package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
public class DiagnosticCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dignosticId;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;
		
//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticTest diagnosticTest;
	
//	private List<String> servicesOffered;
	
	@ManyToMany
	@JoinTable(name = "DiagnosticCenter_DiagnosticTest", 
	joinColumns=
	@JoinColumn(name = "centerId"), 
	inverseJoinColumns = 
	@JoinColumn(name = "testId"))
	private List<DiagnosticTest> diagnosticTest;

	public Integer getDignosticId() {
		return dignosticId;
	}

	public void setDignosticId(Integer dignosticId) {
		this.dignosticId = dignosticId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<DiagnosticTest> getDiagnosticTest() {
		return diagnosticTest;
	}

	public void setDiagnosticTest(List<DiagnosticTest> diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, appointment, contactEmail, contactNo, diagnosticTest, dignosticId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiagnosticCenter other = (DiagnosticCenter) obj;
		return Objects.equals(address, other.address) && Objects.equals(appointment, other.appointment)
				&& Objects.equals(contactEmail, other.contactEmail) && Objects.equals(contactNo, other.contactNo)
				&& Objects.equals(diagnosticTest, other.diagnosticTest)
				&& Objects.equals(dignosticId, other.dignosticId) && Objects.equals(name, other.name);
	}

	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [dignosticId=" + dignosticId + ", name=" + name + ", contactNo=" + contactNo
				+ ", address=" + address + ", contactEmail=" + contactEmail + ", appointment=" + appointment
				+ ", diagnosticTest=" + diagnosticTest + "]";
	}
	


}
