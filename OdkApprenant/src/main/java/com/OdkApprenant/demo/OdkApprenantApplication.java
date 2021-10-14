package com.OdkApprenant.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.ApprenantStatus;
import com.OdkApprenant.demo.repositories.ApprenantRepository;

@SpringBootApplication
public class OdkApprenantApplication  {
	@Autowired
	private ApprenantRepository apprenantRepository;

	public static void main(String[] args) {
		SpringApplication.run(OdkApprenantApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		apprenantRepository.save(new Apprenant(null, "ODK", "Kalanso", 21, 78897736, "Kalanso@gmail.com", "ODC","SS66", "f", ApprenantStatus.activer, new Date(), new Date()));
//		apprenantRepository.save(new Apprenant(null, "awa", "diallo", 21, 78897736, "fatou@gmail.com", "fatou","Diallo", "f", ApprenantStatus.activer, new Date(), new Date()));
//		apprenantRepository.save(new Apprenant(null, "aboubacar", "KONE", 21, 78897736, "delnasa3@gmail.com", "delnasa","M", "f", ApprenantStatus.activer, new Date(), new Date()));
//		apprenantRepository.save(new Apprenant(null, "rama", "niang", 21, 78897736, "rama@gmail.com", "rama","56778", "f", ApprenantStatus.activer, new Date(), new Date()));
//		apprenantRepository.save(new Apprenant(null, "salma", "ndjim", 21, 78897736, "salma@gmail.com", "salma","65778", "f", ApprenantStatus.activer, new Date(), new Date()));
//		apprenantRepository.save(new Apprenant(null, "hady", "fofana", 21, 78897736, "hady@gmail.com", "hady","23637", "f", ApprenantStatus.activer, new Date(), new Date()));
//		apprenantRepository.save(new Apprenant(null, "fatou", "ndjim", 21, 78897736, "fatou@gmail.com", "fanta","SS66", "f", ApprenantStatus.activer, new Date(), new Date()));
//		
//	}

	

}
