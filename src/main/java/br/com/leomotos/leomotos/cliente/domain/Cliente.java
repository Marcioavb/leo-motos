package br.com.leomotos.leomotos.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import br.com.leomotos.leomotos.cliente.application.api.ClienteEditadoRequest;
import br.com.leomotos.leomotos.cliente.application.api.ClienteRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotNull
	private Boolean aceitaTermos;

	private LocalDateTime datahoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.celular = clienteRequest.getCelular();
		this.telefone = clienteRequest.getCelular();
		this.sexo = clienteRequest.getSexo();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.cpf = clienteRequest.getCpf();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.datahoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteEditadoRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.celular = clienteRequest.getCelular();
		this.telefone = clienteRequest.getCelular();
		this.sexo = clienteRequest.getSexo();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}