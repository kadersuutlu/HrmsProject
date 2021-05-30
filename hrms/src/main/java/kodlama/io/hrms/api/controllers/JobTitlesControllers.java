package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobTitleService;
import kodlama.io.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesControllers {
	private JobTitleService jobTitlesService;

	public JobTitlesControllers(JobTitleService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitlesService.getAll()
;	}
}
