package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.dataprovider.endereco.InserirEndereco;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.exception.EmailExisteNaBaseException;
import br.com.adoptpet.core.usecase.endereco.exception.EnderecoExisteNaBaseException;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.entrypoint.controller.exceptions.ControllerNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InserirAdotanteImpl implements InserirAdotante {
    @Autowired
    private AdotanteRepository adotanteRepository;
    @Autowired
    private InserirEndereco endereco;
    @Autowired
    private AdotanteEntityMapper mapper;

    public AdotanteEntity findById(Long id){
        return adotanteRepository.findById(id)
                .orElseThrow(()-> new ControllerNotFoundException("Adotante não encontrado"));
    }


    @Override
    public void emailLiberado(String email){
        AdotanteEntity adotante = adotanteRepository.findByEmail(email);
        if (adotante != null) {
            throw new EmailExisteNaBaseException();
        }
    }

    @Override
    @Transactional
    public Adotante insert(Adotante adotante) throws RuntimeException{
        var endereco = this.endereco.insert(adotante.getEndereco());
        adotante.setEndereco(endereco);
        adotanteRepository.save(mapper.toAdotanteEntity(adotante));
        return adotante;
    }
}
