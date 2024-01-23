package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.entities.ong.OngEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OngEntityMapper {
    Ong toOng(OngEntity ongEntity);

    OngEntity toOngEntity(Ong ong);
}
