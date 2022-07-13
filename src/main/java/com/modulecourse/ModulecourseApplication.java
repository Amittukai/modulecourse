package com.modulecourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class ModulecourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModulecourseApplication.class, args);
	}

}
