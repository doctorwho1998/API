package programadorwho.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ApiSpringApplicationTests {

	@Value("${valor_maximo}")
	private int valor_maximo;

	@Test
	void contextLoads() {
		assertEquals(50, this.valor_maximo); 
	}

}
