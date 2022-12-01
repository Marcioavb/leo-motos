package br.com.leomotos.leomotos.moto.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.leomotos.leomotos.moto.dimain.Moto;

public interface MotoRepository {
	Moto salvaMoto(Moto moto);
	List<Moto> buscaMotosDoClienteComId(UUID idCliente);
}
