package br.com.adoptpet.config.endereco;

import br.com.adoptpet.core.usecase.endereco.impl.BuscarEnderecoUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BuscarEnderecoConfig {
    @Bean
    public BuscarEnderecoUseCaseImpl buscarEnderecoUseCase(BuscarEnderecoImpl buscarEndereco){
       return new BuscarEnderecoUseCaseImpl(buscarEndereco);
    }
}
