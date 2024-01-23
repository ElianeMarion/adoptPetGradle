package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRegistro;
import br.com.adoptpet.core.usecase.pet.impl.BuscarPetPorRegistroUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarPetPorRegistroConfig {
    @Bean
    public BuscarPetPorRegistroUseCaseImpl buscarPetPorRegistroPetUseCase(
            BuscarPetPorRegistro buscarPetPorRegistro
    ){
        return new BuscarPetPorRegistroUseCaseImpl(buscarPetPorRegistro);
    }
}
