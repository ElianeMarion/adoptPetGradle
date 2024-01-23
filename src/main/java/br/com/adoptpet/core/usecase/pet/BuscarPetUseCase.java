package br.com.adoptpet.core.usecase.pet;

import br.com.adoptpet.core.domain.pet.Pet;

import java.util.List;

public interface BuscarPetUseCase {
    List<Pet> listAll() throws Exception;

    //Pet findBy(Pet pet) throws Exception;
}

