package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRaca;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.BuscarPetPorRacaUseCase;

import java.util.List;

public class BuscarPetPorRacaUseCaseImpl implements BuscarPetPorRacaUseCase {

    private final BuscarPetPorRaca buscarPetPorRaca;

    public BuscarPetPorRacaUseCaseImpl(BuscarPetPorRaca buscarPetPorRaca) {
        this.buscarPetPorRaca = buscarPetPorRaca;
    }

    @Override
    public List<Pet> findByRaca(String raca) throws Exception {
        return buscarPetPorRaca.findByRaca(raca);
    }
}
