package br.com.adoptpet.config.pessoa;

import br.com.adoptpet.core.usecase.pessoa.impl.BuscarPessoaUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarPessoaImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarPessoaConfig {

    @Bean
    public BuscarPessoaUseCaseImpl buscarPessoaUseCase(
            BuscarPessoaImpl buscarPessoa
    ){
        return new BuscarPessoaUseCaseImpl(buscarPessoa);
    }
}
