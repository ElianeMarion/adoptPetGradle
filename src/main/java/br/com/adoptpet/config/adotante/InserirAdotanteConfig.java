package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.InserirAdotanteUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirAdotanteImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirAdotanteConfig {
    @Bean
    public InserirAdotanteUseCaseImpl inserirAdotanteUseCase(InserirAdotanteImpl inserirAdotante){
        return new InserirAdotanteUseCaseImpl(inserirAdotante);
    }
}
