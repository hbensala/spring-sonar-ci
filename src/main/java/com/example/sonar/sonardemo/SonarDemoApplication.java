package com.example.sonar.sonardemo;

import com.example.sonar.sonardemo.example.Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarDemoApplication.class, args);
		Example example = new Example();
	}

}
