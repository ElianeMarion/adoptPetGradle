package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface InserirFuncionarioUseCase {

    Funcionario insert(Funcionario funcionario) throws Exception;
}
