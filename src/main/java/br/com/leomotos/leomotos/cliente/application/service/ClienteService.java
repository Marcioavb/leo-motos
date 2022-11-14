package br.com.leomotos.leomotos.cliente.application.service;

import br.com.leomotos.leomotos.cliente.application.api.ClienteRequest;
import br.com.leomotos.leomotos.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
