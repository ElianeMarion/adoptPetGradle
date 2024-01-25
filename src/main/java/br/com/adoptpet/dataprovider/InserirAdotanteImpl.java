package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.mapper.EnderecoEntityMapper;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.EnderecoRepository;
import br.com.adoptpet.entrypoint.controller.exceptions.ControllerNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirAdotanteImpl implements InserirAdotante {
    @Autowired
    private AdotanteRepository adotanteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private AdotanteEntityMapper mapperAdotante;
    @Autowired
    private EnderecoEntityMapper mapperEndereco;


    public AdotanteEntity findById(Long id){
        var adotante = adotanteRepository.findById(id)
                .orElseThrow(()-> new ControllerNotFoundException("Adotante não encontrado"));
        return adotante;
    }

    @Override
    @Transactional
    public Adotante insert(Adotante adotante) {
        EnderecoEntity endereco = enderecoRepository.save(mapperEndereco.toEnderecoEntity(adotante.getEndereco()));
        adotante.setEndereco(mapperEndereco.toEndereco(endereco));
        adotanteRepository.save(mapperAdotante.toAdotanteEntity(adotante));
        return adotante;
    }
}
