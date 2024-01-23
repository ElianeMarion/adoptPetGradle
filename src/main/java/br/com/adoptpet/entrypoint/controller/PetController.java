package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.dataprovider.pet.BuscarPetPorRegistro;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;
import br.com.adoptpet.core.usecase.pet.BuscarPetPorRacaUseCase;
import br.com.adoptpet.core.usecase.pet.BuscarPetPorRegistroUseCase;
import br.com.adoptpet.core.usecase.pet.BuscarPetUseCase;
import br.com.adoptpet.core.usecase.pet.InserirPetUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private InserirPetUseCase inserirPet;

    @Autowired
    private BuscarPetUseCase buscarPetUseCase;

    @Autowired
    private BuscarPetPorRegistroUseCase buscarPetPorRegistro;

    @Autowired
    private BuscarPetPorRacaUseCase buscarPetPorRacaUseCase;

    @GetMapping
    public ResponseEntity<List<Pet>> findAll() throws Exception {
        var pets = buscarPetUseCase.listAll();
        return ResponseEntity.ok(pets);
    }
    @GetMapping("/raca/{raca}")
    public ResponseEntity<List<Pet>> findByRaca(@PathVariable String raca) throws Exception {
        var pets = buscarPetPorRacaUseCase.findByRaca(raca);
        return ResponseEntity.ok(pets);
    }
    @GetMapping("/{registro}")
    public ResponseEntity<Pet> findByRegistro(@PathVariable String registro) throws Exception {
        var pet = buscarPetPorRegistro.findByRegistro(registro);
        return ResponseEntity.ok(pet);
    }

    @PostMapping
    public ResponseEntity<Pet> save(@RequestBody Pet pet) throws Exception {
        pet = inserirPet.insert(pet);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(pet);
    }
}
