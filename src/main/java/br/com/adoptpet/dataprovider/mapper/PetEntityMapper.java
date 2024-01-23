package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.dataprovider.entities.pet.PetEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetEntityMapper {

    Pet toPet(PetEntity petEntity);

    PetEntity toPetEntity(Pet pet);

    List<Pet> toListPet(List<PetEntity> listaPets);

    List<PetEntity> toListPetEntity(List<Pet> listaPets);

}
