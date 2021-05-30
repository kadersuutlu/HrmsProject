package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	
	private CandidateDao cadidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao cadidateDao) {
		super();
		this.cadidateDao = cadidateDao;
	}
	
	@Override
	public List<Candidate> getAll(){
		return this.cadidateDao.findAll()
;	}
	
	
}
