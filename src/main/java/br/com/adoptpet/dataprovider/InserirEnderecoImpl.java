package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.exception.EnderecoExisteNaBaseException;
import br.com.adoptpet.core.usecase.endereco.exception.FalhaAoIncluirEnderecoException;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.mapper.EnderecoEntityMapper;
import br.com.adoptpet.dataprovider.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Component
public class InserirEnderecoImpl implements InserirEndereco {

    @Autowired
    private EnderecoRepository repository;
    @Autowired
    private EnderecoEntityMapper mapper;

    @Override
    @Transactional
    public Endereco insert(Endereco endereco) throws RuntimeException {
        enderecoExiste(endereco);
        var entity = repository.save(mapper.toEnderecoEntity(endereco));
        enderecoSalvo(entity);
        if (!this.enderecoSalvo(entity)) throw new FalhaAoIncluirEnderecoException();
        return mapper.toEndereco(entity);
    }

    private void enderecoExiste(Endereco endereco) throws EnderecoExisteNaBaseException{
        if (this.enderecoSalvo(mapper.toEnderecoEntity(endereco))) throw new EnderecoExisteNaBaseException();
    }

    private boolean enderecoSalvo(EnderecoEntity entity){
        try {
            EnderecoEntity endereco = repository.findByCep(entity.getCep());
            return (Objects.equals(entity.getEndereco(), endereco.getEndereco())) &&
                     (Objects.equals(entity.getCep(), endereco.getCep())) &&
                     (Objects.equals(entity.getCidade(), endereco.getCidade())) &&
                     (Objects.equals(entity.getEstado(), endereco.getEstado())) &&
                     (Objects.equals(entity.getBairro(), endereco.getBairro())) &&
                     (Objects.equals(entity.getNumero(), endereco.getNumero()));
        }catch (Exception e){
            return false;
        }
    }
}
