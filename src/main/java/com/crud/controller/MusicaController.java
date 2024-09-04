package com.crud.controller;

import com.crud.domain.model.Musica;
import com.crud.domain.repository.MusicaRepository;
import com.crud.domain.service.MusicaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository repository;

    @Autowired
    private MusicaService service;

    @GetMapping
    public List<Musica> listar(){
        return repository.findAll();
    }

    @GetMapping("/{musicaId}")
    public Musica buscar(@PathVariable Long musicaId){
        return service.buscarOuFalhar(musicaId);
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Musica adicionar(@RequestBody Musica musica){
        if(repository.existsById(musica.getId())){
            throw new RuntimeException("Musica já existe com ID: " + musica.getId());
        }
        return service.salvar(musica);
    }

    @PutMapping("/{musicaId}")
    public Musica atualizar(@PathVariable Long musicaId,
                            @RequestBody Musica musica){
            Musica musicaAtual = service.buscarOuFalhar(musicaId);

        BeanUtils.copyProperties(musica, musicaAtual, "id");

        return service.salvar(musicaAtual);
    }

    @DeleteMapping("/{musicaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long musicaId){
        service.excluir(musicaId);
    }

}
