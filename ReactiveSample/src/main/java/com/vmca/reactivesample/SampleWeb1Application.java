package com.vmca.reactivesample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SampleWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleWeb1Application.class, args);
	}

}
