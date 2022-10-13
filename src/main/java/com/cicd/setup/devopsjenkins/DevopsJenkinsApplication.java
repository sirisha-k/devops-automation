package com.cicd.setup.devopsjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsJenkinsApplication {

	@GetMapping(/welcome)
	public String message(){
	   return "welcome to siri program";
   }
	public static void main(String[] args) {
		SpringApplication.run(DevopsJenkinsApplication.class, args);
	}

}
