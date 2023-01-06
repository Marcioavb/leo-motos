package br.com.leomotos.leomotos.moto.application.api;

import java.util.UUID;

import br.com.leomotos.leomotos.moto.domain.Marca;
import br.com.leomotos.leomotos.moto.domain.Moto;
import lombok.Value;

@Value
public class MotoClienteListReponsePlaca {
	private UUID idMoto;
	private String placa;
	private String modelo;
	private Marca marca;

	public MotoClienteListReponsePlaca(Moto moto) {
		this.idMoto = moto.getIdMoto();
		this.placa = moto.getPlaca();
		this.modelo = moto.getModelo();
		this.marca = moto.getMarca();
	}
}