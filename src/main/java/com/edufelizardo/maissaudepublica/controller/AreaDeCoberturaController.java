package com.edufelizardo.maissaudepublica.controller;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.exception.areaDeCoberturaNaoEncontradoException;
import com.edufelizardo.maissaudepublica.service.AreaDeCoberturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("areas")
public class AreaDeCoberturaController {
    @Autowired
    private AreaDeCoberturaService areaDeCoberturaService;

    public AreaDeCoberturaController(AreaDeCoberturaService areaDeCoberturaService) {
        this.areaDeCoberturaService = areaDeCoberturaService;
    }

    @GetMapping
    public ResponseEntity<Iterable<AreaDeCobertura>> buscarTodas() {
        Iterable<AreaDeCobertura> coberturas = areaDeCoberturaService.buscarTodasasareas();
        return ResponseEntity.ok(coberturas);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<AreaDeCobertura> BuscarId(@PathVariable Long id) throws areaDeCoberturaNaoEncontradoException {
        AreaDeCobertura cobertura = areaDeCoberturaService.buscarId(id);
        return ResponseEntity.ok(cobertura);
    }
    @PostMapping
    public ResponseEntity<AreaDeCobertura> criarArea(@RequestBody AreaDeCobertura areaDeCobertura) {
        AreaDeCobertura cobertura = areaDeCoberturaService.salvarArea(areaDeCobertura);
        return ResponseEntity.ok(cobertura);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<AreaDeCobertura> atualizarArea(@PathVariable Long id, @RequestBody AreaDeCobertura deCobertura) {
        try {
            deCobertura.setArea_id(id);
            AreaDeCobertura areaDeCobertura = areaDeCoberturaService.atualizarArea(deCobertura);
            return ResponseEntity.ok(areaDeCobertura);
        } catch (areaDeCoberturaNaoEncontradoException e) {
            throw new RuntimeException(e);
        }
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<AreaDeCobertura> apagarArea(@PathVariable Long id) throws areaDeCoberturaNaoEncontradoException {
        areaDeCoberturaService.apagarAreaCobertura(id);
        return ResponseEntity.noContent().build();
    }
}
