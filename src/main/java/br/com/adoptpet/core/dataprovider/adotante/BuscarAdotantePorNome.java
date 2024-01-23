package br.com.adoptpet.core.dataprovider.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface BuscarAdotantePorNome {

    Adotante findByNome(final String nome);
}
