package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;


import br.com.adoptpet.core.dataprovider.solicitacao_adocao.InserirSolicitacao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.InserirSolicitacaoUseCase;

public class InserirSolicitacaoUseCaseImpl implements InserirSolicitacaoUseCase {
    private final InserirSolicitacao inserirSolicitacao;

    public InserirSolicitacaoUseCaseImpl(InserirSolicitacao inserirSolicitacao) {
        this.inserirSolicitacao = inserirSolicitacao;
    }

    @Override
    public Solicitacao insert(Solicitacao solicitacao) {


        return inserirSolicitacao.insert(solicitacao);
    }
}

