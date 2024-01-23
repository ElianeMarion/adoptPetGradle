package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorNome;
import br.com.adoptpet.core.dataprovider.endereco.BuscarEnderecoPorCep;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.AlterarAdotanteUseCase;

public class AlterarAdotanteUseCaseImpl implements AlterarAdotanteUseCase {
    private final AlterarAdotante alterarAdotante;
    private final BuscarAdotantePorNome buscarAdotante;
    private final BuscarEnderecoPorCep buscarEndereco;

    public AlterarAdotanteUseCaseImpl(AlterarAdotante alterarAdotante, BuscarAdotantePorNome buscarAdotante, BuscarEnderecoPorCep buscarEndereco) {
        this.alterarAdotante = alterarAdotante;
        this.buscarAdotante = buscarAdotante;
        this.buscarEndereco = buscarEndereco;
    }

    @Override
    public void update(Adotante adotante) throws Exception {
        var adotanteNovo = buscarAdotante.findByNome(adotante.getNome());
        adotanteNovo.setEndereco(buscarEndereco.findByCep(adotante.getEndereco().getCep()));
        adotanteNovo.setTelefone(adotante.getTelefone());
        adotanteNovo.setEmail(adotante.getEmail());
        alterarAdotante.update(adotanteNovo);

    }
}
