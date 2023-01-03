package br.com.leomotos.leomotos.moto.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.leomotos.leomotos.moto.domain.Marca;
import br.com.leomotos.leomotos.moto.domain.Moto;
import br.com.leomotos.leomotos.moto.domain.TiposDeSerevico;
import lombok.Value;

@Value
public class MotoClienteDetalahadoResponse {

	private UUID idMoto;
	private String placa;
	private LocalDate ano;
	private String cor;
	private String modelo;
	private TiposDeSerevico tiposDeSerevico;
	private Marca marca;
	
	public MotoClienteDetalahadoResponse(Moto moto) {
		this.idMoto = moto.getIdMoto();
		this.placa = moto.getPlaca();
		this.ano = moto.getAno();
		this.cor = moto.getCor();
		this.modelo = moto.getModelo();
		this.marca = moto.getMarca();
		this.tiposDeSerevico = moto.getTiposDeSerevico();
	}
}