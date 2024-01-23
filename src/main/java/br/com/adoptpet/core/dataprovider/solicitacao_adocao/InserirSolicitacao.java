package br.com.adoptpet.core.dataprovider.solicitacao_adocao;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

public interface InserirSolicitacao {
    Solicitacao insert(Solicitacao solicitacao);
}
