package br.com.leomotos.leomotos.servico.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/moto/{idMoto}/servico")
public interface ServicoAPI {
	
	@PostMapping 
	@ResponseStatus(code = HttpStatus.CREATED)
	ServicoResponse postServico(@PathVariable UUID idMoto,
			@Valid @RequestBody ServicoRequest servicoRequest);
}

//<dependency>
//<groupId>org.springdoc</groupId>
//<artifactId>springdoc-openapi-ui</artifactId>
//<version>${spring-doc.version}</version>
//</dependency>


//<spring-doc.version>1.6.1</spring-doc.version>     //obs essa anotacao coloca embaixo da version java

//springdoc:
//	  swagger-ui:
//	    path: /public/swagger    // coloca no yml