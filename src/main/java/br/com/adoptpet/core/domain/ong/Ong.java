package br.com.adoptpet.core.domain.ong;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;

public class Ong extends Pessoa {
    private final String cnpj;


    public Ong(Long id, String nome, String telefone, String email, Endereco endereco, TipoPessoa tipoPessoa, String cnpj) {
        super(id, nome, telefone, email, endereco, tipoPessoa);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.JURIDICA;
    }
}
