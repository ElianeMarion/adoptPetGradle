package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.entrypoint.controller.exceptions.ControllerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirAdotanteImpl implements InserirAdotante {
    @Autowired
    private AdotanteRepository adotanteRepository;
    @Autowired
   private AdotanteEntityMapper mapper;


    public AdotanteEntity findById(Long id){
        var adotante = adotanteRepository.findById(id)
                .orElseThrow(()-> new ControllerNotFoundException("Adotante não encontrado"));
        return adotante;
    }

    @Override
    public Adotante insert(Adotante adotante) {
       //var endereco = inserirEndereco.insert(adotante.getEndereco());
       // adotante.setEndereco(endereco);
        adotanteRepository.save(mapper.toAdotanteEntity(adotante));
        return adotante;
    }
}
