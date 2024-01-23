package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.entities.ong.OngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface OngRepository extends JpaRepository<OngEntity, Long> {

    OngEntity findByCnpj(String cnpj);
}
