package programadorwho.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiSpringApplication {

	@Value("${valor_maximo}")
	private int valor_maximo;

	@Bean
	public CommandLineRunner commandLineRunner() {

		return args -> {
			System.out.println("Valor maximo " + this.valor_maximo);
		};

	}

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringApplication.class, args);
	}

}
