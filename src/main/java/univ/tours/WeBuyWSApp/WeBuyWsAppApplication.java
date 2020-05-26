package univ.tours.WeBuyWSApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import univ.tours.WeBuyWSApp.service.IUserAdminService;

@SpringBootApplication
public class WeBuyWsAppApplication implements CommandLineRunner {
	
	@Autowired
	private IUserAdminService  userService;

	public static void main(String[] args) {
		SpringApplication.run(WeBuyWsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//userService.AddUser();
		
	}
	

}
