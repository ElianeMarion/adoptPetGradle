package br.com.adoptpet.config.endereco;

import br.com.adoptpet.core.usecase.endereco.impl.InserirEnderecoUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirEnderecoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirEnderecoConfig {
    @Bean
    public InserirEnderecoUseCaseImpl inserirEnderecoUseCase(
            InserirEnderecoImpl inserirEndereco
    ){
        return new InserirEnderecoUseCaseImpl(inserirEndereco);
    }
}
