package br.com.adoptpet.core.dataprovider.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface InserirAdotante {
    Adotante insert(Adotante adotante);

    void emailLiberado(String email);
}
