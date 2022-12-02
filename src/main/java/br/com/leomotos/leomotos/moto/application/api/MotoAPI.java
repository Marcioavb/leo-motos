package br.com.leomotos.leomotos.moto.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<MotoClienteListReponse> getMotosDoClienteComId 
	(@PathVariable UUID idCliente);
	
	@GetMapping(value = "/{idMoto}")
	@ResponseStatus(code = HttpStatus.OK)
	MotoClientedetalahadoResponse getMotoDoClienteComId 
	(@PathVariable UUID idCliente, @PathVariable UUID idMoto);
	
	@DeleteMapping(value = "/{idMoto}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaMotoDoClienteAtravesdoId(@PathVariable UUID idCliente, @PathVariable UUID idMoto);
	
	@PatchMapping(value = "/{idMoto}")
	@ResponseStatus (code = HttpStatus.NO_CONTENT)
	void patchMoto(@PathVariable UUID idCliente, @PathVariable UUID idMoto,
			@Valid @RequestBody MotoAlteracaoRequest motoAlteracaoRequest);
}




