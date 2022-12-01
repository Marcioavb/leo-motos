package br.com.leomotos.leomotos.moto.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.leomotos.leomotos.moto.dimain.Marca;
import br.com.leomotos.leomotos.moto.dimain.Moto;
import br.com.leomotos.leomotos.moto.dimain.TipoDeServico;
import lombok.Value;

@Value
public class MotoClientedetalahadoResponse {

	private UUID idMoto;
	private String placa;
	private LocalDate ano;
	private String cor;
	private String modelo;
	private Marca marca;
	private TipoDeServico tipoDeServico;
	
	public MotoClientedetalahadoResponse(Moto moto) {
		this.idMoto = moto.getIdMoto();
		this.placa = moto.getPlaca();
		this.ano = moto.getAno();
		this.cor = moto.getCor();
		this.modelo = moto.getModelo();
		this.marca = moto.getMarca();
		this.tipoDeServico = moto.getTipoDeServico();
	}
}
