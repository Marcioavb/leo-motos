package br.com.leomotos.leomotos.moto.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.leomotos.leomotos.moto.application.repository.MotoRepository;
import br.com.leomotos.leomotos.moto.dimain.Moto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class MotoInfraRepository implements MotoRepository {
	private final MotoSpringDataJPARepository motoSpringDataJPARepository;

	@Override
	public Moto salvaMoto(Moto moto) {
		log.info("[inicio] MotoInfraRepository - salvaMoto");
		motoSpringDataJPARepository.save(moto);
		log.info("[termino] MotoInfraRepository - salvaMoto");
		return moto;

	}

	@Override
	public List<Moto> buscaMotosDoClienteComId(UUID idCliente) {
		log.info("[inicio] MotoInfraRepository - buscaMotosDoClienteComId");
		var motos  = motoSpringDataJPARepository.findByIdClientePropietario(idCliente);
		log.info("[termino] MotoInfraRepository - buscaMotosDoClienteComId");
		return motos;
	}
}



