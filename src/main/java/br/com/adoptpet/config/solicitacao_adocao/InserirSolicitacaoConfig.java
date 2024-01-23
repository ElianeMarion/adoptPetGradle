package br.com.adoptpet.config.solicitacao_adocao;

import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.InserirSolicitacaoUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirSolicitacaoConfig {
    @Bean
    public InserirSolicitacaoUseCaseImpl inserirSolicitacaoUseCase(
            InserirSolicitacaoImpl inserirSolicitacao
    ){
        return new InserirSolicitacaoUseCaseImpl(inserirSolicitacao);
    }
}
