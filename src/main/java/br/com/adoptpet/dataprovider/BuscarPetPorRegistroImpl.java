package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRegistro;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.dataprovider.mapper.PetEntityMapper;
import br.com.adoptpet.dataprovider.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarPetPorRegistroImpl implements BuscarPetPorRegistro {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetEntityMapper mapper;

    @Override
    public Pet findByRegistro(String registro) {
        return mapper.toPet(petRepository.findByRegistro(registro));
    }
}
