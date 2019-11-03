package programadorwho.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import programadorwho.api.utils.SenhaUtils;

@SpringBootApplication
public class ApiSpringApplication {

	@Value("${valor_maximo}")
	private int valor_maximo;

	@Bean
	public CommandLineRunner commandLineRunner() {

		return args -> {
			// System.out.println("Valor maximo " + this.valor_maximo);

			String senha = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Enconder " + senha);

			senha = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Enconder " + senha);

			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senha));

		};

	}

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringApplication.class, args);
	}

}
