package com.edufelizardo.maissaudepublica.controller;

import com.edufelizardo.maissaudepublica.model.ProgramaDeSaude;
import com.edufelizardo.maissaudepublica.model.exception.ProgramaDeSaudeNaoEncontradoException;
import com.edufelizardo.maissaudepublica.model.exception.ProgramaDeSaudeNotFoundException;
import com.edufelizardo.maissaudepublica.service.ProgramaDeSaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("programas")
public class ProgramaDeSaudeControler {
    @Autowired
    private ProgramaDeSaudeService programaDeSaudeService;
    @GetMapping
    public ResponseEntity<Iterable<ProgramaDeSaude>> buscarTodos() {
        Iterable<ProgramaDeSaude> programasDeSaude = programaDeSaudeService.buscarTodos();
        return ResponseEntity.ok(programasDeSaude);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProgramaDeSaude> buscarId(@PathVariable Long id) throws ProgramaDeSaudeNaoEncontradoException {
        ProgramaDeSaude saude = programaDeSaudeService.buscarId(id);
        return ResponseEntity.ok(saude);
    }
    @PostMapping
    public ResponseEntity<ProgramaDeSaude> salvarProgramaDeSaude(@RequestBody ProgramaDeSaude saude) {
        ProgramaDeSaude programaDeSaude = programaDeSaudeService.salvarPrograma(saude);

        return ResponseEntity.ok(programaDeSaude);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<ProgramaDeSaude> atualizarPrograma(@PathVariable Long id, @RequestBody ProgramaDeSaude saude) {
        try {
            saude.setProgramaDeSaude_id(id);
            ProgramaDeSaude programaAtualizado = programaDeSaudeService.atualizarPrograma(saude);
            return ResponseEntity.ok(programaAtualizado);
        } catch (ProgramaDeSaudeNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (ProgramaDeSaudeNaoEncontradoException e) {
            throw new RuntimeException(e);
        }
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ProgramaDeSaude> apagarPrograma(@PathVariable Long id) throws ProgramaDeSaudeNaoEncontradoException {
        programaDeSaudeService.apagarPrograma(id);
        return ResponseEntity.noContent().build();
    }
}
