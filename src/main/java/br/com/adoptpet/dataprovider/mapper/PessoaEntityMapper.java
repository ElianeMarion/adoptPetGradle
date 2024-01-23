package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.entities.shared.PessoaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaEntityMapper {

    Pessoa toPessoa(PessoaEntity pessoaEntity);

    PessoaEntity toPessoaEntity(Pessoa pessoa);
}
