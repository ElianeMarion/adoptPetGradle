package br.com.adoptpet.config.funcionario;

import br.com.adoptpet.core.usecase.funcionario.impl.BuscarFuncionarioUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarFuncionarioConfig {
    @Bean
    public BuscarFuncionarioUseCaseImpl buscarFuncionarioUseCase(
            BuscarFuncionarioImpl buscarFuncionario
    ){
        return new BuscarFuncionarioUseCaseImpl(buscarFuncionario);
    }
}
