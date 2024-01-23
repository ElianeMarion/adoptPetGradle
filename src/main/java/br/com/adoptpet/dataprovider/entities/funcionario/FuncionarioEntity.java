package br.com.adoptpet.dataprovider.entities.funcionario;

import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FuncionarioEntity extends PessoaEntity {

    private String cpf;

    public FuncionarioEntity(Long id, String nome, String telefone, String email, EnderecoEntity endereco, TipoPessoa tipoPessoa, String cpf) {
        super(id, nome, telefone, email, endereco, tipoPessoa);
        this.cpf = cpf;
    }


    public FuncionarioEntity() {

    }
}
