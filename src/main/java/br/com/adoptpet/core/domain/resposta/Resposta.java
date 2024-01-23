package br.com.adoptpet.core.domain.resposta;

import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

import java.time.LocalDate;

public class Resposta {
    private Long numeroResposta;
    private Solicitacao solicitacao;
    private StatusSolicitacaoEnum resposta = StatusSolicitacaoEnum.EM_ANALISE;
    private LocalDate dataResposta = LocalDate.now();
    private String observacao;

    public Resposta(Long numeroResposta, Solicitacao solicitacao, StatusSolicitacaoEnum resposta, LocalDate dataResposta, String observacao) {
        this.numeroResposta = numeroResposta;
        this.solicitacao = solicitacao;
        this.resposta = resposta;
        this.dataResposta = dataResposta;
        this.observacao = observacao;
    }

    public Resposta(){}

    public Long getNumeroResposta() {
        return numeroResposta;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public StatusSolicitacaoEnum getResposta() {
        return resposta;
    }

    public LocalDate getDataResposta() {
        return dataResposta;
    }

    public String getObservacao() {
        return observacao;
    }
}
