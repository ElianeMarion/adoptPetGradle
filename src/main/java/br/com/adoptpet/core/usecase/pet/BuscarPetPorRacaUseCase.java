package br.com.adoptpet.core.usecase.pet;

import br.com.adoptpet.core.domain.pet.Pet;

import java.util.List;

public interface BuscarPetPorRacaUseCase {
    List<Pet> findByRaca(String raca) throws Exception;
}
