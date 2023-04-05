package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.*;
import com.edufelizardo.maissaudepublica.repositories.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPacienteUtil {
    public static Paciente criarPacienteUm(AreaDeCoberturaRepository areaDeCoberturaRepository, SubareaRepository subareaRepository,
                                           FamiliaRepository familiaRepository, EquipeRepository equipeRepository,
                                           EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                           PacienteRepository pacienteRepository, ProntuarioRepository prontuarioRepository,
                                           HistoricoMedicoRepository historicoMedicoRepository){
        Subarea subarea;
        List<Subarea> subareas = new ArrayList<>();
        subarea = new Subarea(null, 1);
        subareas.add(subarea);
//        subarea = new Subarea(null, 2);
//        subareas.add(subarea);
//        subarea = new Subarea(null, 3);
//        subareas.add(subarea);
//        subarea = new Subarea(null, 4);
//        subareas.add(subarea);
//        subarea = new Subarea(null, 5);
//        subareas.add(subarea);
//        subarea = new Subarea(null, 6);
//        subareas.add(subarea);

        AreaDeCobertura areaDeCobertura1 = new AreaDeCobertura(null, 1, subareas);
        subareaRepository.saveAll(subareas);
        areaDeCoberturaRepository.save(areaDeCobertura1);

        Equipe equipe1 = new Equipe();
        equipe1.setNomeDaEquipe("Branca");
        equipe1.setRegiao(areaDeCobertura1);
        equipeRepository.save(equipe1);

        Familia familia1 = new Familia(null, true, 1, true, areaDeCobertura1, equipe1);
        familiaRepository.save(familia1);

        Endereco endereco1 = new Endereco(null, "05133-000", "Rua Arroio do Meio", 415, null, "Pirituba",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", familia1, areaDeCobertura1);
        enderecoRepository.save(endereco1);

        Pessoa pessoa1 = new Pessoa(null, "Cecília Santos", LocalDate.of(1985, 02, 17), "654.321.987-00", "cecilia.santos@test.com", endereco1);
        Set<String> telefones1 = new HashSet<>();
        telefones1.add("011 96061-7070");
        telefones1.add("011 96061-7071");
        pessoa1.setTelefones(telefones1);
        pessoaRepository.save(pessoa1);

        Paciente paciente1 = new Paciente();
        paciente1.setCartaoDoSUS("705 0454 6634 8144");
        paciente1.setPessoa(pessoa1);
        paciente1.setPosicaoMembro(1);
        pacienteRepository.save(paciente1);

        String prontuarioFake = "UBS.PQ.São.Domingos-001.001.001-01";

        Prontuario prontuario1 = new Prontuario();
        prontuario1.setPaciente(paciente1);
        prontuario1.setNumeroProntuario(prontuarioFake);
        prontuarioRepository.save(prontuario1);

        HistoricoMedico historicoMedico1 = new HistoricoMedico();
        historicoMedico1.setProntuario(prontuario1);
        historicoMedicoRepository.save(historicoMedico1);

        return paciente1;
    }
}
