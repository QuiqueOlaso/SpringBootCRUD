package org.freeciv.admin.persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// TODO: Auto-generated Javadoc
/**
 * The Class AdminApplication.
 */
@SpringBootApplication
@EnableJpaRepositories("org.freeciv.admin.*")
@ComponentScan(basePackages = { "org.freeciv.admin.*" })
@EntityScan("org.freeciv.admin.persistence.domain.*")
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
