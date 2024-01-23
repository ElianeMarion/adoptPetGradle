package br.com.adoptpet.core.domain.solicitacao_adocao;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;

import java.time.LocalDate;

public class Solicitacao {
    private Long numeroSolicitacao;
    private Pet pet;
    private Pessoa solicitante;
    private Pessoa funcionario;
    private LocalDate dataSolicitacao = LocalDate.now();
    private StatusSolicitacaoEnum statusSolicitacao = StatusSolicitacaoEnum.EM_ANALISE;


    public Long getNumeroSolicitacao() {
        return numeroSolicitacao;
    }

    public Pet getPet() {
        return pet;
    }

    public Pessoa getSolicitante() {
        return solicitante;
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public StatusSolicitacaoEnum getStatusSolicitacao() {
        return statusSolicitacao;
    }
}
