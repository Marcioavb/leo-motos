package br.com.leomotos.leomotos.moto.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.leomotos.leomotos.cliente.application.service.ClienteService;
import br.com.leomotos.leomotos.moto.application.api.MotoRequest;
import br.com.leomotos.leomotos.moto.application.api.MotoResponse;
import br.com.leomotos.leomotos.moto.application.repository.MotoRepository;
import br.com.leomotos.leomotos.moto.dimain.Moto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class MotoApplicationService implements MotoService {
	private final ClienteService clienteService;
	private final MotoRepository motoRepository;

	@Override
	public MotoResponse criaMoto(UUID idCliente, @Valid MotoRequest motoRequest) {
		log.info("[inicio] MotoApplicationService - criaMoto");
		clienteService.buscaClienteAtravesId(idCliente);
		Moto moto = motoRepository.salvaMoto (new Moto(idCliente, motoRequest));
		log.info("[termino] MotoApplicationService - criaMoto");
		return new MotoResponse(moto.getIdMoto());
	}
}
