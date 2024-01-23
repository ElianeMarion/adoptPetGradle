package br.com.adoptpet.core.domain.adotante;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;
public class Adotante extends Pessoa {
    private String genero;
    private int idade;

    public Adotante(Long id, String nome, String telefone, String email,
                    Endereco endereco, TipoPessoa tipoPessoa, String genero, int idade ) {
        super(id, nome, telefone, email, endereco, tipoPessoa);
        this.genero = genero;
        this.idade = idade;
    }

    public Adotante() {
        super();

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.FISICA;
    }
}
/*
* create table familia(
id serial primary key,
nomeResponsavel varchar(50),
cpf varchar(11),
telefone varchar(13),
email varchar(40),
endereco bigint references endereco(id)
);
* */
