package br.com.leomotos.leomotos.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.leomotos.leomotos.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicio] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicio] ClienteController - getTodosClientes");
		log.info("[inicio] ClienteController - getTodosClientes");
		return null;
	}
}
