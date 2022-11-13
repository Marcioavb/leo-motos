package br.com.leomotos.leomotos.cliente.domain;

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

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDateTime dataNascimento;
	@CPF
	private String cpf;
	@NotNull
	private Boolean aceitaTermos;

	private LocalDateTime datahoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @NotBlank @Email String email,
			@NotBlank String celular, String telefone, Sexo sexo, @NotNull LocalDateTime dataNascimento,
			@CPF String cpf, @NotNull Boolean aceitaTermos) {
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.aceitaTermos = aceitaTermos;
	}
}


