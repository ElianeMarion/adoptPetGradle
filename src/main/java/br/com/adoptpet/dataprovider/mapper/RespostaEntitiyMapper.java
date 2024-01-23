package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.entities.resposta.RespostaEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface RespostaEntitiyMapper {
    Resposta toResposta(RespostaEntity respostaEntity);
    RespostaEntity toRespostaEntity(Resposta resposta);

    List<Resposta> toListResposta(List<RespostaEntity> respostas);
    List<RespostaEntity> toListRespostaEntity(List<Resposta> respostas);
}
