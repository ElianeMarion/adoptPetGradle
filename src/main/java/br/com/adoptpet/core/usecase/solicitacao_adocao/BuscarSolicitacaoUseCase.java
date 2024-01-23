package br.com.adoptpet.core.usecase.solicitacao_adocao;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

import java.time.LocalDate;
import java.util.List;

public interface BuscarSolicitacaoUseCase {
    Solicitacao findByNumeroSolicitacao(Long numero);
    Solicitacao findBySolicitante(Pessoa solicitante);
    List<Solicitacao> findByDataSolicitacao(LocalDate dataSolicitacao);
    List<Solicitacao> findByStatusSolicitacao(StatusSolicitacaoEnum status);
    List<Solicitacao> findByFuncionario(Pessoa funcionario);
    List<Solicitacao> findAll();
}
