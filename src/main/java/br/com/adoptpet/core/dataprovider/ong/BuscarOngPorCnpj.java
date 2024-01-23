package br.com.adoptpet.core.dataprovider.ong;

import br.com.adoptpet.core.domain.ong.Ong;

public interface BuscarOngPorCnpj {
    Ong findByCnpj(final String cnpj);
}
