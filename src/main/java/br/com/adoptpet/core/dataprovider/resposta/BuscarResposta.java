package br.com.adoptpet.core.dataprovider.resposta;

import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;

import java.time.LocalDate;
import java.util.List;

public interface BuscarResposta {
    Resposta findByNumeroResposta(Long numero);
    Resposta findBySolicitacao(Long numeroSolicitacao);
    List<Resposta> findByDataResposta(LocalDate dataResposta);
    List<Resposta> findByResposta(StatusSolicitacaoEnum status);


}
