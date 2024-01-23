package br.com.adoptpet.core.domain.solicitacao_adocao;

import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;

import java.time.LocalDate;

public class Solicitacao {
    private Long numeroSolicitacao;
    private Pet pet;
    private Pessoa solicitante;
    private Funcionario funcionario;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public StatusSolicitacaoEnum getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setNumeroSolicitacao(Long numeroSolicitacao) {
        this.numeroSolicitacao = numeroSolicitacao;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSolicitante(Pessoa solicitante) {
        this.solicitante = solicitante;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacaoEnum statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }
}
