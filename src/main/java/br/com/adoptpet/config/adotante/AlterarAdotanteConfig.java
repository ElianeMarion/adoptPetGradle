package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.dataprovider.endereco.BuscarEnderecoPorCep;
import br.com.adoptpet.core.usecase.adotante.impl.AlterarAdotanteUseCaseImpl;
import br.com.adoptpet.dataprovider.AltararAdotanteImpl;
import br.com.adoptpet.dataprovider.BuscarAdotantePorNomeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarAdotanteConfig {
    @Bean
    public AlterarAdotanteUseCaseImpl alterarAdotanteUseCase(
            AltararAdotanteImpl alterarAdotante,
            BuscarAdotantePorNomeImpl buscarAdotante,
            BuscarEnderecoPorCep buscarEndereco){
        return new AlterarAdotanteUseCaseImpl(alterarAdotante,buscarAdotante, buscarEndereco);
    }
}
