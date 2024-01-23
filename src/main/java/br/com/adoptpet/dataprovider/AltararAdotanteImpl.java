package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AltararAdotanteImpl implements AlterarAdotante {
    @Autowired
    private AdotanteRepository adotanteRepository;
    @Autowired
    private AdotanteEntityMapper mapper;

    @Override
    public void update(Adotante adotante) {
        adotanteRepository.save(mapper.toAdotanteEntity(adotante));
    }
}
