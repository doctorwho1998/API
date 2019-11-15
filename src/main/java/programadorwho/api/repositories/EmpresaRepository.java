package programadorwho.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import programadorwho.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
