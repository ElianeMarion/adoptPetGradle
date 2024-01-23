package br.com.adoptpet.dataprovider.entities.shared;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
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

@Getter
@Setter
@Entity
@Table(name = "endereco")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String bairro;
    private String numero;

    public EnderecoEntity(Long id, String endereco, String cep, String cidade, String estado, String bairro, String numero) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.numero = numero;
    }
    public EnderecoEntity(){}
}
