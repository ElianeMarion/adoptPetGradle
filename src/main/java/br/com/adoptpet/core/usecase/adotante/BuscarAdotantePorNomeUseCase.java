package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface BuscarAdotantePorNomeUseCase {

    Adotante findByNome(String nome) throws Exception;
}
