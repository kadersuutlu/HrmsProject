package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="verification_codes")
public class VerificationCode {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	
	@Column(name="email")
	public String email;
	
	@Column(name="code")
	public String code;
	
	@Column(name="is_verified")
	public boolean isVerified;
	
	@Column(name="verified_date")
	public String verifiedDate;

	public VerificationCode() {}
	
	public VerificationCode(int id, String email, String code, boolean isVerified, String verifiedDate) {
		super();
		this.id = id;
		this.email = email;
		this.code = code;
		this.isVerified = isVerified;
		this.verifiedDate = verifiedDate;
	}
}
