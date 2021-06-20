package com.job.portal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobPortalServerApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JobPortalServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Start....");
		
	}

}
