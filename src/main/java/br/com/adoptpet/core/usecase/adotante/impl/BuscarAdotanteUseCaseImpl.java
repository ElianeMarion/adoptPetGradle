package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotanteUseCase;

import java.util.List;

public class BuscarAdotanteUseCaseImpl implements BuscarAdotanteUseCase {

    private final BuscarAdotante buscarAdotante;

    public BuscarAdotanteUseCaseImpl(BuscarAdotante buscarAdotante) {
        this.buscarAdotante = buscarAdotante;
    }

    @Override
    public Adotante findByNome(String nome) throws Exception {
        return buscarAdotante.findByNome(nome);
    }

    @Override
    public List<Adotante> findAll() {
        return buscarAdotante.findAll();
    }
}
