package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorNome;
import br.com.adoptpet.core.dataprovider.solicitacao_adocao.BuscarSolicitacao;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.domain.shared.enums.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.funcionario.BuscarFuncionarioUseCase;
import br.com.adoptpet.core.usecase.solicitacao_adocao.BuscarSolicitacaoUseCase;
import br.com.adoptpet.core.usecase.solicitacao_adocao.InserirSolicitacaoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoController {

    @Autowired
    private InserirSolicitacaoUseCase inserirSolicitacao;
    @Autowired
    private BuscarSolicitacaoUseCase buscarSolicitacao;
    @Autowired
    private BuscarFuncionarioUseCase buscarFuncionario;

    @GetMapping("/{numero}")
    public ResponseEntity<Solicitacao> findByNumeroSolicitacao(@PathVariable Long numero) throws Exception {
        var solicitacao = buscarSolicitacao.findByNumeroSolicitacao(numero);
        return ResponseEntity.ok(solicitacao);
    }
    @GetMapping
    public ResponseEntity<List<Solicitacao>> findAll() throws Exception {
        var solicitacoes = buscarSolicitacao.findAll();
        return ResponseEntity.ok(solicitacoes);
    }
    @GetMapping("/data/{dataSolicitacao}")
    public ResponseEntity<List<Solicitacao>> findByDataSolicitacao(@PathVariable LocalDate dataSolicitacao) throws Exception {
        var solicitacoes = buscarSolicitacao.findByDataSolicitacao(dataSolicitacao);
        return ResponseEntity.ok(solicitacoes);
    }
    @GetMapping("/status/{status}")
    public ResponseEntity<List<Solicitacao>> findByStatusSolicitacao(@PathVariable StatusSolicitacaoEnum status) throws Exception {
        var solicitacoes = buscarSolicitacao.findByStatusSolicitacao(status);
        return ResponseEntity.ok(solicitacoes);
    }

    @GetMapping("/funcionario/{cpfFuncionario}")
    public ResponseEntity<List<Solicitacao>> findByFuncionario(@PathVariable String cpfFuncionario) throws Exception {
        var funcionario = buscarFuncionario.findByCpf(cpfFuncionario);
        var solicitacoes = buscarSolicitacao.findByFuncionario(funcionario);
        return ResponseEntity.ok(solicitacoes);
    }
    /*
    Falta implementar BuscarPessoa
    @GetMapping("/{nome}")
    public ResponseEntity<Solicitacao> findBySolicitante(@PathVariable String nome) throws Exception {
        var solicitante =
        var solicitacao = buscarSolicitacao.findByNumeroSolicitacao(numero);
        return ResponseEntity.ok(solicitacao);
    }
*/
    @PostMapping
    public ResponseEntity<Solicitacao> save(@RequestBody Solicitacao solicitacao) throws Exception {
        solicitacao = inserirSolicitacao.insert(solicitacao);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(solicitacao);
    }
}
