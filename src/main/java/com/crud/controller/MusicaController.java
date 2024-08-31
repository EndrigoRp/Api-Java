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
    public List<Musica> getAllMusicas(){
        return service.getAllMusicas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> getMusicaById(@PathVariable Long id){
        Musica musica = service.getMusicaById(id);
        return ResponseEntity.ok().body(musica);
    }

    @PostMapping
    public Musica createMusica(@RequestBody Musica musica){
        return service.createMusica(musica);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Musica> updateMusica(@PathVariable Long id,
                                               @RequestBody Musica musicaDetails){
        Musica updateMusica = service.updateMusica(id, musicaDetails);
        return ResponseEntity.ok(updateMusica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusica(@PathVariable Long id){
        service.deleteMusica(id);
        return ResponseEntity.noContent().build();
    }

}
