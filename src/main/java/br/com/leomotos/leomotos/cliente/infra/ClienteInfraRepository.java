package br.com.leomotos.leomotos.cliente.infra;

import org.springframework.stereotype.Repository;
import br.com.leomotos.leomotos.cliente.application.repository.ClienteRepository;
import br.com.leomotos.leomotos.cliente.application.repository.SpringDataJPARepository;
import br.com.leomotos.leomotos.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Repository
public class ClienteInfraRepository implements ClienteRepository {
	private final   SpringDataJPARepository springDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[ininia] ClienteInfraRepository -  salva");
		springDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository -  salva");
		return cliente;
	}
}
