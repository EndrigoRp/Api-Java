package com.crud.controller;

import com.crud.model.Musica;
import com.crud.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/com/crud")
public class MusicaController {

    @Autowired
    private MusicaService service;

    @GetMapping
    public List<Musica> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Musica createMusica(@RequestBody Musica musica){
        return service.salvar(musica);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizar(@PathVariable Long id,
                                               @RequestBody Musica musica){
        return ResponseEntity.ok(service.atualizar(id, musica));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
