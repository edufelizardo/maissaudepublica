package com.edufelizardo.maissaudepublica.repositories;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@DisplayName("Teste Programa de Saúde")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProgramaDeSaudeRepositoryTest {
    @Autowired
    private ProgramaDeSaudeRepository programaDeSaudeRepository;

    ProgramaDeSaudeRepositoryTest(ProgramaDeSaudeRepository programaDeSaudeRepository) {
        this.programaDeSaudeRepository = programaDeSaudeRepository;
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

}