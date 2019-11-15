package programadorwho.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import programadorwho.api.entities.Empresa;
import programadorwho.api.repositories.EmpresaRepository;

@SpringBootTest
@ActiveProfiles("test")
class ApiSpringApplicationTests {

	@Autowired
	private EmpresaRepository empresaRepository;

	Empresa empresa;

	public Empresa instanceEmpresa() {
		return new Empresa();
	}

	// @Disabled
	@Test
	public void entityTest() {

		Empresa empresa1 = instanceEmpresa();
		Empresa empresa2 = instanceEmpresa();

		empresa1.setCnpj("019.123.345-00");
		empresa1.setRazaoSocial("casa do churrasco");

		empresa2.setCnpj("019.123.345-11");
		empresa2.setRazaoSocial("casa do queijo");

		empresaRepository.save(empresa1);
		empresaRepository.save(empresa2);
		List<Empresa> empresaList = empresaRepository.findAll();
		System.out.println("\n\n\n\n\n");
		empresaList.forEach(System.out::println);
		System.out.println("\n\n\n\n\n");
		if (empresaList.size() > 0) {
			assertEquals(2, empresaList.size());
			assertEquals((Long) 1L, empresaList.get(0).getId());
			assertEquals((Long) 2L, empresaList.get(1).getId());
		}

	}

//	@Value("${valor_maximo}")
//	private int valor_maximo;
//
//	@Test
//	void contextLoads() {
//		assertEquals(50, this.valor_maximo);
//	}

}
