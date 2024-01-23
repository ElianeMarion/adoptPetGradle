package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;

public class InserirAdotanteUseCaseImpl implements InserirAdotanteUseCase {

    private final InserirEndereco inserirEndereco;
    private final InserirAdotante inserirAdotante;

    public InserirAdotanteUseCaseImpl(
            InserirEndereco inserirEndereco,
            InserirAdotante inserirAdotante) {
        this.inserirEndereco = inserirEndereco;
        this.inserirAdotante = inserirAdotante;
    }

    @Override
    public Adotante insert(Adotante adotante) throws Exception {
        var endereco = adotante.getEndereco();
        endereco = inserirEndereco.insert(endereco);
        adotante.setEndereco(endereco);
        return inserirAdotante.insert(adotante);
    }
}
