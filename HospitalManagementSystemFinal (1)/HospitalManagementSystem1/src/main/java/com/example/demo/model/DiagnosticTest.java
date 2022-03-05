package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public class DiagnosticTest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer diagnosticTestId;
	private String testName;
	private Double testPrice;
	private String normalValue;
	private String units;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Appointment appointment;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticCenter diagnosticCenter;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<DiagnosticCenter> diagnosticCenter;

	public Integer getDiagnosticTestId() {
		return diagnosticTestId;
	}

	public void setDiagnosticTestId(Integer diagnosticTestId) {
		this.diagnosticTestId = diagnosticTestId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Double getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(Double testPrice) {
		this.testPrice = testPrice;
	}

	public String getNormalValue() {
		return normalValue;
	}

	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<DiagnosticCenter> getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(List<DiagnosticCenter> diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointment, diagnosticCenter, diagnosticTestId, normalValue, testName, testPrice, units);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiagnosticTest other = (DiagnosticTest) obj;
		return Objects.equals(appointment, other.appointment)
				&& Objects.equals(diagnosticCenter, other.diagnosticCenter)
				&& Objects.equals(diagnosticTestId, other.diagnosticTestId)
				&& Objects.equals(normalValue, other.normalValue) && Objects.equals(testName, other.testName)
				&& Objects.equals(testPrice, other.testPrice) && Objects.equals(units, other.units);
	}

	public DiagnosticTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DiagnosticTest [diagnosticTestId=" + diagnosticTestId + ", testName=" + testName + ", testPrice="
				+ testPrice + ", normalValue=" + normalValue + ", units=" + units + ", appointment=" + appointment
				+ ", diagnosticCenter=" + diagnosticCenter + "]";
	}


	
}