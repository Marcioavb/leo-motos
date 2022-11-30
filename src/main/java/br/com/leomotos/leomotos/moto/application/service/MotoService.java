package br.com.leomotos.leomotos.moto.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.leomotos.leomotos.moto.application.api.MotoRequest;
import br.com.leomotos.leomotos.moto.application.api.MotoResponse;

public interface MotoService {
	MotoResponse criaMoto(UUID idCliente, @Valid MotoRequest motoRequest);
}
