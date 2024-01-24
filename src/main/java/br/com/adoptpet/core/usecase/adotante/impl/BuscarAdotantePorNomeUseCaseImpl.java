package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorNome;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorNomeUseCase;

import java.util.List;

public class BuscarAdotantePorNomeUseCaseImpl implements BuscarAdotantePorNomeUseCase {

    private final BuscarAdotantePorNome buscarAdotantePorNome;

    public BuscarAdotantePorNomeUseCaseImpl(BuscarAdotantePorNome buscarAdotantePorNome) {
        this.buscarAdotantePorNome = buscarAdotantePorNome;
    }

    @Override
    public Adotante findByNome(String nome) throws Exception {
        return buscarAdotantePorNome.findByNome(nome);
    }

    @Override
    public List<Adotante> findAll() {
        return buscarAdotantePorNome.findAll();
    }
}
