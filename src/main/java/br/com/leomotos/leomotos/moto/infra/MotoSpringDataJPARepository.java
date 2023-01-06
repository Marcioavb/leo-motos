package br.com.leomotos.leomotos.moto.infra;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomotos.leomotos.moto.domain.Moto;

public interface MotoSpringDataJPARepository extends JpaRepository<Moto, UUID>{
	List<Moto> findByidClientePropietario(UUID idClienteTutor);
	Optional<Moto> findByPlaca(String placa);
}