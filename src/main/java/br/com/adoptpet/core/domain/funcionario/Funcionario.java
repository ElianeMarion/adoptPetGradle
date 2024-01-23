package br.com.adoptpet.core.domain.funcionario;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.enums.TipoPessoa;

public class Funcionario extends Pessoa {

    private String cpf;

    public Funcionario(Long id, String nome, String telefone, String email, Endereco endereco, TipoPessoa tipoPessoa, String cpf) {
        super(id, nome, telefone, email, endereco, tipoPessoa);
        this.cpf = cpf;
    }

    public Funcionario() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
