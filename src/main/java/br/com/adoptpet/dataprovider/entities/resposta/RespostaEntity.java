package br.com.adoptpet.dataprovider.entities.resposta;

import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.entities.solicitacao_adocao.SolicitacaoEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name="resposta")
public class RespostaEntity {
    @Id
    private Long numeroResposta;
    @OneToOne
    private SolicitacaoEntity solicitacao;
    @Enumerated(EnumType.STRING)
    private StatusSolicitacaoEnum resposta = StatusSolicitacaoEnum.EM_ANALISE;
    private LocalDate dataResposta = LocalDate.now();
    private String observacao;

    public RespostaEntity(Long numeroResposta, SolicitacaoEntity solicitacao, StatusSolicitacaoEnum resposta, LocalDate dataResposta, String observacao) {
        this.numeroResposta = numeroResposta;
        this.solicitacao = solicitacao;
        this.resposta = resposta;
        this.dataResposta = dataResposta;
        this.observacao = observacao;
    }

    public RespostaEntity(){}
}
