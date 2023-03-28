package com.edufelizardo.maissaudepublica.service;

import com.edufelizardo.maissaudepublica.repositories.FuncionarioRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FuncionarioServiceTest {
    @InjectMocks
    private FuncionarioService funcionarioService;
    @Mock
    private FuncionarioRepository funcionarioRepository;

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