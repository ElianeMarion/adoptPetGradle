package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRegistro;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.BuscarPetPorRegistroUseCase;

public class BuscarPetPorRegistroUseCaseImpl implements BuscarPetPorRegistroUseCase {

    private final BuscarPetPorRegistro buscarPetPorRegistro;

    public BuscarPetPorRegistroUseCaseImpl(BuscarPetPorRegistro buscarPetPorRegistro) {
        this.buscarPetPorRegistro = buscarPetPorRegistro;
    }

    @Override
    public Pet findByRegistro(String registro) throws Exception {
        return buscarPetPorRegistro.findByRegistro(registro);
    }
}
