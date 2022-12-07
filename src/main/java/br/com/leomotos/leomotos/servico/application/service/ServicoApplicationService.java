package br.com.leomotos.leomotos.servico.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.leomotos.leomotos.servico.application.api.ServicoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ServicoApplicationService implements ServicoService {
	//private final MotoService motoService;
  //  private final ClienteService clienteService;
    
	@Override
	public ServicoResponse criaServico( UUID idMoto, ServicoService servicoService) {
		log.info("[inicio] ServicoApplicationService - criaServico");
		//clienteService.buscaClienteAtravesId(idMoto);
		//motoService.buscaMotodoClienteComId(idMoto, idMoto);
		log.info("[finaliza] ServicoApplicationService - criaServico");
		return null;
	}
}

