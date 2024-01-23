package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.AlterarPet;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.AlterarPetUseCase;

public class AlterarPetUseCaseImpl implements AlterarPetUseCase {

    private final AlterarPet alterarPet;

    public AlterarPetUseCaseImpl(AlterarPet alterarPet) {
        this.alterarPet = alterarPet;
    }

    @Override
    public void update(Pet pet) throws Exception {
        alterarPet.update(pet);
    }
}
