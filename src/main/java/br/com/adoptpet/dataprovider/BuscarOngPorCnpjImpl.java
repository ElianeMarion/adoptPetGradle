package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorCnpj;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.entities.ong.OngEntity;
import br.com.adoptpet.dataprovider.mapper.OngEntityMapper;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarOngPorCnpjImpl implements BuscarOngPorCnpj {
    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private OngEntityMapper mapper;

    @Override
    public Ong findByCnpj(String cnpj) {
        var ong = ongRepository.findByCnpj(cnpj);
        return mapper.toOng(ong);
    }
}
