package br.com.leomotos.leomotos.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.leomotos.leomotos.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosclientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
}


