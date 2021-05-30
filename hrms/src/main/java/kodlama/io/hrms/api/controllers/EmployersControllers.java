package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersControllers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	public List<Employer> getAll(){
		return this.employerService.getAll()
;	}
	
}
