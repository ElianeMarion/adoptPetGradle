package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.BuscarSolicitacao;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.BuscarSolicitacaoUseCase;

import java.time.LocalDate;
import java.util.List;

public class BuscarSolicitacaoUseCaseImpl implements BuscarSolicitacaoUseCase {

    private final BuscarSolicitacao buscarSolicitacao;

    public BuscarSolicitacaoUseCaseImpl(BuscarSolicitacao buscarSolicitacao) {
        this.buscarSolicitacao = buscarSolicitacao;
    }

    @Override
    public Solicitacao findByNumeroSolicitacao(Long numero) {
        return buscarSolicitacao.findByNumeroSolicitacao(numero);
    }

    @Override
    public Solicitacao findBySolicitante(Pessoa solicitante) {
        return buscarSolicitacao.findBySolicitante(solicitante);
    }

    @Override
    public List<Solicitacao> findByDataSolicitacao(LocalDate dataSolicitacao) {
        return buscarSolicitacao.findByDataSolicitacao(dataSolicitacao);
    }

    @Override
    public List<Solicitacao> findByStatusSolicitacao(StatusSolicitacaoEnum status) {
        return buscarSolicitacao.findByStatusSolicitacao(status);
    }

    @Override
    public List<Solicitacao> findByFuncionario(Pessoa funcionario) {
        return buscarSolicitacao.findByFuncionario(funcionario);
    }

    @Override
    public List<Solicitacao> findAll() {
        return buscarSolicitacao.findAll();
    }
}
