package com.springramework.dependences;

import com.springramework.dependences.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencesApplication.class, args);

		MyController myController = new MyController();
		System.out.println(myController.sayHello());
	}

}
