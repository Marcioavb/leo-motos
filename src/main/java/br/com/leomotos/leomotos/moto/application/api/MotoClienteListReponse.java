package br.com.leomotos.leomotos.moto.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.leomotos.leomotos.moto.domain.Marca;
import br.com.leomotos.leomotos.moto.domain.Moto;
import br.com.leomotos.leomotos.moto.domain.TiposDeSerevico;
import lombok.Value;

@Value
public class MotoClienteListReponse {
	private UUID idMoto;
	private String placa;
	private Marca marca;
	private String modelo;
	private LocalDate ano;
	private TiposDeSerevico tiposDeSerevico;
	private String cor;
	
	public MotoClienteListReponse(Moto moto) {
		this.idMoto = moto.getIdMoto();
		this.placa = moto.getPlaca();
		this.marca = moto.getMarca();
		this.modelo = moto.getModelo();
		this.ano = moto.getAno();
		this.cor = moto.getCor();
		this.tiposDeSerevico = moto.getTiposDeSerevico();
	}

	public static List<MotoClienteListReponse> converte(List<Moto> motosDocliente) {
		return motosDocliente.stream()
				.map(MotoClienteListReponse::new)
				.collect(Collectors.toList());
	}
}