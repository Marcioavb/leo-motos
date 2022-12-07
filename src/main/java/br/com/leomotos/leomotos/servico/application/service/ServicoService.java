package br.com.leomotos.leomotos.servico.application.service;

import java.util.UUID;

import br.com.leomotos.leomotos.servico.application.api.ServicoResponse;

public interface ServicoService {
	ServicoResponse criaServico (UUID idMoto, ServicoService servicoService);
}