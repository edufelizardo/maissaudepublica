package com.edufelizardo.maissaudepublica.controller;

import com.edufelizardo.maissaudepublica.dto.FuncionarioDTO;
import com.edufelizardo.maissaudepublica.model.Funcionario;
import com.edufelizardo.maissaudepublica.model.exception.FuncionarioNaoEncontradoException;
import com.edufelizardo.maissaudepublica.model.exception.FuncionarioNotFoundException;
import com.edufelizardo.maissaudepublica.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;
    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> buscarPorId(@PathVariable Long id) throws FuncionarioNaoEncontradoException {
        FuncionarioDTO funcionarioDTO = funcionarioService.buscarPorId(id);
        return ResponseEntity.ok(funcionarioDTO);
    }
    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> buscarTodos() {
        List<FuncionarioDTO> funcionariosDTO = funcionarioService.buscarTodos();
        return ResponseEntity.ok(funcionariosDTO);
    }
    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody FuncionarioDTO funcionarioDTO) {
        Funcionario funcionario = funcionarioService.salvar(funcionarioDTO);
        return ResponseEntity.ok(funcionario);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioDTO funcionarioDTO) {
        try {
            funcionarioDTO.setId(id);
            Funcionario funcionarioAtualizado = funcionarioService.atualizarFuncionario(funcionarioDTO);
            return ResponseEntity.ok(funcionarioAtualizado);
        } catch (FuncionarioNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
