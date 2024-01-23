package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.dataprovider.ong.InserirOng;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.InserirOngUseCase;

public class InserirOngUseCaseImpl implements InserirOngUseCase {

    private final InserirEndereco inserirEndereco;

    private final InserirOng inserirOng;

    public InserirOngUseCaseImpl(InserirEndereco inserirEndereco, InserirOng inserirOng) {
        this.inserirEndereco = inserirEndereco;
        this.inserirOng = inserirOng;
    }

    @Override
    public Ong insert(Ong ong) throws Exception {
        var endereco = ong.getEndereco();
        endereco = inserirEndereco.insert(endereco);
        ong.setEndereco(endereco);
        return inserirOng.insert(ong);
    }
}
