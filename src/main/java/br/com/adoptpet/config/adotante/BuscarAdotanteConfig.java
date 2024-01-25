package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotanteUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarAdotanteImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarAdotanteConfig {

    @Bean
    public BuscarAdotanteUseCaseImpl buscarAdotanteUseCase(BuscarAdotanteImpl buscarAdotante){
        return new BuscarAdotanteUseCaseImpl(buscarAdotante);
    }
}
