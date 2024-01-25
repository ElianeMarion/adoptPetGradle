package br.com.adoptpet.core.usecase.endereco;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface BuscarEnderecoUseCase {
    Endereco findByCep(String Cep) throws Exception;
}
