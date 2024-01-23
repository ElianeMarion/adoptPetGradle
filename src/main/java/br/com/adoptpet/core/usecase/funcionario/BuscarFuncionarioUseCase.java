package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface BuscarFuncionarioUseCase {
    Funcionario findByCpf(String cpf) throws Exception;
}
