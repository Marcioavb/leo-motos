package br.com.leomotos.leomotos.moto.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/moto")
public interface MotoAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	MotoResponse postMoto(@PathVariable UUID idCliente,
			@Valid @RequestBody MotoRequest motoRequest);
}
