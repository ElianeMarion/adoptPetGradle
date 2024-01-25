package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface InserirAdotanteUseCase {
    Adotante insert(Adotante adotante) throws RuntimeException;
}
