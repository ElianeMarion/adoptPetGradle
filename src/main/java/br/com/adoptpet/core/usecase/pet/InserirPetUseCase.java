package br.com.adoptpet.core.usecase.pet;

import br.com.adoptpet.core.domain.pet.Pet;

public interface InserirPetUseCase {
    Pet insert(Pet pet) throws Exception;
}
