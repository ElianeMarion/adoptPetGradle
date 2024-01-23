package br.com.adoptpet.dataprovider.entities.ong;

import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OngEntity extends PessoaEntity {

    private String cnpj;

    public OngEntity(){}

    public OngEntity(Long id, String nome, String telefone, String email, EnderecoEntity endereco, TipoPessoa tipoPessoa, String cnpj) {
        super(id, nome, telefone, email, endereco, TipoPessoa.JURIDICA);
        this.cnpj = cnpj;
    }

}
