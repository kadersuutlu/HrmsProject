package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployeeService;
import kodlama.io.hrms.entities.concretes.Employee;

@RestController
@RequestMapping
public class EmployeesControllers {

		private EmployeeService employeeService;

		@Autowired
		public EmployeesControllers(EmployeeService employeeService) {
			super();
			this.employeeService = employeeService;
		}
		
		public List<Employee> getAll(){
			return this.employeeService.getAll()
;		}
		
}
