package br.com.leomotos.leomotos.moto.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.leomotos.leomotos.moto.dimain.Marca;
import br.com.leomotos.leomotos.moto.dimain.TipoDeServico;
import lombok.Value;

@Value
public class MotoClientedetalahadoResponse {

	private UUID idMoto;
	private UUID idClientePropietario;
	private String placa;
	private LocalDate ano;
	private String cor;
	private String modelo;
	private Marca marca;
	private TipoDeServico tipoDeServico;
}
