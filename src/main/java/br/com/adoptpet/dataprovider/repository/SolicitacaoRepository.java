package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import br.com.adoptpet.dataprovider.entities.solicitacao_adocao.SolicitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {

    SolicitacaoEntity findByNumeroSolicitacao(Long numero);
    SolicitacaoEntity findBySolicitante(PessoaEntity solicitante);
    List<SolicitacaoEntity> findByDataSolicitacao(LocalDate dataSolicitacao);
    List<SolicitacaoEntity> findByStatusSolicitacao(StatusSolicitacaoEnum status);
    List<SolicitacaoEntity> findByFuncionario(PessoaEntity funcionario);
}
