package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.entities.funcionario.FuncionarioEntity;
import br.com.adoptpet.dataprovider.mapper.FuncionarioEntityMapper;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarFuncionarioImpl implements BuscarFuncionario {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioEntityMapper mapper;

    @Override
    public Funcionario findByCpf(String cpf) {
        return mapper.toFuncionario(funcionarioRepository.findByCpf(cpf));
    }
}
