/*
 * Compensation.java
 *
 *                 
 * Author: Joseph Lynn
 * Date: 8.29.21
 */

package com.mindex.challenge.data;

import java.util.Date;

public class Compensation {
	private Employee employee;
	private String employeeId;
	private Long salary;
	private Date effectiveDate;

	public Compensation() {
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
    
    public Date getDate() {
        return effectiveDate;
    }

    public void setDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
