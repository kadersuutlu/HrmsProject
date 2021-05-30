package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{
//JpaRepository verdiğin veritipi (entity annotation ile süslenmiş nesne) için 
//primary key alnını alarak sorguları intellience ona göre hazırlar
	
	
}
