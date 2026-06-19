package br.com.ms_voo.controller;

import br.com.ms_voo.model.Voo;
import br.com.ms_voo.service.VooService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/voos")
public class VooController {

    private final VooService vooService;

    public VooController(VooService vooService) {
        this.vooService = vooService;
    }

    @GetMapping
    public ResponseEntity<List<Voo>> listarTodos() {
        return ResponseEntity.ok(vooService.listarTudo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Voo> buscarPorId(@PathVariable UUID id) {

        return vooService.buscarPorUUID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Voo> criar(@RequestBody Voo voo) {

        Voo novoVoo = vooService.salvar(voo);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(novoVoo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Voo> atualizar(
            @PathVariable UUID id,
            @RequestBody Voo voo) {

        Voo atualizado = vooService.atualizar(id, voo);

        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {

        vooService.deletar(id);

        return ResponseEntity.noContent().build();
    }
}