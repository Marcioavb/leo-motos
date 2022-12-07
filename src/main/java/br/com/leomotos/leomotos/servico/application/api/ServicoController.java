package br.com.leomotos.leomotos.servico.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.leomotos.leomotos.servico.application.service.ServicoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ServicoController implements ServicoAPI {
	private final ServicoService servicoService;

	@Override
	public ServicoResponse postServico(UUID idMoto, @Valid ServicoRequest servicoRequest) {
		log.info("[inicio] MotoController - postServico");
		log.info("[idMoto] {} ", idMoto);
		ServicoResponse servico = servicoService.criaServico(idMoto, servicoService);
		log.info("[finaliza] MotoController - postServico");
		return servico;
	}
}
