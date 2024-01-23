package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.usecase.endereco.impl.InserirEnderecoUseCaseImpl;
import br.com.adoptpet.core.usecase.pet.impl.InserirPetUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirEnderecoImpl;
import br.com.adoptpet.dataprovider.InserirPetImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirPetConfig {

    @Bean
    public InserirPetUseCaseImpl inserirPetUseCase(
            InserirPetImpl inserirPet
    ) {
        return new InserirPetUseCaseImpl(inserirPet);
    }
}
