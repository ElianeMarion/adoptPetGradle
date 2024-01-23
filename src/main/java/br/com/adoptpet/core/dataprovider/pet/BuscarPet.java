package br.com.adoptpet.core.dataprovider.pet;

import br.com.adoptpet.core.domain.pet.Pet;

import java.util.List;

public interface BuscarPet {
    List<Pet> listAll();

//    Pet findBy(final Pet pet);
}
