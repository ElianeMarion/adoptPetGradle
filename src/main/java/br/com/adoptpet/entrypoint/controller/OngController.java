package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.BuscarOngPorCnpjUseCase;
import br.com.adoptpet.core.usecase.ong.InserirOngUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ongs")
public class OngController {

    @Autowired
    private InserirOngUseCase inserirOngUseCase;

    @Autowired
    private BuscarOngPorCnpjUseCase buscarOngPorCnpjUseCase;

    @GetMapping("/{cnpj}")
    public ResponseEntity<Ong> findByCnpj(@PathVariable String cnpj) throws Exception {
        var ong = buscarOngPorCnpjUseCase.findByCnpj(cnpj);
        return ResponseEntity.ok(ong);
    }

    @PostMapping
    public ResponseEntity<Ong> save(@RequestBody Ong ong) throws Exception {
        ong = inserirOngUseCase.insert(ong);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(ong);
    }
}
