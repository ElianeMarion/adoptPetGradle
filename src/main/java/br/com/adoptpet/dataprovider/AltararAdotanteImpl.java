package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.entities.adotante.AdotanteEntity;
import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import br.com.adoptpet.dataprovider.mapper.AdotanteEntityMapper;
import br.com.adoptpet.dataprovider.mapper.EnderecoEntityMapper;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.EnderecoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AltararAdotanteImpl implements AlterarAdotante {
    @Autowired
    private AdotanteRepository adotanteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private EnderecoEntityMapper mapperEndereco;

    @Override
    @Transactional
    public void update(Adotante adotante) {

        EnderecoEntity endereco = enderecoRepository.findById(adotante.getEndereco().getId())
                .orElseThrow(() -> new RuntimeException("O Endereção não foi localizado"));
        adotante.setEndereco(mapperEndereco.toEndereco(endereco));

        AdotanteEntity adotanteEntity = adotanteRepository.findById(adotante.getId())
                .orElseThrow(() -> new RuntimeException("Os dados do adotante não foram localizados."));

        adotanteRepository.save(adotanteEntity);
    }
}
