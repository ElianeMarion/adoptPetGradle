package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRaca;
import br.com.adoptpet.core.usecase.pet.impl.BuscarPetPorRacaUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarPetPorRacaConfig {
    @Bean
    public BuscarPetPorRacaUseCaseImpl buscarPetPorRacaUseCase(
            BuscarPetPorRaca buscarPetPorRaca
    ){
        return new BuscarPetPorRacaUseCaseImpl(buscarPetPorRaca);
    }
}
