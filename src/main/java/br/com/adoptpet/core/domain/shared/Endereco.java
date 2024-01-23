package br.com.adoptpet.core.domain.shared;

/*
* create table endereco(
id serial primary key,
endereco varchar(100),
cep varchar(8),
cidade varchar(50),
estado varchar(2),
bairro varchar(30),
numero varchar(10)
);
* */


public class Endereco {
    private Long id;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String bairro;
    private String numero;

    public Endereco(Long id, String endereco, String cep, String cidade, String estado, String bairro, String numero) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.numero = numero;
    }
    public Endereco(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
