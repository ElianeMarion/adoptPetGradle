package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.dataprovider.entities.ong.OngEntity;
import br.com.adoptpet.dataprovider.entities.pet.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, String > {

    PetEntity findByRegistro(String registro);

    List<PetEntity> findByRaca(String raca);

    //PetEntity findBy(Pet pet);
}
