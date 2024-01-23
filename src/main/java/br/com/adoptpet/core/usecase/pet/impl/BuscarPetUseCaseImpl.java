package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.BuscarPet;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.BuscarPetUseCase;

import java.util.List;

public class BuscarPetUseCaseImpl implements BuscarPetUseCase {

    private final BuscarPet buscarPet;

    public BuscarPetUseCaseImpl(BuscarPet buscarPet) {
        this.buscarPet = buscarPet;
    }

    @Override
    public List<Pet> listAll() throws Exception {
        return buscarPet.listAll();
    }

}
