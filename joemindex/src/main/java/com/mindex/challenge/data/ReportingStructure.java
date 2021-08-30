/*
 * ReportingStructure.java
 *
 *                 
 * Author: Joseph Lynn
 * Date: 8.29.21
 */

package com.mindex.challenge.data;

import java.util.ArrayList;
import java.util.List;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import org.springframework.beans.factory.annotation.Autowired;




public class ReportingStructure {
    private Employee employee;
    private transient int numberOfReports;
    private EmployeeRepository employeeRepository;

    public ReportingStructure(Employee employee, EmployeeRepository employeeRepository) {
    	this.employee = employee;
    	this.employeeRepository = employeeRepository;
    }

    //Generates the number of reporting employees to reporting structure's employee
    public int getNumberOfReports() {
		List<Employee> reporters = employee.getDirectReports();
		List<Employee> totalReporters = new ArrayList<Employee>();
		
		//traverse all reporters and their reporters, ignore duplicates
		while(reporters != null && reporters.size() != 0) {
	        Employee currReporter = employeeRepository.findByEmployeeId(reporters.get(0).getEmployeeId());
			List<Employee> currReporterReports = currReporter.getDirectReports();
			if(currReporterReports != null) {
				for(Employee e : currReporterReports) {
					if(!containsId(totalReporters, e.getEmployeeId())) {
						totalReporters.add(e);
						reporters.add(e);
					}
				}
			}
			if(!containsId(totalReporters, currReporter.getEmployeeId())) {
				totalReporters.add(currReporter);
			}
			reporters.remove(0);
		}

		numberOfReports = totalReporters.size();
		return numberOfReports;
    }
    
    //checks if employee list contains element with a field equal to query
	private boolean containsId(final List<Employee> list, final String id){
	    return list.stream().filter(o -> o.getEmployeeId().equals(id)).findFirst().isPresent();
	}

}
