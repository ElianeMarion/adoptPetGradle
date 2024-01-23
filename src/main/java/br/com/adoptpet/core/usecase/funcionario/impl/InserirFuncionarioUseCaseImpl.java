package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.dataprovider.funcionario.InserirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.InserirFuncionarioUseCase;

public class InserirFuncionarioUseCaseImpl implements InserirFuncionarioUseCase {
    private final InserirFuncionario inserirFuncionario;

    private final InserirEndereco inserirEndereco;

    public InserirFuncionarioUseCaseImpl(InserirFuncionario inserirFuncionario, InserirEndereco inserirEndereco) {
        this.inserirFuncionario = inserirFuncionario;
        this.inserirEndereco = inserirEndereco;
    }

    @Override
    public Funcionario insert(Funcionario funcionario) throws Exception {
        var endereco = funcionario.getEndereco();
        endereco = inserirEndereco.insert(endereco);
        funcionario.setEndereco(endereco);
        return inserirFuncionario.insert(funcionario);
    }
}
