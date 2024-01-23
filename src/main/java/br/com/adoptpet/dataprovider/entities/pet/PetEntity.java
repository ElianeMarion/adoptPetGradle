package br.com.adoptpet.dataprovider.entities.pet;

import br.com.adoptpet.core.domain.shared.enums.SexoPetEnum;
import br.com.adoptpet.core.domain.shared.enums.StatusPetEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pet")
public class PetEntity {
    @Id
    private String registro;
    private String nome;
    private String raca;
    private int idade;
    private int expectativaDeVida;
    private double peso;
    private double altura;
    private String corDoPelo = "Não informado";
    private String corDosOlhos = "Não informado";
    private String porte;
    private SexoPetEnum sexo;
    private StatusPetEnum status;

    public PetEntity(String registro, String nome, String raca, int idade, int expectativaDeVida, double peso, double altura, String corDoPelo, String corDosOlhos, String porte, SexoPetEnum sexo, StatusPetEnum status) {
        this.registro = registro;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.expectativaDeVida = expectativaDeVida;
        this.peso = peso;
        this.altura = altura;
        this.corDoPelo = corDoPelo;
        this.corDosOlhos = corDosOlhos;
        this.porte = porte;
        this.sexo = sexo;
        this.status = status;
    }

    public PetEntity(){};
}
