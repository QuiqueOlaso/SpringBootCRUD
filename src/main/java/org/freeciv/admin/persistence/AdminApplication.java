package org.freeciv.admin.persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// TODO: Auto-generated Javadoc
/**
 * The Class AdminApplication.
 */
@SpringBootApplication
@ComponentScan("org.freeciv.admin")
public class AdminApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// SpringApplication.run(HelloWorldApplication.class, args);
		SpringApplication.run(AdminApplication.class, args);
	}

}
