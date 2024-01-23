package br.com.adoptpet.config.solicitacao_adocao;

import br.com.adoptpet.core.dataprovider.pessoa.BuscarPessoa;
import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.InserirSolicitacaoUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioImpl;
import br.com.adoptpet.dataprovider.BuscarPetPorRegistroImpl;
import br.com.adoptpet.dataprovider.InserirSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirSolicitacaoConfig {
    @Bean
    public InserirSolicitacaoUseCaseImpl inserirSolicitacaoUseCase(
            InserirSolicitacaoImpl inserirSolicitacao,
            BuscarPetPorRegistroImpl buscarPet,
            BuscarFuncionarioImpl buscarFuncionario,
            BuscarPessoa buscarPessoa
    ){
        return new InserirSolicitacaoUseCaseImpl(inserirSolicitacao, buscarPet, buscarFuncionario, buscarPessoa);
    }
}
