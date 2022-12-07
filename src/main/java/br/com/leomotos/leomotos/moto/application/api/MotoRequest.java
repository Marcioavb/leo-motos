package br.com.leomotos.leomotos.moto.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.leomotos.leomotos.moto.dimain.Marca;
import lombok.Value;

@Value
public class MotoRequest {
	
	@NotBlank
	private String placa;
	private Marca marca;
	@NotBlank
	private String modelo;
	@NotNull
	private LocalDate ano;
	@NotBlank
	private String cor;
}

