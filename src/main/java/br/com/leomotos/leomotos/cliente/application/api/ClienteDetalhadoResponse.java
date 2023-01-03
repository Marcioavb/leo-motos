package br.com.leomotos.leomotos.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import br.com.leomotos.leomotos.cliente.domain.Cliente;
import br.com.leomotos.leomotos.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos;
	private LocalDateTime datahoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.sexo = cliente.getSexo();
		this.dataNascimento = cliente.getDataNascimento();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.datahoraDoCadastro = cliente.getDatahoraDoCadastro();
	}
}