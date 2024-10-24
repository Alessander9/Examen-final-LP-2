package pe.com.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pe.com.cibertec"})
public class ExamenFinalLpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalLpApplication.class, args);
	}

}
