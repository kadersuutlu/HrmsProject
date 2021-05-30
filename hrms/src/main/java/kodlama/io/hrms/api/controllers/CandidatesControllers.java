package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates")
public class CandidatesControllers {
	
	private CandidateService candidateService;

	@Autowired
	public CandidatesControllers(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	public List<Candidate> getAll(){
		return this.candidateService.getAll();
	}
}
