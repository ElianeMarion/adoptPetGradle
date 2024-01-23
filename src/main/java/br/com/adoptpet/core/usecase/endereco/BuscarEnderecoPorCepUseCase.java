package br.com.adoptpet.core.usecase.endereco;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface BuscarEnderecoPorCepUseCase {
    Endereco findByCep(String Cep) throws Exception;
}
