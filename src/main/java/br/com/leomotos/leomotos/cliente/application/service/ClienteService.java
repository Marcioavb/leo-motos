package br.com.leomotos.leomotos.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.leomotos.leomotos.cliente.application.api.ClienteDetalhadoResponse;
import br.com.leomotos.leomotos.cliente.application.api.ClienteEditadoRequest;
import br.com.leomotos.leomotos.cliente.application.api.ClienteListResponse;
import br.com.leomotos.leomotos.cliente.application.api.ClienteRequest;
import br.com.leomotos.leomotos.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchEditaCliente(UUID idCliente, ClienteEditadoRequest clienteEditadoRequest);
	
}