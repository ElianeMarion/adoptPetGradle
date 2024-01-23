package br.com.adoptpet.core.dataprovider.pet;

import br.com.adoptpet.core.domain.pet.Pet;

public interface BuscarPetPorRegistro {
    Pet findByRegistro(final String registro);
}
