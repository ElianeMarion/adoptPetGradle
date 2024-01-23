package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.BuscarFuncionarioUseCase;

public class BuscarFuncionarioUseCaseImpl implements BuscarFuncionarioUseCase {

    private final BuscarFuncionario buscarFuncionario;

    public BuscarFuncionarioUseCaseImpl(BuscarFuncionario buscarFuncionario) {
        this.buscarFuncionario = buscarFuncionario;
    }

    @Override
    public Funcionario findByCpf(String cpf) throws Exception {
        return buscarFuncionario.findByCpf(cpf);
    }
}
