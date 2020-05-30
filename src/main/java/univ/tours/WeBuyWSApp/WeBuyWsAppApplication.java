package univ.tours.WeBuyWSApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import univ.tours.WeBuyWSApp.service.IUserAdminService;
import univ.tours.WeBuyWSApp.service.InitWebuy;

@SpringBootApplication
public class WeBuyWsAppApplication implements CommandLineRunner {
	
	@Autowired
	private InitWebuy initWebuy;

	public static void main(String[] args) {
		SpringApplication.run(WeBuyWsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		initWebuy.afficher();
		initWebuy.initStore();
		initWebuy.initProduct();
		initWebuy.initUser();
		//initWebuy.initAdmin();
		//initWebuy.initDeal();
		//initWebuy.initPurshaseGroup();
		
	}
	

}
