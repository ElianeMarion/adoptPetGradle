package br.com.adoptpet.config.ong;

import br.com.adoptpet.core.usecase.ong.impl.BuscarOngPorCnpjUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarOngPorCnpjImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarOngPorCpfConfig {
    @Bean
    public BuscarOngPorCnpjUseCaseImpl buscarOngPorCnpjUseCase(
            BuscarOngPorCnpjImpl buscarOngPorCnpj
    ){
        return new BuscarOngPorCnpjUseCaseImpl(buscarOngPorCnpj);
    }
}
