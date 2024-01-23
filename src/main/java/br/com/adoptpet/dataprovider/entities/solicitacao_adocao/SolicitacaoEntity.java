package br.com.adoptpet.dataprovider.entities.solicitacao_adocao;

import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import br.com.adoptpet.dataprovider.entities.pet.PetEntity;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name="solicitacao")
public class SolicitacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroSolicitacao;

    @OneToOne
    private PetEntity pet;
    @OneToOne
    private PessoaEntity solicitante;
    @OneToOne
    private PessoaEntity funcionario;
    private LocalDate dataSolicitacao = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private StatusSolicitacaoEnum statusSolicitacao = StatusSolicitacaoEnum.EM_ANALISE;

    public SolicitacaoEntity(){}

    public SolicitacaoEntity(Long numeroSolicitacao, PetEntity pet, AdotanteEntity solicitante, PessoaEntity funcionario, LocalDate dataSolicitacao, StatusSolicitacaoEnum statusSolicitacao) {
        this.numeroSolicitacao = numeroSolicitacao;
        this.pet = pet;
        this.solicitante = solicitante;
        this.funcionario = funcionario;
        this.dataSolicitacao = dataSolicitacao;
        this.statusSolicitacao = statusSolicitacao;
    }
}
