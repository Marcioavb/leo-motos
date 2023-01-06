package br.com.leomotos.leomotos.moto.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.leomotos.leomotos.moto.domain.Moto;

public interface MotoRepository {
	Moto salvaMoto(Moto moto);
	List<Moto> buscaMotosDoClienteComId(UUID idCliente);
	Moto buscaMotopeloId(UUID idMoto);
	void deletaMoto(Moto moto);
	Moto buscaMotosDoClientePorPlaca(String placa);
}