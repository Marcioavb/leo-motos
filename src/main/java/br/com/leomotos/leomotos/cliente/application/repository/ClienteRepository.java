package br.com.leomotos.leomotos.cliente.application.repository;

import br.com.leomotos.leomotos.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
