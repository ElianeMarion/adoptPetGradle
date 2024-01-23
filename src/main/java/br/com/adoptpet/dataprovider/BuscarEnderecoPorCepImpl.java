package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.endereco.BuscarEnderecoPorCep;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.dataprovider.mapper.EnderecoEntityMapper;
import br.com.adoptpet.dataprovider.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepImpl implements BuscarEnderecoPorCep {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private EnderecoEntityMapper enderecoMapper;

    @Override
    public Endereco findByCep(String cep) {
        var enderecoEntity = enderecoRepository.findByCep(cep);
        return enderecoMapper.toEndereco(enderecoEntity);
    }
}
