package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="candidates")
public class Candidate {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	
	@Column(name="first_name")
	public String firstName;
	
	@Column(name="last_name")
	public String lastName;
	
	@Column(name="identity_number")
	public String identityNumber;
	
	@Column(name="birth_of_year")
	public String birthOfYear;
	
	public Candidate() {}
	
	public Candidate(int id, String firstName, String lastName, String identityNumber, String birthOfYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthOfYear = birthOfYear;
	}
}
