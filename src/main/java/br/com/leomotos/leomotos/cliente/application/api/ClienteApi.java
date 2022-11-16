package br.com.leomotos.leomotos.cliente.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/cliente")
@RestController
public interface ClienteApi {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteResponse postCliente (@RequestBody @Valid ClienteRequest clienteRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	List<ClienteListResponse> getTodosClientes();
	
	@GetMapping (value = "/{idCliente}")
	@ResponseStatus(code = HttpStatus.OK)
	ClienteDetalhadoResponse getClienteAtravesDoId (@PathVariable UUID idCliente);
}
