package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.pessoa.BuscarPessoa;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.mapper.PessoaEntityMapper;
import br.com.adoptpet.dataprovider.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarPessoaImpl implements BuscarPessoa {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PessoaEntityMapper mapper;

    @Override
    public Pessoa findById(Long id) {
        var pessoaEntity = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitante não encontrado"));
        return mapper.toPessoa(pessoaEntity);
    }

    @Override
    public Pessoa findByNome(String nome) {
        var pessoaEntity = pessoaRepository.findByNome(nome)
                .orElseThrow(() -> new RuntimeException("Solicitante não encontrado"));
        return mapper.toPessoa(pessoaEntity);
    }
}
