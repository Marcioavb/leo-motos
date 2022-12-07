package br.com.leomotos.leomotos.servico.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idServico", updatable = false, unique = true, nullable = false)
	private UUID idServico;
	@Column(columnDefinition = "uuid", name = "idMotoCliente", nullable = false)
	private UUID idMotoCliente;
	@NotBlank
	private TipoDeServico tipoDeServico;
	
	private LocalDateTime dataDoServico;
}
