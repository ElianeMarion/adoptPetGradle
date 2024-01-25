package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;

public class InserirAdotanteUseCaseImpl implements InserirAdotanteUseCase {
    private final InserirAdotante inserirAdotante;

    public InserirAdotanteUseCaseImpl(InserirAdotante inserirAdotante) {
        this.inserirAdotante = inserirAdotante;
    }

    @Override
    public Adotante insert(Adotante adotante) throws Exception {
        return inserirAdotante.insert(adotante);
    }
}
