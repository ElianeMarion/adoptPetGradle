package br.com.adoptpet.core.usecase.ong;

import br.com.adoptpet.core.domain.ong.Ong;

public interface BuscarOngPorCnpjUseCase {

    Ong findByCnpj(String cnpj) throws Exception;
}
