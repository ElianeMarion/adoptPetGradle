package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

import java.util.List;

public interface BuscarAdotanteUseCase {

    Adotante findByNome(String nome) throws Exception;

    List<Adotante> findAll();
}
