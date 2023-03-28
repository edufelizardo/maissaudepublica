package com.edufelizardo.maissaudepublica.controller;

import com.edufelizardo.maissaudepublica.service.FuncionarioService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FuncionarioControllerTest {
    @InjectMocks
    private FuncionarioController funcionarioController;
    @Mock
    private FuncionarioService funcionarioService;

    @Test
    void buscarPorId() {
    }

    @Test
    void buscarTodos() {
    }

    @Test
    void salvar() {
    }

    @Test
    void atualizarFuncionario() {
    }
}