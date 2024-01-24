package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorNome;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BuscarAdotantePorNomeImpl implements BuscarAdotantePorNome {

    @Autowired
    private AdotanteRepository adotanteRepository;
    @Autowired
    private AdotanteEntityMapper mapper;
    @Override
    public Adotante findByNome(String nome) {
        var adotanteEntity = adotanteRepository.findByNome(nome);
        return mapper.toAdotante(adotanteEntity);
    }

    @Override
    public List<Adotante> findAll() {
        return adotanteRepository
                .findAll().stream()
                .map((adotanteEntity -> mapper.toAdotante(adotanteEntity))).collect(Collectors.toList());
    }
}
