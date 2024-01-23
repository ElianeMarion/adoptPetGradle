package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.dataprovider.mapper.EnderecoEntityMapper;
import br.com.adoptpet.dataprovider.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class InserirEnderecoImpl implements InserirEndereco {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private EnderecoEntityMapper enderecoMapper;

    @Override
    @Transactional
    public Endereco insert(Endereco endereco) {
        var enderecoEntity = enderecoMapper.toEnderecoEntity(endereco);
        enderecoEntity = enderecoRepository.save(enderecoEntity);
        var enderecoNovo = enderecoRepository.findById(enderecoEntity.getId())
                .orElseThrow(() -> new RuntimeException("Endereço não localizado"));;
        return enderecoMapper.toEndereco(enderecoNovo);
    }
}
