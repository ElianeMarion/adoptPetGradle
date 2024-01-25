package br.com.adoptpet.core.dataprovider.endereco;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface BuscarEndereco {
    Endereco findByCep(final String cep);

    Endereco findBy(Endereco endereco);

    void exists(Endereco endereco) throws RuntimeException;
}
