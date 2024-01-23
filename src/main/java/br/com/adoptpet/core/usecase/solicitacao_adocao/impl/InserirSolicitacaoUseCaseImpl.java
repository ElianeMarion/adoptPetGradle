package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;


import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.dataprovider.pessoa.BuscarPessoa;
import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRegistro;
import br.com.adoptpet.core.dataprovider.solicitacao_adocao.InserirSolicitacao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.InserirSolicitacaoUseCase;

public class InserirSolicitacaoUseCaseImpl implements InserirSolicitacaoUseCase {
    private final InserirSolicitacao inserirSolicitacao;
    private final BuscarPetPorRegistro buscarPet;
    private final BuscarFuncionario buscarFuncionario;
    private final BuscarPessoa buscarPessoa;

    public InserirSolicitacaoUseCaseImpl(InserirSolicitacao inserirSolicitacao,
                                         BuscarPetPorRegistro buscarPet,
                                         BuscarFuncionario buscarFuncionario,
                                         BuscarPessoa buscarPessoa) {
        this.inserirSolicitacao = inserirSolicitacao;
        this.buscarPet = buscarPet;
        this.buscarFuncionario = buscarFuncionario;
        this.buscarPessoa = buscarPessoa;
    }

    @Override
    public Solicitacao insert(Solicitacao solicitacao) {
        var pet = buscarPet.findByRegistro(solicitacao.getPet().getRegistro());
        solicitacao.setPet(pet);
        var funcionario = buscarFuncionario.findByCpf(solicitacao.getFuncionario().getCpf());
        solicitacao.setFuncionario(funcionario);
        var pessoa = buscarPessoa.findByNome(solicitacao.getSolicitante().getNome());
        solicitacao.setSolicitante(pessoa);
        return inserirSolicitacao.insert(solicitacao);
    }
}

