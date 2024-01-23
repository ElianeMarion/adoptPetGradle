package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorCnpj;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.BuscarOngPorCnpjUseCase;

public class BuscarOngPorCnpjUseCaseImpl implements BuscarOngPorCnpjUseCase {

    private final BuscarOngPorCnpj buscarOngPorCnpj;

    public BuscarOngPorCnpjUseCaseImpl(BuscarOngPorCnpj buscarOngPorCnpj) {
        this.buscarOngPorCnpj = buscarOngPorCnpj;
    }

    @Override
    public Ong findByCnpj(String cnpj) throws Exception {
        return buscarOngPorCnpj.findByCnpj(cnpj);
    }
}
