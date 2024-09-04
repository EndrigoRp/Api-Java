package com.crud.domain.service;

import com.crud.domain.exception.EntidadeNaoEncontradaException;
import com.crud.domain.model.Artista;
import com.crud.domain.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService {

    private static final String MSG_ARTISTA_NAO_ENCONTRADA
            = "Não existe um cadastro de musica com código %d";

    @Autowired
    private ArtistaRepository artistaRepository;

    public Artista salvar(Artista artista){
        return artistaRepository.save(artista);
    }

    public void excluir(Long artistaId){
        try {
            artistaRepository.deleteById(artistaId);
        } catch (EmptyResultDataAccessException e){
            throw new EntidadeNaoEncontradaException(
                    String.format(MSG_ARTISTA_NAO_ENCONTRADA, artistaId));
        }
    }

    public Artista buscarOuFalhar(Long artistaId){
        return artistaRepository.findById(artistaId)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        String.format(MSG_ARTISTA_NAO_ENCONTRADA, artistaId)));
    }
}