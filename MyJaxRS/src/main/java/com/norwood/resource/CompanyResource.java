package com.norwood.resource;

import com.norwood.domain.Employee;
import com.norwood.service.EmployeeService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/employees")
public class EmployeeResource {
    @GET
    public Set<Employee> getEmployees(){



        return new EmployeeService().getEmployees();

    }

}
