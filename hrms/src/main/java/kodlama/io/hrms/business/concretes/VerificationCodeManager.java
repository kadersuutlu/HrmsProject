package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.VerificationCodeService;
import kodlama.io.hrms.dataAccess.abstracts.VerificationCodeDao;
import kodlama.io.hrms.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{

	private VerificationCodeDao verificationCodeDao;

	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}
	
	@Override
	public List<VerificationCode> getAll(){
		return this.verificationCodeDao.findAll();
	}
	
}
