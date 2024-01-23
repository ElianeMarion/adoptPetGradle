package br.com.adoptpet.core.usecase.endereco.impl;

import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.InserirEnderecoUseCase;

public class InserirEnderecoUseCaseImpl implements InserirEnderecoUseCase {

    private final InserirEndereco inserirEndereco;

    public InserirEnderecoUseCaseImpl(InserirEndereco inserirEndereco) {
        this.inserirEndereco = inserirEndereco;
    }

    @Override
    public Endereco insert(Endereco endereco) throws Exception {
        endereco = inserirEndereco.insert(endereco);
        return endereco;
    }
}
