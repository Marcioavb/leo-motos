package br.com.leomotos.leomotos.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import br.com.leomotos.leomotos.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteEditadoRequest {
	@NotNull
	private String nomeCompleto;
	@NotNull
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@NotNull
	private boolean aceitaTermos;
	
	public @NotNull Boolean getAceitaTermos() {
		return true;
	}
	
}
