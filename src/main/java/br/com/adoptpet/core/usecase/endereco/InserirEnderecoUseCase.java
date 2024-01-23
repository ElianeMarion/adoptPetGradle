package br.com.adoptpet.core.usecase.endereco;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface InserirEnderecoUseCase {

    Endereco insert(Endereco endereco) throws Exception;
}