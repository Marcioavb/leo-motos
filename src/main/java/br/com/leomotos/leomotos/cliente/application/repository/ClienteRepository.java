package br.com.leomotos.leomotos.cliente.application.repository;

import java.util.List;

import br.com.leomotos.leomotos.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosclientes();
	
}


//Cliente salva(Cliente cliente);
//List<Cliente> buscaTodosclientes();
//Cliente buscaClienteAtravesId(UUID idCliente);
//void deletaCliente(Cliente cliente);
