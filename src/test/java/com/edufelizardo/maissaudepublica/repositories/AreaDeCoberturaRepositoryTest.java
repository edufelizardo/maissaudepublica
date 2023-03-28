package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.Subarea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.ArrayList;
import java.util.List;

@DataJpaTest
@DisplayName("Área de Cobertura de Atendimento das Equipes")
class AreaDeCoberturaRepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private AreaDeCoberturaRepository areaDeCoberturaRepository;
    @Autowired
    private SubareaRepository subareaRepository;
    @Test
    @DisplayName("Salvar Área e Subarea com Sucesso.")
    void teste(){

        // inicialização dos dados
        for (int x = 1; x < 7; x++) {
            AreaDeCobertura area = new AreaDeCobertura();
            area.setArea(x);
            List<Subarea> sub = new ArrayList<>();
            for (int y = 1; y < 7; y++) {
                Subarea subarea = new Subarea();
                subarea.setSubarea(y);
                sub.add(subarea);
                testEntityManager.persist(subarea);
            }
            area.setSubareas(sub);
            testEntityManager.persist(area);
        }

        // verificação dos dados salvos
        Iterable<AreaDeCobertura> areaSalvas = areaDeCoberturaRepository.findAll();
        Assertions.assertEquals(6, areaSalvas.spliterator().estimateSize());
        for (AreaDeCobertura area:areaSalvas) {
            Assertions.assertNotNull(area.getArea_id());
            Assertions.assertEquals(6, area.getSubareas().size());
            for (Subarea subarea : area.getSubareas()) {
                Assertions.assertNotNull(subarea.getSubarea_id());
            }
        }
//        System.out.println(areaDeCoberturaRepository.findAll());
    }
}