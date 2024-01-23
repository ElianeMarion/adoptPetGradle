package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface EnderecoEntityMapper {
    //@Mapping(target = "id")
    Endereco toEndereco(EnderecoEntity entity);
    EnderecoEntity toEnderecoEntity(Endereco endereco);
}
