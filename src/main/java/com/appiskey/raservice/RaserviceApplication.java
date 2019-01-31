package com.appiskey.raservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;

@SpringBootApplication
@EntityListeners(AuditingEntityListener.class)
public class RaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaserviceApplication.class, args);
	}

}

