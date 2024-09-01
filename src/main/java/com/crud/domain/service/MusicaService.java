package com.crud.domain.service;

import com.crud.domain.exception.EntidadeNaoEncontradaException;
import com.crud.domain.model.Musica;
import com.crud.domain.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {

    private static final String MSG_MUSICA_NAO_ENCONTRADA
            = "Não existe um cadastro de musica com código %d";

    @Autowired
    private MusicaRepository musicaRepository;

    public Musica salvar(Musica musica){
        return musicaRepository.save(musica);
    }

    public void excluir(Long musicaId){
        try {
            musicaRepository.deleteById(musicaId);
        } catch (EmptyResultDataAccessException e){
            throw new EntidadeNaoEncontradaException(
                    String.format(MSG_MUSICA_NAO_ENCONTRADA, musicaId));
        }
    }

    public Musica buscarOuFalhar(Long musicaId){
        return musicaRepository.findById(musicaId)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        String.format(MSG_MUSICA_NAO_ENCONTRADA, musicaId)));

    }

}
