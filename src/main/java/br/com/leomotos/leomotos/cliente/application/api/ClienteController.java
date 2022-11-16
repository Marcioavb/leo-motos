package br.com.leomotos.leomotos.cliente.application.api;

import java.util.List;
import java.util.UUID;
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
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] ClienteController - getTodosClientes");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClienteAtravesDoId(UUID idCliente) {
		log.info("[inicio] ClienteController - getClienteAtravesDoId");
		log.info("[idCliente] {}", idCliente);
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteController - getClienteAtravesDoId");
		return clienteDetalhado;
	}

	@Override
	public void deletaClienteAtravesDoId(UUID idCliente) {
		log.info("[inicio] ClienteController - deletaClienteAtravesDoId");
		log.info("[idCliente] {}", idCliente);
		clienteService.deletaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteController - deletaClienteAtravesDoId");
	}
}










