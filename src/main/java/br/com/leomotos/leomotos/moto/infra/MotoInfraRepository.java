package br.com.leomotos.leomotos.moto.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.leomotos.leomotos.handler.APIException;
import br.com.leomotos.leomotos.moto.application.repository.MotoRepository;
import br.com.leomotos.leomotos.moto.domain.Moto;
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
		var motos  = motoSpringDataJPARepository.findByidClientePropietario(idCliente);
		log.info("[termino] MotoInfraRepository - buscaMotosDoClienteComId");
		return motos;
	}

	@Override
	public Moto buscaMotopeloId(UUID idMoto) {
		log.info("[inicio] MotoInfraRepository - buscaMotopeloId");
		var moto = motoSpringDataJPARepository.findById(idMoto).orElseThrow(
				()-> APIException.build(HttpStatus.NOT_FOUND, "Moto nao encontrada para o idMoto = " +idMoto));
		log.info("[termino] MotoInfraRepository - buscaMotopeloId");
		return moto;
	}

	@Override
	public void deletaMoto(Moto moto) {
		log.info("[inicio] MotoInfraRepository - deletaMoto");
		motoSpringDataJPARepository.delete(moto);
		log.info("[termino] MotoInfraRepository - deletaMoto");
	}

	@Override
	public Moto buscaMotosDoClientePorPlaca(String placa) {
		log.info("[inicio] MotoInfraRepository - buscaMotosDoClientePorPlaca");
		var moto = motoSpringDataJPARepository.findByPlaca(placa).orElseThrow(
				()-> APIException.build(HttpStatus.NOT_FOUND, "placa de moto nao existe" + placa));
		log.info("[finaliza] MotoInfraRepository - buscaMotosDoClientePorPlaca");
		return moto;
	}
}