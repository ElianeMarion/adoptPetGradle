package br.com.adoptpet.dataprovider.mapper;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.entities.solicitacao_adocao.SolicitacaoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SolicitacaoEntityMapper {

    Solicitacao toSolicitacao(SolicitacaoEntity solicitacaoEntity);
    SolicitacaoEntity toSolicitacaoEntity(Solicitacao solicitacao);

    List<Solicitacao> toListSolicitacao(List<SolicitacaoEntity> solicitacoes);
    List<SolicitacaoEntity> toListSolicitacaoEntity(List<Solicitacao> solicitacoes);
}
