package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.*;
import com.edufelizardo.maissaudepublica.repositories.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class TestFuncionarioUtils {
    public static Funcionario registraFuncionarioMedicoUm(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                          EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                          DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository,
                                                          ProgramaDeSaudeRepository programaDeSaudeRepository) {

        Endereco endereco1 = new Endereco(null, "01001-000", "Praça da Sé", 1, null, "Sé",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco1);

        Pessoa pessoa1 = new Pessoa(null, "João Silva", LocalDate.of(1995, 05, 20), "123.456.789-00", "joao.silva@test.com", endereco1);
        Set<String> telefones1 = new HashSet<>();
        telefones1.add("011 96060-7070");
        telefones1.add("011 96060-7071");
        pessoa1.setTelefones(telefones1);
        pessoaRepository.save(pessoa1);

        EscalaTrabalho escalaTrabalho1 = new EscalaTrabalho(null, LocalTime.of(7, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(16, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho1);

        Formacao formacao1 = new Formacao(null, "Medicina");
        formacaoRepository.save(formacao1);

        Departamento departamento2 = new Departamento(null, "Atendimento Médico");
        departamentoRepository.save(departamento2);

        Funcao funcao1 = new Funcao(null, "Médico(a)");
        funcaoRepository.save(funcao1);

        Funcionario funcionario1 = new Funcionario(null, LocalDate.of(2018, 05,12), null, "CRM 12345", BigDecimal.valueOf(12000.00), pessoa1,
                escalaTrabalho1, formacao1, departamento2, funcao1);
        Set<ProgramaDeSaude> programaDeSaudes = new HashSet<>();
        ProgramaDeSaude saudeDaFamilia = new ProgramaDeSaude(null, "Saúde da Família");
        programaDeSaudes.add(saudeDaFamilia);
        programaDeSaudeRepository.save(saudeDaFamilia);
        funcionario1.setProgramaDeSaudes(programaDeSaudes);

        return funcionario1;
    }
    public static Funcionario registraFuncionarioEnfermeiroUm(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                          EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                          DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository,
                                                              ProgramaDeSaudeRepository programaDeSaudeRepository) {

        Endereco endereco2 = new Endereco(null, "01002-000", "Praça Clóvis Beviláqua'", 1, null, "Sé",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco2);

        Pessoa pessoa2 = new Pessoa(null, "Maria Santos", LocalDate.of(1990, 02, 15), "987.654.321-00", "maria.santos@test.com", endereco2);
        Set<String> telefones2 = new HashSet<>();
        telefones2.add("011 96060-7072");
        telefones2.add("011 96060-7073");
        pessoa2.setTelefones((Set<String>) telefones2);
        pessoaRepository.save(pessoa2);

        EscalaTrabalho escalaTrabalho1 = new EscalaTrabalho(null, LocalTime.of(7, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(16, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho1);

        Formacao formacao3 = new Formacao(null, "Técnico de Enfermagem");
        formacaoRepository.save(formacao3);

        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);

        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);

        Funcionario funcionario2 = new Funcionario(null, LocalDate.of(2019, 02, 20), null, "COREN 54321", BigDecimal.valueOf(8000.00), pessoa2,
                escalaTrabalho1, formacao3,  departamento3, funcao2);
        Set<ProgramaDeSaude> programaDeSaudes = new HashSet<>();
        ProgramaDeSaude saudeHomem = new ProgramaDeSaude(null, "Saúde do Homem");
        programaDeSaudes.add(saudeHomem);
        programaDeSaudeRepository.save(saudeHomem);
        ProgramaDeSaude saudeMulher = new ProgramaDeSaude(null, "Saúde da Mulher");
        programaDeSaudes.add(saudeMulher);
        programaDeSaudeRepository.save(saudeMulher);
        funcionario2.setProgramaDeSaudes(programaDeSaudes);
        return funcionario2;
    }
    public static Funcionario registraFuncionarioEnfermeiroDois(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco3 = new Endereco(null, "01003-000", "Viaduto Santa Ifigênia", 1, null, "Santa Ifigênia",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco3);

        Pessoa pessoa3 = new Pessoa(null, "Pedro Almeida", LocalDate.of(1978, 12, 10), "456.789.123-00", "pedro.almeida@test.com", endereco3);
        Set<String> telefones3 = new HashSet<>();
        telefones3.add("011 96060-7074");
        telefones3.add("011 96060-7075");
        pessoa3.setTelefones(telefones3);
        pessoaRepository.save(pessoa3);

        EscalaTrabalho escalaTrabalho2 = new EscalaTrabalho(null, LocalTime.of(8, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(17, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho2);

        Formacao formacao2 = new Formacao(null, "Enfermagem");
        formacaoRepository.save(formacao2);

        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);

        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);

        Funcionario funcionario3 = new Funcionario(null, LocalDate.of(2020, 01, 10), null, "COREN 98765", BigDecimal.valueOf(5000.00), pessoa3,
                escalaTrabalho2, formacao2, departamento3, funcao2);
        return funcionario3;
    }
    public static Funcionario registraFuncionarioDentistaUm(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco4 = new Endereco(null, "01004-000", "Rua Florêncio de Abreu", 1, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco4);

        Pessoa pessoa4 = new Pessoa(null, "Carla Souza", LocalDate.of(1987, 06, 30), "789.123.456-00", "carla.souza@test.com", endereco4);
        Set<String> telefones4 = new HashSet<>();
        telefones4.add("011 96060-7076");
        telefones4.add("011 96060-7077");
        pessoa4.setTelefones(telefones4);
        pessoaRepository.save(pessoa4);

        EscalaTrabalho escalaTrabalho1 = new EscalaTrabalho(null, LocalTime.of(7, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(16, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho1);

        Formacao formacao5 = new Formacao(null, "Odontologia");
        formacaoRepository.save(formacao5);

        Departamento departamento16 = new Departamento(null, "Odontologia");
        departamentoRepository.save(departamento16);

        Funcao funcao16 = new Funcao(null, "Dentista");
        funcaoRepository.save(funcao16);

        Funcionario funcionario4 = new Funcionario(null, LocalDate.of(2021, 8, 05), null, "CRO 123456", BigDecimal.valueOf(15000.00), pessoa4,
                escalaTrabalho1, formacao5, departamento16, funcao16);
        return funcionario4;
    }
    public static Funcionario registraFuncionarioPsicologoUm(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco5 = new Endereco(null, "01005-000", "Viaduto do Chá", 15, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco5);

        Pessoa pessoa5 = new Pessoa(null, "Lucas Mendes", LocalDate.of(1995, 03, 25), "654.321.987-00", "lucas.mendes@test.com", endereco5);
        Set<String> telefones5 = new HashSet<>();
        telefones5.add("011 96060-7078");
        telefones5.add("011 96060-7079");
        pessoa5.setTelefones(telefones5);
        pessoaRepository.save(pessoa5);

        EscalaTrabalho escalaTrabalho2 = new EscalaTrabalho(null, LocalTime.of(8, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(17, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho2);

        Formacao formacao8 = new Formacao(null, "Psicologia");
        formacaoRepository.save(formacao8);

        Departamento departamento8 = new Departamento(null, "Psicologia");
        departamentoRepository.save(departamento8);

        Funcao funcao5 = new Funcao(null, "Psicólogo(a)");
        funcaoRepository.save(funcao5);

        Funcionario funcionario5 = new Funcionario(null, LocalDate.of(2017, 11, 29), null, "CRP 654321", BigDecimal.valueOf(9000.00), pessoa5,
                escalaTrabalho2, formacao8, departamento8, funcao5);
        return funcionario5;
    }
    public static Funcionario registraFuncionarioEnfermeiroTres(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco6 = new Endereco(null, "01006-000", "Rua Boa Vista", 1, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco6);

        Pessoa pessoa6 = new Pessoa(null, "Juliana Oliveira", LocalDate.of(1980, 8, 12), "321.789.456-00", "juliana.oliveira@test.com", endereco6);
        Set<String> telefones6 = new HashSet<>();
        telefones6.add("011 96060-7080");
        telefones6.add("011 96060-7081");
        pessoa6.setTelefones(telefones6);
        pessoaRepository.save(pessoa6);

        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);

        Formacao formacao2 = new Formacao(null, "Enfermagem");
        formacaoRepository.save(formacao2);

        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);

        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);

        Funcionario funcionario6 = new Funcionario(null, LocalDate.of(2018, 12, 01), null, "COREN 98765", BigDecimal.valueOf(5000.00), pessoa6,
                escalaTrabalho3, formacao2, departamento3, funcao2);
        return funcionario6;
    }
    public static Funcionario registraFuncionarioDentisitaDois(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco7 = new Endereco(null, "01007-000", "Praça da República", 1, null, "República",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco7);

        Pessoa pessoa7 = new Pessoa(null, "Marcelo Santos", LocalDate.of(1983, 11, 05), "987.654.321-00", "marcelo.santos@test.com", endereco7);
        Set<String> telefones7 = new HashSet<>();
        telefones7.add("011 96060-7082");
        telefones7.add("011 96060-7083");
        pessoa7.setTelefones(telefones7);
        pessoaRepository.save(pessoa7);

        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);

        Formacao formacao5 = new Formacao(null, "Odontologia");
        formacaoRepository.save(formacao5);

        Departamento departamento16 = new Departamento(null, "Odontologia");
        departamentoRepository.save(departamento16);

        Funcao funcao16 = new Funcao(null, "Dentista");
        funcaoRepository.save(funcao16);

        Funcionario funcionario7 = new Funcionario(null, LocalDate.of(2019, 06, 30), null, "CRO 123456", BigDecimal.valueOf(15000.00), pessoa7,
                escalaTrabalho3, formacao5, departamento16, funcao16);
        return funcionario7;
    }
    public static Funcionario registraFuncionarioPsicologoDois(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco8 = new Endereco(null, "01008-000", "Avenida Ipiranga", 165, null, "República",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco8);

        Pessoa pessoa8 = new Pessoa(null, "Camila Silva", LocalDate.of(1992, 9, 22), "456.789.123-00", "String email", endereco8);
        Set<String> telefones8 = new HashSet<>();
        telefones8.add("011 96060-7084");
        telefones8.add("011 96060-7085");
        pessoa8.setTelefones(telefones8);
        pessoaRepository.save(pessoa8);

        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);

        Formacao formacao8 = new Formacao(null, "Psicologia");
        formacaoRepository.save(formacao8);

        Departamento departamento8 = new Departamento(null, "Psicologia");
        departamentoRepository.save(departamento8);

        Funcao funcao5 = new Funcao(null, "Psicólogo(a)");
        funcaoRepository.save(funcao5);

        Funcionario funcionario8 = new Funcionario(null, LocalDate.of(2020, 07, 15), null, "CRP 654321", BigDecimal.valueOf(9000.00), pessoa8,
                escalaTrabalho3, formacao8, departamento8, funcao5);
        return funcionario8;
    }
    public static Funcionario registraFuncionarioEnfermeiroQuatro(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco9 = new Endereco(null, "01009-000", "Rua da Consolação", 358, null, "Consolação",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco9);

        Pessoa pessoa9 = new Pessoa(null, "Fernando Alves", LocalDate.of(1975, 04, 18), "789.123.456-00", "String email", endereco9);
        Set<String> telefones9 = new HashSet<>();
        telefones9.add("011 96060-7086");
        telefones9.add("011 96060-7087");
        pessoa9.setTelefones(telefones9);
        pessoaRepository.save(pessoa9);

        EscalaTrabalho escalaTrabalho2 = new EscalaTrabalho(null, LocalTime.of(8, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(17, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho2);

        Formacao formacao2 = new Formacao(null, "Enfermagem");
        formacaoRepository.save(formacao2);

        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);

        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);

        Funcionario funcionario9 = new Funcionario(null, LocalDate.of(2017, 9, 22), null, "COREN 54321", BigDecimal.valueOf(8000.00), pessoa9,
                escalaTrabalho2, formacao2, departamento3, funcao2);
        return funcionario9;
    }
    public static Funcionario registraFuncionarioMedicoDois(EnderecoRepository enderecoRepository, PessoaRepository pessoaRepository,
                                                              EscalaDeTrabalhoRepository escalaDeTrabalhoRepository, FormacaoRepository formacaoRepository,
                                                              DepartamentoRepository departamentoRepository, FuncaoRepository funcaoRepository) {
        Endereco endereco10 = new Endereco(null, "01010-000", "Rua Xavier de Toledo", 1, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco10);

        Pessoa pessoa10 = new Pessoa(null, "Mariana Costa", LocalDate.of(1988, 07, 01), "654.321.987-00", "String email", endereco10);
        Set<String> telefones10 = new HashSet<>();
        telefones10.add("011 96060-7088");
        telefones10.add("011 96060-7089");
        pessoa10.setTelefones(telefones10);
        pessoaRepository.save(pessoa10);

        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);

        Formacao formacao1 = new Formacao(null, "Medicina");
        formacaoRepository.save(formacao1);

        Departamento departamento2 = new Departamento(null, "Atendimento Médico");
        departamentoRepository.save(departamento2);

        Funcao funcao1 = new Funcao(null, "Médico(a)");
        funcaoRepository.save(funcao1);

        Funcionario funcionario10 = new Funcionario(null, LocalDate.of(2018, 11, 10), null, "CRM 12345", BigDecimal.valueOf(12000.00), pessoa10,
                escalaTrabalho3, formacao1, departamento2, funcao1);
        return funcionario10;
    }
}
