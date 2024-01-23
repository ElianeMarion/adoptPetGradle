package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.dataprovider.pet.BuscarPet;
import br.com.adoptpet.core.usecase.pet.impl.BuscarPetUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarPetConfig {
    @Bean
    public BuscarPetUseCaseImpl buscarPetUseCase(
            BuscarPet buscarPet
    ){
        return new BuscarPetUseCaseImpl(buscarPet);
    }
}
