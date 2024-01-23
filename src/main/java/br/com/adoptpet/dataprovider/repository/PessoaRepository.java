package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    Optional<PessoaEntity> findByNome(String nome);
}
