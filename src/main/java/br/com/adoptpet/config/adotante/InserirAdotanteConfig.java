package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.InserirAdotanteUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirAdotanteImpl;
import br.com.adoptpet.dataprovider.InserirEnderecoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirAdotanteConfig {
    @Bean
    public InserirAdotanteUseCaseImpl inserirAdotanteUseCase(
            InserirEnderecoImpl inserirEndereco,
            InserirAdotanteImpl inserirAdotante){
        return new InserirAdotanteUseCaseImpl(inserirEndereco, inserirAdotante);
    }
}
