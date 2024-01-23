package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotantePorNomeUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarAdotantePorNomeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarAdotantePorNomeConfig {

    @Bean
    public BuscarAdotantePorNomeUseCaseImpl buscarAdotantePorCpfUseCase(
            BuscarAdotantePorNomeImpl buscarAdotantePorNome){
        return new BuscarAdotantePorNomeUseCaseImpl(buscarAdotantePorNome);
    }
}
