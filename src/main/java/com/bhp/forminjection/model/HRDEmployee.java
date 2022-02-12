package com.bhp.forminjection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[HRDEmployee1]")
public class HRDEmployee {

	private long EmployeeKey;
	private String EmployeeName; 
	private String EmailAddr;
	
	
	
	public HRDEmployee(long employeeKey, String employeeName, String emailAddr) {
		super();
		EmployeeKey = employeeKey;
		EmployeeName = employeeName;
		EmailAddr = emailAddr;
	}
	
	
	public long getEmployeeKey() {
		return EmployeeKey;
	}
	public void setEmployeeKey(long employeeKey) {
		EmployeeKey = employeeKey;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmailAddr() {
		return EmailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		EmailAddr = emailAddr;
	}
	
	@Override
	public String toString() {
		return "HRDEmployee [EmployeeKey=" + EmployeeKey + ", EmployeeName=" + EmployeeName + ", EmailAddr=" + EmailAddr
				+ "]";
	}

	
}
