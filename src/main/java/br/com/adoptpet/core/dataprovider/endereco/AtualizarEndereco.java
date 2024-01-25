package br.com.adoptpet.core.dataprovider.endereco;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface AtualizarEndereco {
    Endereco update(Endereco endereco) throws RuntimeException;
}
