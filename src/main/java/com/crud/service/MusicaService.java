package com.crud.service;

import com.crud.model.Musica;
import com.crud.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public List<Musica> listarTodos(){
        return musicaRepository.findAll();
    }

    public Optional<Musica> buscarPorId(Long id){
        return musicaRepository.findById(id);
    }

    public Musica salvar(Musica musica){
        return musicaRepository.save(musica);
    }

    public Musica atualizar(Long id, Musica musica){
        if(musicaRepository.existsById(id)){
            throw new RuntimeException("Musica não encontrada");
        }
        musica.setId(id);
        return musicaRepository.save(musica);
    }

    public void deletar(Long id){
        musicaRepository.deleteById(id);
    }
}
