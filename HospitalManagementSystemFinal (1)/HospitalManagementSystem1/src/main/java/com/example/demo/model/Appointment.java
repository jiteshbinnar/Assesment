package com.example.demo.model;


import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
public class Appointment{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appointmentId;
	//this name is for checking purpose whether data is added or not
	private String name;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date appointmentDate;
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;

	@OneToOne(cascade = CascadeType.ALL)
	private DiagnosticCenter diagnosticCenter;

	@OneToMany(cascade = CascadeType.ALL)
	private List<DiagnosticTest> diagnoticTest;

//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticTest diagnosticTest;

//	@OneToOne
//	private TestResult testResult;
	
//	private ApprovalStatus approvalStatus;
		

	
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<TestResult> testResult;

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	public List<DiagnosticTest> getDiagnoticTest() {
		return diagnoticTest;
	}

	public void setDiagnoticTest(List<DiagnosticTest> diagnoticTest) {
		this.diagnoticTest = diagnoticTest;
	}

	public List<TestResult> getTestResult() {
		return testResult;
	}

	public void setTestResult(List<TestResult> testResult) {
		this.testResult = testResult;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentDate, appointmentId, description, diagnosticCenter, diagnoticTest, name, patient,
				testResult);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appointmentDate, other.appointmentDate)
				&& Objects.equals(appointmentId, other.appointmentId) && Objects.equals(description, other.description)
				&& Objects.equals(diagnosticCenter, other.diagnosticCenter)
				&& Objects.equals(diagnoticTest, other.diagnoticTest) && Objects.equals(name, other.name)
				&& Objects.equals(patient, other.patient) && Objects.equals(testResult, other.testResult);
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", name=" + name + ", appointmentDate=" + appointmentDate
				+ ", description=" + description + ", patient=" + patient + ", diagnosticCenter=" + diagnosticCenter
				+ ", diagnoticTest=" + diagnoticTest + ", testResult=" + testResult + "]";
	}


}
