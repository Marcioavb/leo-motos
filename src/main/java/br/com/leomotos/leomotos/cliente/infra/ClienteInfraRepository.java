package br.com.leomotos.leomotos.cliente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.leomotos.leomotos.cliente.application.repository.ClienteRepository;
import br.com.leomotos.leomotos.cliente.application.repository.ClienteSpringDataJPARepository;
import br.com.leomotos.leomotos.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Repository
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository  clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository -  salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository -  salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosclientes() {
		log.info("[ininia] ClienteInfraRepository -  buscaTodosclientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository -  buscaTodosclientes");
		return todosClientes;
	}
}

