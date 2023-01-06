package br.com.leomotos.leomotos.moto.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.leomotos.leomotos.moto.domain.Marca;
import br.com.leomotos.leomotos.moto.domain.TiposDeSerevico;
import lombok.Value;

@Value
public class MotoAlteracaoRequest {
	@NotBlank
	private String placa;
	private Marca marca;
	@NotBlank
	private String modelo;
	@NotNull
	private LocalDate ano;
	@NotBlank
	private String cor;
	private TiposDeSerevico tiposDeSerevico;
}