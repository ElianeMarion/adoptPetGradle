package br.com.adoptpet.core.dataprovider.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

import java.util.List;

public interface BuscarAdotantePorNome {

    Adotante findByNome(final String nome);

    List<Adotante> findAll();
}
