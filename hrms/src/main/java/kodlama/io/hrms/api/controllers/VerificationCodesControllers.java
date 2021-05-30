package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.VerificationCodeService;
import kodlama.io.hrms.entities.concretes.VerificationCode;

@RestController
@RequestMapping("/api/verificationcodes")
public class VerificationCodesControllers {

		private VerificationCodeService verificationCodeService;

		@Autowired
		public VerificationCodesControllers(VerificationCodeService verificationCodeService) {
			super();
			this.verificationCodeService = verificationCodeService;
		}
		
		@GetMapping("/getall")
		public List<VerificationCode> getAll(){
			return this.verificationCodeService.getAll();		
		}
		
}
