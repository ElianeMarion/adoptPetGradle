package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.ong.InserirOng;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.mapper.OngEntityMapper;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirOngImpl implements InserirOng {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private OngEntityMapper mapper;

    @Override
    public Ong insert(Ong ong) {
        ongRepository.save(mapper.toOngEntity(ong));
        return ong;
    }
}
