package com.crud.service;

import com.crud.model.Musica;
import com.crud.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public List<Musica> getAllMusicas(){
        return musicaRepository.findAll();
    }

    public Musica getMusicaById(Long id){
    }

    public Musica createMusica(Musica musica){
        return musicaRepository.save(musica);
    }

    public Musica updateMusica(Long id, Musica musicaDetails){
        Musica musica = getMusicaById(id);
        musica.setName(musicaDetails.getName());
        musica.setGenero(musica.getGenero());
        return musicaRepository.save(musica);
    }

    public void deleteMusica(Long id){
        musicaRepository.deleteById(id);
    }
}
