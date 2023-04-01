package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@Sql(scripts = "/funcionarios.sql")
@DisplayName("Funcionarios")
class FuncionarioRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private FuncionarioRepository repository;
    @Test
//    @DisplayName("Consultar Funcionario por Nome")
    void testeZero() {
        Long n = 1L;
        Optional<Funcionario> funcionario = repository.findById(n);
        Assertions.assertNotNull(funcionario);
        System.out.println(repository.findById(n));
    }
//    @Test
////    @DisplayName("Consultar Funcionario por Função")
//    void testeOne() {
//
//    }
//    @Test
////    @DisplayName("Consultar")
//    void testeTwo() {

//    }
}