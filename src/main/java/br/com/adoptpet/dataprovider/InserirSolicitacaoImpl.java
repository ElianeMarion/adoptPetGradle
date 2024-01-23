package br.com.adoptpet.dataprovider;


import br.com.adoptpet.core.dataprovider.solicitacao_adocao.InserirSolicitacao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.mapper.SolicitacaoEntityMapper;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirSolicitacaoImpl implements InserirSolicitacao {
    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    @Autowired
    private SolicitacaoEntityMapper mapper;

    @Override
    public Solicitacao insert(Solicitacao solicitacao) {
        var solicitacaoInserida = solicitacaoRepository.save(mapper.toSolicitacaoEntity(solicitacao));
        return mapper.toSolicitacao(solicitacaoInserida);
    }
}
