package br.com.adoptpet.core.dataprovider.endereco;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface BuscarEnderecoPorCep {

    Endereco findByCep(final String cep);
}
