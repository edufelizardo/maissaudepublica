package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.dto.*;
import com.edufelizardo.maissaudepublica.model.enuns.StatusExame;
import com.edufelizardo.maissaudepublica.model.enuns.StatusTratamento;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DataJpaTest
@DisplayName("Consulta")
class ConsultaRepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private ConsultaRepository consultaRepository;

}