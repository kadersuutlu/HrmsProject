package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity               //Hangi katman olduğunu spring framework sorar.Annotation yöntemiyle//User bir entity'dir.
@Table(name="users")  //veritabanında hangi tabloya denk gelir.
public class User {
	
	@Id                   //Tablodaki id alanı sorgular bu id'ye göre yapılır.
	@GeneratedValue       //id'nin nasıl arttırıldığı (birer birer)
	@Column(name="id")    //bu alan veritabanında hangi kolona karşılık gelir.
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public User() {}
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
}

