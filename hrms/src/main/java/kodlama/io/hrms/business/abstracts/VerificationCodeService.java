package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	List<VerificationCode> getAll();
}
