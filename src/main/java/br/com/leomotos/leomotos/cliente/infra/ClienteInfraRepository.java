package br.com.leomotos.leomotos.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.leomotos.leomotos.cliente.application.repository.ClienteRepository;
import br.com.leomotos.leomotos.cliente.domain.Cliente;
import br.com.leomotos.leomotos.handler.APIException;
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

	@Override
	public Cliente buscaClienteAtravesId(UUID idCliente){
		log.info("[ininia] ClienteInfraRepository -  getClienteAtravesDoId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente nao encontardo!"));
		log.info("[finaliza] ClienteInfraRepository -  getClienteAtravesDoId");
		return cliente;
	}

	@Override
	public void deletaClienteAtravesId(Cliente cliente) {
		log.info("[ininia] ClienteInfraRepository -  deletaClienteAtravesId");
		clienteSpringDataJPARepository.delete(cliente);
		log.info("[ininia] ClienteInfraRepository -  deletaClienteAtravesId");
	}

	@Override
	public Cliente getClienteAtravesDoCpf(String cpf) {
		log.info("[ininia] ClienteInfraRepository -  getClienteAtravesDoCpf");
		Cliente cliente = clienteSpringDataJPARepository.findByCpf(cpf)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente nao encontardo!"));
		log.info("[finaliza] ClienteInfraRepository -  getClienteAtravesDoCpf");
		return cliente;
	}
}