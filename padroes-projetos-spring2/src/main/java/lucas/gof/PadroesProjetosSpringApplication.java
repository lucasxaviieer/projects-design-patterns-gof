package lucas.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// habilita o feign no nosso projeto, apra ele saber que vamos usar ele
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetosSpringApplication.class, args);
	}

}
