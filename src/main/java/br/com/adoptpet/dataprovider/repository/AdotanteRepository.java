package br.com.adoptpet.dataprovider.repository;


import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdotanteRepository extends JpaRepository<AdotanteEntity, Long> {
    Optional<AdotanteEntity> findById(Long id);

    AdotanteEntity findByNome(String nome);
    //AdotanteEntity findBy(AdotanteEntity adotante);
}
