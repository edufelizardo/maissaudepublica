package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.Subarea;
import com.edufelizardo.maissaudepublica.repositories.AreaDeCoberturaRepository;
import com.edufelizardo.maissaudepublica.repositories.SubareaRepository;

import java.util.ArrayList;
import java.util.List;

public class TestAreaUtil {
    public static AreaDeCobertura criarAreaDeCoberturaUm(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura1 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura1);

        return areaDeCobertura1;
    }
    public static AreaDeCobertura criarAreaDeCoberturaDois(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura2 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura2);

        return areaDeCobertura2;
    }
    public static AreaDeCobertura criarAreaDeCoberturaTres(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura3 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura3);

        return areaDeCobertura3;
    }
    public static AreaDeCobertura criarAreaDeCoberturaQuatro(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura4 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura4);

        return areaDeCobertura4;
    }
    public static AreaDeCobertura criarAreaDeCoberturaCinco(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura5 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura5);

        return areaDeCobertura5;
    }
    public static AreaDeCobertura criarAreaDeCoberturaSeis(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura6 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura6);

        return areaDeCobertura6;
    }
    public static void criarTodasAsAreas(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository) {

        Subarea subarea;

        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
        subarea = new Subarea(null, 2);
        subareas.add(subarea);
        subarea = new Subarea(null, 3);
        subareas.add(subarea);
        subarea = new Subarea(null, 4);
        subareas.add(subarea);
        subarea = new Subarea(null, 5);
        subareas.add(subarea);
        subarea = new Subarea(null, 6);
        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura1 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura1);

        AreaDeCobertura areaDeCobertura2 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura2);

        AreaDeCobertura areaDeCobertura3 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura3);

        AreaDeCobertura areaDeCobertura4 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura4);

        AreaDeCobertura areaDeCobertura5 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura5);

        AreaDeCobertura areaDeCobertura6 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura6);
    }
}
