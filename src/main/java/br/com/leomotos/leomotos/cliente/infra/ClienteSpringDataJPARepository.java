package br.com.leomotos.leomotos.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomotos.leomotos.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}
