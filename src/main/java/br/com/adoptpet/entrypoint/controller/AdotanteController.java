package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.AlterarAdotanteUseCase;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorNomeUseCase;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adotantes")
public class AdotanteController {
    @Autowired
    private InserirAdotanteUseCase inserirAdotanteUseCase;
    @Autowired
    private BuscarAdotantePorNomeUseCase buscarAdotantePorCpfUseCase;
    @Autowired
    private AlterarAdotanteUseCase alterarAdotante;

    @GetMapping
    public ResponseEntity<List<Adotante>> findAll() throws Exception {
        List<Adotante> adotantes = buscarAdotantePorCpfUseCase.findAll();
        return ResponseEntity.ok(adotantes);
    }
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

    @PutMapping("/{nome}")
    public ResponseEntity<Adotante> update(@PathVariable String nome,
                                           @RequestBody Adotante adotante) throws Exception {
        alterarAdotante.update(adotante);
        return ResponseEntity.ok(adotante);

    }
}
