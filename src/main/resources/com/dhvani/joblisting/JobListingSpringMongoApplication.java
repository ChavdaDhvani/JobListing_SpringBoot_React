package com.dhvani.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(
	    exclude = {
	        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
	        org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
	    }
	)
public class JobListingSpringMongoApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(JobListingSpringMongoApplication.class, args);
	}

}
