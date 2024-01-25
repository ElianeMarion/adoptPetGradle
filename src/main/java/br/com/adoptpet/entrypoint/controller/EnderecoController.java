package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.usecase.endereco.BuscarEnderecoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private BuscarEnderecoUseCase buscarEnderecoUseCase;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> findByCep(@PathVariable String cep) throws Exception {
        var endereco = buscarEnderecoUseCase.findByCep(cep);
        return ResponseEntity.ok(endereco);
    }

}
