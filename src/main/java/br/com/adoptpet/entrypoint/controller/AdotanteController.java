package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorNomeUseCase;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adotantes")
public class AdotanteController {
    @Autowired
    private InserirAdotanteUseCase inserirAdotanteUseCase;
    @Autowired
    private BuscarAdotantePorNomeUseCase buscarAdotantePorCpfUseCase;

    @GetMapping("/{nome}")
    public ResponseEntity<Adotante> findByNome(@PathVariable String nome) throws Exception {
        var adotante = buscarAdotantePorCpfUseCase.findByNome(nome);
        return ResponseEntity.ok(adotante);
    }

    @PostMapping
    public ResponseEntity<Adotante> save(@RequestBody Adotante adotante) throws Exception {
        adotante = inserirAdotanteUseCase.insert(adotante);

        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(adotante);
    }

}
