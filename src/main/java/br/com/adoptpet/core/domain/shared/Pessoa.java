package br.com.adoptpet.core.domain.shared;

import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;

public class Pessoa {
    protected Long id;
    public String nome;
    public String telefone;
    public String email;
    public Endereco endereco;
    public TipoPessoa tipoPessoa;

    public Pessoa(Long id, String nome, String telefone, String email, Endereco endereco, TipoPessoa tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa() { }

    public Pessoa(String nome) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
