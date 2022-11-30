package br.com.leomotos.leomotos.moto.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomotos.leomotos.moto.dimain.Moto;

public interface MotoSpringDataJPARepository extends JpaRepository<Moto, UUID>{

}
