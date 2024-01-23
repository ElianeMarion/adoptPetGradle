package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.BuscarEnderecoPorCepUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private BuscarEnderecoPorCepUseCase buscarEnderecoPorCepUseCase;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> findByCep(@PathVariable String cep) throws Exception {
        var endereco = buscarEnderecoPorCepUseCase.findByCep(cep);
        return ResponseEntity.ok(endereco);
    }

}
