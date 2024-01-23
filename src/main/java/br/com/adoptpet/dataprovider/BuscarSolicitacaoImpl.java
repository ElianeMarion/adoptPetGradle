package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.BuscarSolicitacao;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.mapper.PessoaEntityMapper;
import br.com.adoptpet.dataprovider.mapper.SolicitacaoEntityMapper;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
@Component
public class BuscarSolicitacaoImpl implements BuscarSolicitacao {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    @Autowired
    private SolicitacaoEntityMapper mapper;

    @Autowired
    private PessoaEntityMapper solicitanteMapper;
    @Override
    public Solicitacao findByNumeroSolicitacao(Long numero) {
        var solicitacao = solicitacaoRepository.findByNumeroSolicitacao(numero);
        return mapper.toSolicitacao(solicitacao);
    }

    @Override
    public Solicitacao findBySolicitante(Pessoa solicitante) {

        var solicitacao = solicitacaoRepository.findBySolicitante(solicitanteMapper.toPessoaEntity(solicitante));
        return mapper.toSolicitacao(solicitacao);
    }
    @Override
    public List<Solicitacao> findByDataSolicitacao(LocalDate dataSolicitacao) {
        var solicitacao = solicitacaoRepository.findByDataSolicitacao(dataSolicitacao);
        return mapper.toListSolicitacao(solicitacao);
    }

    @Override
    public List<Solicitacao> findAll() {
        var solicitacao = solicitacaoRepository.findAll();
        return mapper.toListSolicitacao(solicitacao);
    }
    @Override
    public List<Solicitacao> findByStatusSolicitacao(StatusSolicitacaoEnum status) {
        var solicitacao = solicitacaoRepository.findByStatusSolicitacao(status);
        return mapper.toListSolicitacao(solicitacao);
    }

    @Override
    public List<Solicitacao> findByFuncionario(Pessoa funcionario) {
        var solicitacao = solicitacaoRepository.findByFuncionario(solicitanteMapper.toPessoaEntity(funcionario));
        return mapper.toListSolicitacao(solicitacao);
    }

}
