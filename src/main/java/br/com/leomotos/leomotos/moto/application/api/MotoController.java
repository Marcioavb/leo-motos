package br.com.leomotos.leomotos.moto.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.leomotos.leomotos.moto.application.service.MotoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class MotoController implements MotoAPI {
	private final MotoService motoService;

	@Override
	public MotoResponse postMoto(UUID idCliente, @Valid MotoRequest motoRequest) {
		log.info("[inicio] MotoController - postMoto");
		log.info("[idCliente] {}", idCliente);
		MotoResponse moto = motoService.criaMoto(idCliente, motoRequest);
		log.info("[termino] MotoController - postMoto");
		return moto;
	}

	@Override
	public List<MotoClienteListReponse> getMotosDoClienteComId(UUID idCliente) {
		log.info("[inicio] MotoController - getMotosDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		List<MotoClienteListReponse> motosDoCliente = 
				motoService.buscaMotosdoClienteComId(idCliente);
		log.info("[termino] MotoController - getMotosDoClienteComId");
		return motosDoCliente;
	}
}


