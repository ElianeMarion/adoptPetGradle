package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.AlterarAdotanteUseCase;

public class AlterarAdotanteUseCaseImpl implements AlterarAdotanteUseCase {
    private final AlterarAdotante alterarAdotante;

    public AlterarAdotanteUseCaseImpl(AlterarAdotante alterarAdotante) {
        this.alterarAdotante = alterarAdotante;
    }

    @Override
    public void update(Adotante adotante) {
        alterarAdotante.update(adotante);

    }
}
