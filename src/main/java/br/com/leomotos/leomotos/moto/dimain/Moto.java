package br.com.leomotos.leomotos.moto.dimain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.leomotos.leomotos.moto.application.api.MotoAlteracaoRequest;
import br.com.leomotos.leomotos.moto.application.api.MotoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Moto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idMoto", updatable = false, unique = true, nullable = false)
	private UUID idMoto;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idClientePropietario", nullable = false)
	private UUID idClientePropietario;
	@NotNull
	@Column(unique = true)
	private String placa;
	@NotNull
	private LocalDate ano;
	@NotBlank
	private String cor;
	@NotBlank
	private String modelo;
	private Marca marca;

	private LocalDateTime dataDoServico;
	private LocalDateTime dataHoraDoUltimoServico;

	public Moto(UUID idCliente, @Valid MotoRequest motoRequest) {
		this.idClientePropietario = idCliente;
		this.placa = motoRequest.getPlaca();
		this.ano = motoRequest.getAno();
		this.cor = motoRequest.getCor();
		this.modelo = motoRequest.getModelo();
		this.marca = motoRequest.getMarca();
		this.dataDoServico = LocalDateTime.now();
	}
	public void altera(MotoAlteracaoRequest motoRequest) {
		this.placa = motoRequest.getPlaca();
		this.ano = motoRequest.getAno();
		this.cor = motoRequest.getCor();
		this.modelo = motoRequest.getModelo();
		this.marca = motoRequest.getMarca();
		this.dataHoraDoUltimoServico = LocalDateTime.now();
	}
}


