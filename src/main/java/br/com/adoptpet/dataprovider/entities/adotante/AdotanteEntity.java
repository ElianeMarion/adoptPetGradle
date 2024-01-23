package br.com.adoptpet.dataprovider.entities.adotante;

import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AdotanteEntity extends PessoaEntity {
    private String genero;
    private int idade;

    public AdotanteEntity(Long id, String nome, String telefone, String email,
                          EnderecoEntity endereco, TipoPessoa tipoPessoa, String genero, int idade ) {
        super(id, nome, telefone, email, endereco, tipoPessoa);
        this.genero = genero;
        this.idade = idade;
    }

    public AdotanteEntity() {
        super();

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
