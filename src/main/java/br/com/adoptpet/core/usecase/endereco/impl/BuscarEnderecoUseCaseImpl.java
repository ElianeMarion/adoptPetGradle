package br.com.adoptpet.core.usecase.endereco.impl;

import br.com.adoptpet.core.dataprovider.endereco.BuscarEndereco;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.BuscarEnderecoUseCase;

public class BuscarEnderecoUseCaseImpl implements BuscarEnderecoUseCase {

    private final BuscarEndereco buscarEndereco;

    public BuscarEnderecoUseCaseImpl(BuscarEndereco buscarEndereco) {
        this.buscarEndereco = buscarEndereco;
    }

    @Override
    public Endereco findByCep(String cep) {
        return buscarEndereco.findByCep(cep);
    }
}
