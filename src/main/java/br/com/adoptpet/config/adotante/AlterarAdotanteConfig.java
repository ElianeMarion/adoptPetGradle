package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.AlterarAdotanteUseCaseImpl;
import br.com.adoptpet.dataprovider.AltararAdotanteImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarAdotanteConfig {
    @Bean
    public AlterarAdotanteUseCaseImpl alterarAdotanteUseCase(AltararAdotanteImpl adotante) {
        return new AlterarAdotanteUseCaseImpl(adotante);
    }
}
