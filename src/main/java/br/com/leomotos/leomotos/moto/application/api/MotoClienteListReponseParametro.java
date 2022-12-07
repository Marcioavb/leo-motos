package br.com.leomotos.leomotos.moto.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.leomotos.leomotos.moto.dimain.Marca;
import br.com.leomotos.leomotos.moto.dimain.Moto;
import lombok.Value;

@Value
public class MotoClienteListReponseParametro {
	private UUID idMoto;
	private String placa;
	private String modelo;
	private Marca marca;

	public MotoClienteListReponseParametro(Moto moto) {
		this.idMoto = moto.getIdMoto();
		this.placa = moto.getPlaca();
		this.modelo = moto.getModelo();
		this.marca = moto.getMarca();
	}
	
	public static List<MotoClienteListReponseParametro> converte(List<Moto> motosDocliente) {
		return motosDocliente.stream()
				.map(MotoClienteListReponseParametro :: new)
				.collect(Collectors.toList());
	}
}
