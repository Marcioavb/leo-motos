package br.com.leomotos.leomotos.cliente.application.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomotos.leomotos.cliente.domain.Cliente;

public interface SpringDataJPARepository extends JpaRepository<Cliente, UUID> {

}
