package br.com.adoptpet.core.usecase.pessoa;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscarPessoaUseCase {
    Pessoa findById(Long id) throws Exception;
    Pessoa findByNome(String nome) throws Exception;

}
