package br.com.adoptpet.core.usecase.pessoa.impl;

import br.com.adoptpet.core.dataprovider.pessoa.BuscarPessoa;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.pessoa.BuscarPessoaUseCase;

public class BuscarPessoaUseCaseImpl implements BuscarPessoaUseCase {

    private final BuscarPessoa buscarPessoa;

    public BuscarPessoaUseCaseImpl(BuscarPessoa buscarPessoa) {
        this.buscarPessoa = buscarPessoa;
    }

    @Override
    public Pessoa findById(Long id) throws Exception {
        return buscarPessoa.findById(id);
    }

    @Override
    public Pessoa findByNome(String nome) throws Exception {
        return buscarPessoa.findByNome(nome);
    }
}
