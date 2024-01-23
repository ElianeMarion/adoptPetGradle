package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.pet.InserirPet;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.dataprovider.mapper.PetEntityMapper;
import br.com.adoptpet.dataprovider.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class InserirPetImpl implements InserirPet {
    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetEntityMapper mapper;

    @Override
    public Pet insert(Pet pet) {
        var petEntity = petRepository.save(mapper.toPetEntity(pet));
        return mapper.toPet(petEntity);
    }

}
