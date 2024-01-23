package br.com.adoptpet.config.solicitacao_adocao;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.BuscarSolicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.BuscarSolicitacaoUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarSolicitacaoConfig {
    @Bean
    public BuscarSolicitacaoUseCaseImpl buscarSolicitacaoUseCase(
            BuscarSolicitacaoImpl buscarSolicitacao
    ){
        return new BuscarSolicitacaoUseCaseImpl(buscarSolicitacao);
    }
}
