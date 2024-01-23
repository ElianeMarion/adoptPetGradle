package br.com.adoptpet.core.usecase.pet;

import br.com.adoptpet.core.domain.pet.Pet;

public interface AlterarPetUseCase {
    void update( Pet pet) throws Exception;
}
