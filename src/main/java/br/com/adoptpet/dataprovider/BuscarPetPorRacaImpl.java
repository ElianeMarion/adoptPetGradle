package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRaca;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.dataprovider.mapper.PetEntityMapper;
import br.com.adoptpet.dataprovider.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BuscarPetPorRacaImpl implements BuscarPetPorRaca {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetEntityMapper mapper;

    @Override
    public List<Pet> findByRaca(String raca) {
        return mapper.toListPet(petRepository.findByRaca(raca));
    }
}
