package br.com.leomotos.leomotos.servico.application.api;

import javax.validation.constraints.NotBlank;

import br.com.leomotos.leomotos.servico.domain.TipoDeServico;
import lombok.Value;

@Value
public class ServicoRequest {
	@NotBlank
	private TipoDeServico tipoDeServico;
	
}
