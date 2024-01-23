package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface AdotanteEntityMapper {
    // @Mapping(target = "id", ignore = true)
    //@Mapping(target = "endereco", ignore = true)
    Adotante toAdotante(AdotanteEntity entity);
    AdotanteEntity toAdotanteEntity(Adotante adotante);
}
