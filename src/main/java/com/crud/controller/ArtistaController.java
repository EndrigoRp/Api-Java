package com.crud.controller;

import com.crud.domain.model.Artista;
import com.crud.domain.repository.ArtistaRepository;
import com.crud.domain.service.ArtistaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaRepository repository;

    @Autowired
    private ArtistaService service;

    @GetMapping
    private List<Artista> listar(){
        return repository.findAll();
    }

    @GetMapping("/{artistaId}")
    private Artista buscar(@PathVariable Long artistaId){
        return service.buscarOuFalhar(artistaId);
    }

    @PostMapping("/{id}")
    public Artista adicionar(@RequestBody Artista artista){
        if(repository.existsById(artista.getId())){
            throw new RuntimeException("Musica já existe com ID: " + artista.getId());
        }
        return service.salvar(artista);
    }

    @PutMapping("/{artistaId}")
    public Artista atualizar(@PathVariable Long artistaId,
                             @RequestBody Artista artista){
        Artista artistaAtual = service.buscarOuFalhar(artistaId);

        BeanUtils.copyProperties(artista, artistaAtual, "id");

        return service.salvar(artistaAtual);
    }



















}
