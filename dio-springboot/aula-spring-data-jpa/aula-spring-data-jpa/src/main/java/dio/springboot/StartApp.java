package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	@Override
	
	public void run(String... args) throws Exception {
	   User user = new User();
	   user.setName("Luiz Fabio");
//	   user.setUsername("Binho");
	   user.setPassword("123dia");
		
	   repository.saveAll(user);
	   
	   for(model.User u: repository.findAll()) {
		   System.out.println(u);
	   }
	   
	}
//	public UserRepository getRepository() {
//		return repository;
//	}
//	public void setRepository(UserRepository repository) {
//		this.repository = repository;
//	}

	
 
	
	
	
}
