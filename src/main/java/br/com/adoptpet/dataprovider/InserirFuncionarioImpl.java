package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.InserirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.mapper.FuncionarioEntityMapper;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirFuncionarioImpl implements InserirFuncionario {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioEntityMapper mapper;

    @Override
    public Funcionario insert(Funcionario funcionario) {
        return mapper.toFuncionario(funcionarioRepository.save(mapper.toFuncionarioEntity(funcionario)));
    }
}
