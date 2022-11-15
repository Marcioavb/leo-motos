package br.com.leomotos.leomotos.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.leomotos.leomotos.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;
	

}
