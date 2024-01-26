package br.com.adoptpet.dataprovider.entities.shared;


import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PessoaEntity {
    @Id
    @TableGenerator(name = "pessoaPK", table = "id_pessoa", pkColumnName = "entidade", valueColumnName = "prox_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "pessoaPK")
    protected Long id;
    public String nome;
    public String telefone;
    public String email;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn
    public EnderecoEntity endereco;
    @Enumerated(EnumType.STRING)
    public TipoPessoa tipoPessoa;

    public PessoaEntity(Long id, String nome, String telefone, String email, EnderecoEntity endereco, TipoPessoa tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;
    }

    public PessoaEntity() {
    }
}
