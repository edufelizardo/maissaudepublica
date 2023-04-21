package com.edufelizardo.maissaudepublica.service;

import com.edufelizardo.maissaudepublica.model.ProgramaDeSaude;
import com.edufelizardo.maissaudepublica.model.exception.ProgramaDeSaudeNaoEncontradoException;
import com.edufelizardo.maissaudepublica.model.exception.ProgramaDeSaudeNotFoundException;
import com.edufelizardo.maissaudepublica.repositories.ProgramaDeSaudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaDeSaudeService {
    @Autowired
    private ProgramaDeSaudeRepository saudeRepository;

    public ProgramaDeSaudeService(ProgramaDeSaudeRepository saudeRepository) {
        this.saudeRepository = saudeRepository;
    }

    public Iterable<ProgramaDeSaude> buscarTodos() {
        Iterable<ProgramaDeSaude> programaDeSaudes = saudeRepository.findAll();
        return programaDeSaudes;
    }

    public ProgramaDeSaude buscarId(Long id) throws ProgramaDeSaudeNaoEncontradoException {
        ProgramaDeSaude deSaude = saudeRepository.findById(id)
                .orElseThrow(() -> new ProgramaDeSaudeNaoEncontradoException(id));
        return deSaude;
    }

    public ProgramaDeSaude salvarPrograma(ProgramaDeSaude saude) {
        return saudeRepository.save(saude);
    }

    public ProgramaDeSaude atualizarPrograma(ProgramaDeSaude saude) throws ProgramaDeSaudeNotFoundException, ProgramaDeSaudeNaoEncontradoException {
        buscarId(saude.getProgramaDeSaude_id());
        return saudeRepository.save(saude);
    }

    public void apagarPrograma(Long id) throws ProgramaDeSaudeNaoEncontradoException {
        buscarId(id);
        saudeRepository.deleteById(id);
    }
}
