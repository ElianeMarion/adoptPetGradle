package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.BuscarFuncionarioUseCase;
import br.com.adoptpet.core.usecase.funcionario.InserirFuncionarioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private InserirFuncionarioUseCase inserirFuncionario;

    @Autowired
    private BuscarFuncionarioUseCase buscarFuncionario;

    @GetMapping("/{cpf}")
    public ResponseEntity<Funcionario> findByCpf(@PathVariable String cpf) throws Exception {
        var funcionario = buscarFuncionario.findByCpf(cpf);
        return ResponseEntity.ok(funcionario);
    }

    @PostMapping
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) throws Exception {
        funcionario = inserirFuncionario.insert(funcionario);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(funcionario);
    }
}
