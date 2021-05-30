package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	
	@Column(name="company_name")
	public String companyName;
	
	@Column(name="web_address")
	public String webAddress;
	
	@Column(name="phone_number")
	public String phoneNumber;
	
	public Employer() {}

	public Employer(int id, String companyName, String webAddress, String phoneNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
}
