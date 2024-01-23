package br.com.adoptpet.core.domain.pet;

import br.com.adoptpet.core.domain.shared.enums.SexoPetEnum;
import br.com.adoptpet.core.domain.shared.enums.StatusPetEnum;

public class Pet {

    private String nome;
    private String raca;
    private int idade;
    private int expectativaDeVida;
    private double peso;
    private double altura;
    private String registro;
    private String corDoPelo = "Não informado";
    private String corDosOlhos = "Não informado";
    private String porte;
    private SexoPetEnum sexo;
    private StatusPetEnum status;

    public Pet(String nome, String raca, int idade, int expectativaDeVida, double peso, double altura, String registro, String corDoPelo, String corDosOlhos, String porte, SexoPetEnum sexo, StatusPetEnum status) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.expectativaDeVida = expectativaDeVida;
        this.peso = peso;
        this.altura = altura;
        this.registro = registro;
        this.corDoPelo = corDoPelo;
        this.corDosOlhos = corDosOlhos;
        this.porte = porte;
        this.sexo = sexo;
        this.status = status;
    }

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public Pet(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExpectativaDeVida() {
        return expectativaDeVida;
    }

    public void setExpectativaDeVida(int expectativaDeVida) {
        this.expectativaDeVida = expectativaDeVida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public SexoPetEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoPetEnum sexo) {
        this.sexo = sexo;
    }

    public StatusPetEnum getStatus() {
        return status;
    }

    public void setStatus(StatusPetEnum status) {
        this.status = status;
    }
}
