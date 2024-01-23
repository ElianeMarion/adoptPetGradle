package br.com.adoptpet.config.ong;

import br.com.adoptpet.core.usecase.ong.impl.InserirOngUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirEnderecoImpl;
import br.com.adoptpet.dataprovider.InserirOngImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InseriOngConfig {
    @Bean
    public InserirOngUseCaseImpl inserirOngUseCase(
            InserirEnderecoImpl inserirEndereco,
            InserirOngImpl inserirOng
    ){
        return new InserirOngUseCaseImpl(inserirEndereco,inserirOng);
    }
}
