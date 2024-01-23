package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.InserirPet;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.InserirPetUseCase;

public class InserirPetUseCaseImpl implements InserirPetUseCase {

    private final InserirPet inserirPet;

    public InserirPetUseCaseImpl(InserirPet inserirPet) {
        this.inserirPet = inserirPet;
    }

    @Override
    public Pet insert(Pet pet) throws Exception {
        return inserirPet.insert(pet);
    }
}
