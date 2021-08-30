/*
 * ReportingStructureController.java
 *
 *                 
 * Author: Joseph Lynn
 * Date: 8.29.21
 */

package com.mindex.challenge.controller;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private ReportingStructureService reportingStructureService;

    //handles the get requests for a reporting structure given a user id
    @GetMapping("/reportingstructure/{id}")
    public ReportingStructure get(@PathVariable String id) {
        LOG.debug("Received reportingstructure get request for id [{}]", id);

        return reportingStructureService.get(id);
    }
    
}
