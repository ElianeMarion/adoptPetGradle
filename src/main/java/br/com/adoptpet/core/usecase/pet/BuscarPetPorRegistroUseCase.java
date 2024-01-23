package br.com.adoptpet.core.usecase.pet;

import br.com.adoptpet.core.domain.pet.Pet;

public interface BuscarPetPorRegistroUseCase {
    Pet findByRegistro(String registro) throws Exception;
}
