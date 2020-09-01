package me.snikit.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootappApplication {

	/*
	 * /users IMPERATIVE APIS
	 * 
	 *  /reactive/users REACTIVE APIS
	 */

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}

}
