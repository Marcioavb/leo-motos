package br.com.leomotos.leomotos.moto.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.leomotos.leomotos.moto.application.api.MotoAlteracaoRequest;
import br.com.leomotos.leomotos.moto.application.api.MotoClienteListReponse;
import br.com.leomotos.leomotos.moto.application.api.MotoClienteListReponsePlaca;
import br.com.leomotos.leomotos.moto.application.api.MotoClienteDetalahadoResponse;
import br.com.leomotos.leomotos.moto.application.api.MotoRequest;
import br.com.leomotos.leomotos.moto.application.api.MotoResponse;

public interface MotoService {
	MotoResponse criaMoto(UUID idCliente, @Valid MotoRequest motoRequest);
	List<MotoClienteListReponse> buscaMotosdoClienteComId(UUID idCliente);
	MotoClienteDetalahadoResponse buscaMotodoClienteComId(UUID idCliente, UUID idMoto);
	void deletaMotoDoClienteComId(UUID idCliente, UUID idMoto);
	void alteraMotoDoClienteComId(UUID idCliente, UUID idMoto, MotoAlteracaoRequest motoAlteracaoRequest);
	MotoClienteListReponsePlaca buscaMotosdoClientePorPlaca( UUID idMoto, String placa);
}