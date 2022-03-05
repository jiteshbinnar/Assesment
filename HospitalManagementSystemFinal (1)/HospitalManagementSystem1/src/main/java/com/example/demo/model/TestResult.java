package com.example.demo.model;



import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public class TestResult {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer testId;
	private Double testReading;
	private String conditionP;

//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private  Appointment appointment;

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Double getTestReading() {
		return testReading;
	}

	public void setTestReading(Double testReading) {
		this.testReading = testReading;
	}

	public String getConditionP() {
		return conditionP;
	}

	public void setConditionP(String conditionP) {
		this.conditionP = conditionP;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointment, conditionP, testId, testReading);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestResult other = (TestResult) obj;
		return Objects.equals(appointment, other.appointment) && Objects.equals(conditionP, other.conditionP)
				&& Objects.equals(testId, other.testId) && Objects.equals(testReading, other.testReading);
	}

	public TestResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestResult [testId=" + testId + ", testReading=" + testReading + ", conditionP=" + conditionP
				+ ", appointment=" + appointment + "]";
	}


}
