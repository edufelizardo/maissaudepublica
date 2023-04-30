package com.edufelizardo.maissaudepublica.controller;

import com.edufelizardo.maissaudepublica.model.Subarea;
import com.edufelizardo.maissaudepublica.model.exception.SubareaNaoEncontradoException;
import com.edufelizardo.maissaudepublica.service.SubareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "areas/subareas")
public class SubareaController {
    @Autowired
    private SubareaService subareaService;

    public SubareaController(SubareaService subareaService) {
        this.subareaService = subareaService;
    }
    @GetMapping
    public ResponseEntity<Iterable<Subarea>> buscarTodas() {
        Iterable<Subarea> subareas = subareaService.buscartodasSubarea();
        return ResponseEntity.ok(subareas);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Subarea> buscarId(@PathVariable Long id) throws SubareaNaoEncontradoException {
        Subarea subarea = subareaService.buscarAreaId(id);
        return ResponseEntity.ok(subarea);
    }
    @PostMapping
    public ResponseEntity<Subarea> salvarSubarea(@RequestBody Subarea subarea) {
        Subarea subareaNova = subareaService.salvarNovaSubarea(subarea);
        return ResponseEntity.ok(subareaNova);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> atualizarSubarea(@PathVariable Long id, @RequestBody Subarea subarea) {
       try {
           subarea.setSubarea_id(id);
           Subarea subareaAtualizada = subareaService.atualizarSubarea(subarea);
           return ResponseEntity.ok(subareaAtualizada);
       } catch (SubareaNaoEncontradoException e) {
           return ResponseEntity.notFound().build();
       }
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Subarea> apagarSubarea(@PathVariable Long id) throws SubareaNaoEncontradoException {
        subareaService.apagarSubarea(id);
        return ResponseEntity.noContent().build();
    }
}
