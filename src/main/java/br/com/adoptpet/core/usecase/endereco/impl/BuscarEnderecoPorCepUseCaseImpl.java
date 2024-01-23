package br.com.adoptpet.core.usecase.endereco.impl;

import br.com.adoptpet.core.dataprovider.endereco.BuscarEnderecoPorCep;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.BuscarEnderecoPorCepUseCase;

public class BuscarEnderecoPorCepUseCaseImpl implements BuscarEnderecoPorCepUseCase {

    private final BuscarEnderecoPorCep buscarEnderecoPorCep;

    public BuscarEnderecoPorCepUseCaseImpl(BuscarEnderecoPorCep buscarEnderecoPorCep) {
        this.buscarEnderecoPorCep = buscarEnderecoPorCep;
    }

    @Override
    public Endereco findByCep(String cep) throws Exception {

        return buscarEnderecoPorCep.findByCep(cep);
    }
}
