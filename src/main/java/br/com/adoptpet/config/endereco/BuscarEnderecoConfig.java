package br.com.adoptpet.config.endereco;

import br.com.adoptpet.core.usecase.endereco.impl.BuscarEnderecoPorCepUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BuscarEnderecoConfig {
    @Bean
    public BuscarEnderecoPorCepUseCaseImpl buscarEnderecoPorCepUseCase(
            BuscarEnderecoPorCepImpl buscarEnderecoPorCep){
       return new BuscarEnderecoPorCepUseCaseImpl(buscarEnderecoPorCep);
    }
}
