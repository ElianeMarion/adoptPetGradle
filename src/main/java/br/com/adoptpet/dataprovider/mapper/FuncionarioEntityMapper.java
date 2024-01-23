package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.entities.funcionario.FuncionarioEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FuncionarioEntityMapper {
    Funcionario toFuncionario(FuncionarioEntity entity);
    FuncionarioEntity toFuncionarioEntity(Funcionario funcionario);
}
