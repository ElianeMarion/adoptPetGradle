package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface AlterarAdotanteUseCase {

    void update(Adotante adotante) throws Exception;
}
