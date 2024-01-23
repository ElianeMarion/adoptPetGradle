package br.com.adoptpet.core.dataprovider.pessoa;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscarPessoa {
    Pessoa findById(final Long id);
    Pessoa findByNome(final String nome);
}
