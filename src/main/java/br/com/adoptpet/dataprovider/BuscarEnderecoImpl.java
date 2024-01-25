package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.endereco.BuscarEndereco;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.exception.EnderecoExisteNaBaseException;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.mapper.EnderecoEntityMapper;
import br.com.adoptpet.dataprovider.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoImpl implements BuscarEndereco {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private EnderecoEntityMapper enderecoMapper;

    @Override
    public Endereco findByCep(String cep) {
        var enderecoEntity = enderecoRepository.findByCep(cep);
        return enderecoMapper.toEndereco(enderecoEntity);
    }

    @Override
    public Endereco findBy(Endereco endereco) {
        EnderecoEntity entity = enderecoRepository.findByEndereco(enderecoMapper.toEnderecoEntity(endereco));
        return enderecoMapper.toEndereco(entity);
    }

    @Override
    public void exists(Endereco endereco) throws EnderecoExisteNaBaseException {
        var cadastrado = this.findBy(endereco).getId() > 0;
        if (cadastrado) {
            throw new EnderecoExisteNaBaseException();
        }
    }
}
