package com.edufelizardo.maissaudepublica.service;

import com.edufelizardo.maissaudepublica.model.*;
import com.edufelizardo.maissaudepublica.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public class DBService {
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EscalaDeTrabalhoRepository escalaDeTrabalhoRepository;
    @Autowired
    private FormacaoRepository formacaoRepository;
    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Autowired
    private FuncaoRepository funcaoRepository;
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public void database() {
        /**
         *
         */
        Endereco endereco1 = new Endereco(null, "01001-000", "Praça da Sé", 1, null, "Sé",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco1);

        Endereco endereco2 = new Endereco(null, "01002-000", "Praça Clóvis Beviláqua'", 1, null, "Sé",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco2);

        Endereco endereco3 = new Endereco(null, "01003-000", "Viaduto Santa Ifigênia", 1, null, "Santa Ifigênia",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco3);

        Endereco endereco4 = new Endereco(null, "01004-000", "Rua Florêncio de Abreu", 1, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco4);

        Endereco endereco5 = new Endereco(null, "01005-000", "Viaduto do Chá", 15, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco5);

        Endereco endereco6 = new Endereco(null, "01006-000", "Rua Boa Vista", 1, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco6);

        Endereco endereco7 = new Endereco(null, "01007-000", "Praça da República", 1, null, "República",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco7);

        Endereco endereco8 = new Endereco(null, "01008-000", "Avenida Ipiranga", 165, null, "República",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco8);

        Endereco endereco9 = new Endereco(null, "01009-000", "Rua da Consolação", 358, null, "Consolação",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco9);

        Endereco endereco10 = new Endereco(null, "01010-000", "Rua Xavier de Toledo", 1, null, "Centro",
                "São Paulo", "SP", "3550308", "1004", "11", "7107", null, null);
        enderecoRepository.save(endereco10);

        /**
         *
         */
        Pessoa pessoa1 = new Pessoa(null, "João Silva", LocalDate.of(1995, 05, 20), "123.456.789-00", "joao.silva@test.com", endereco1);
        Pessoa pessoa2 = new Pessoa(null, "Maria Santos", LocalDate.of(1990, 02, 15), "987.654.321-00", "maria.santos@test.com", endereco2);
        Pessoa pessoa3 = new Pessoa(null, "Pedro Almeida", LocalDate.of(1978, 12, 10), "456.789.123-00", "pedro.almeida@test.com", endereco3);
        Pessoa pessoa4 = new Pessoa(null, "Carla Souza", LocalDate.of(1987, 06, 30), "789.123.456-00", "carla.souza@test.com", endereco4);
        Pessoa pessoa5 = new Pessoa(null, "Lucas Mendes", LocalDate.of(1995, 03, 25), "654.321.987-00", "lucas.mendes@test.com", endereco5);
        Pessoa pessoa6 = new Pessoa(null, "Juliana Oliveira", LocalDate.of(1980, 8, 12), "321.789.456-00", "juliana.oliveira@test.com", endereco6);
        Pessoa pessoa7 = new Pessoa(null, "Marcelo Santos", LocalDate.of(1983, 11, 05), "987.654.321-00", "marcelo.santos@test.com", endereco7);
        Pessoa pessoa8 = new Pessoa(null, "Camila Silva", LocalDate.of(1992, 9, 22), "456.789.123-00", "String email", endereco8);
        Pessoa pessoa9 = new Pessoa(null, "Fernando Alves", LocalDate.of(1975, 04, 18), "789.123.456-00", "String email", endereco9);
        Pessoa pessoa10 = new Pessoa(null, "Mariana Costa", LocalDate.of(1988, 07, 01), "654.321.987-00", "String email", endereco10);

        List<String> telefones1 = null;
        telefones1.add(1,"011 96060-7070");
        telefones1.add(1,"011 96060-7071");
        pessoa1.setTelefones((Set<String>) telefones1);
        pessoaRepository.save(pessoa1);

        List<String> telefones2 = null;
        telefones2.add(2,"011 96060-7072");
        telefones2.add(2,"011 96060-7073");
        pessoa1.setTelefones((Set<String>) telefones2);
        pessoaRepository.save(pessoa2);

        List<String> telefones3 = null;
        telefones3.add(3,"011 96060-7074");
        telefones3.add(3,"011 96060-7075");
        pessoa1.setTelefones((Set<String>) telefones3);
        pessoaRepository.save(pessoa3);

        List<String> telefones4 = null;
        telefones4.add(4,"011 96060-7076");
        telefones4.add(4,"011 96060-7077");
        pessoa1.setTelefones((Set<String>) telefones4);
        pessoaRepository.save(pessoa4);

        List<String> telefones5 = null;
        telefones5.add(5,"011 96060-7078");
        telefones5.add(5,"011 96060-7079");
        pessoa1.setTelefones((Set<String>) telefones5);
        pessoaRepository.save(pessoa5);

        List<String> telefones6 = null;
        telefones6.add(6,"011 96060-7080");
        telefones6.add(6,"011 96060-7081");
        pessoa1.setTelefones((Set<String>) telefones6);
        pessoaRepository.save(pessoa6);

        List<String> telefones7 = null;
        telefones7.add(7,"011 96060-7082");
        telefones7.add(7,"011 96060-7083");
        pessoa1.setTelefones((Set<String>) telefones7);
        pessoaRepository.save(pessoa7);

        List<String> telefones8 = null;
        telefones8.add(8,"011 96060-7084");
        telefones8.add(8,"011 96060-7085");
        pessoa1.setTelefones((Set<String>) telefones8);
        pessoaRepository.save(pessoa8);

        List<String> telefones9 = null;
        telefones9.add(9,"011 96060-7086");
        telefones9.add(9,"011 96060-7087");
        pessoa1.setTelefones((Set<String>) telefones9);
        pessoaRepository.save(pessoa9);

        List<String> telefones10 = null;
        telefones10.add(10,"011 96060-7088");
        telefones10.add(10,"011 96060-7089");
        pessoa1.setTelefones((Set<String>) telefones10);
        pessoaRepository.save(pessoa10);

        /**
         *
         */
        EscalaTrabalho escalaTrabalho1 = new EscalaTrabalho(null, LocalTime.of(7, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(16, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho1);

        EscalaTrabalho escalaTrabalho2 = new EscalaTrabalho(null, LocalTime.of(8, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(17, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho2);

        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);

        Formacao formacao1 = new Formacao(null, "Medicina");
        formacaoRepository.save(formacao1);

        Formacao formacao2 = new Formacao(null, "Enfermagem");
        formacaoRepository.save(formacao2);

        Formacao formacao3 = new Formacao(null, "Técnico de Enfermagem");
        formacaoRepository.save(formacao3);

        Formacao formacao4 = new Formacao(null, "Fisioterapia");
        formacaoRepository.save(formacao4);

        Formacao formacao5 = new Formacao(null, "Odontologia");
        formacaoRepository.save(formacao5);

        Formacao formacao6 = new Formacao(null, "Farmácia");
        formacaoRepository.save(formacao6);

        Formacao formacao7 = new Formacao(null, "Nutrição");
        formacaoRepository.save(formacao7);

        Formacao formacao8 = new Formacao(null, "Psicologia");
        formacaoRepository.save(formacao8);

        Formacao formacao9 = new Formacao(null, "Terapia Ocupacional");
        formacaoRepository.save(formacao9);

        Formacao formacao10 = new Formacao(null, "Fonoaudiologia");
        formacaoRepository.save(formacao10);

        Formacao formacao11 = new Formacao(null, "Assistência Social");
        formacaoRepository.save(formacao11);

        Formacao formacao12 = new Formacao(null, "Educação Física");
        formacaoRepository.save(formacao12);

        Formacao formacao13 = new Formacao(null, "Fisioterapia");
        formacaoRepository.save(formacao13);

        Formacao formacao14 = new Formacao(null, "Terapia Holística");
        formacaoRepository.save(formacao14);

        Formacao formacao15 = new Formacao(null, "Acupuntura");
        formacaoRepository.save(formacao15);

        Formacao formacao16 = new Formacao(null, "Quiropraxia");
        formacaoRepository.save(formacao16);

        Formacao formacao17 = new Formacao(null, "Naturologia");
        formacaoRepository.save(formacao17);

        Formacao formacao18 = new Formacao(null, "Radiologia");
        formacaoRepository.save(formacao18);

        Formacao formacao19 = new Formacao(null, "Enfermagem do Trabalho");
        formacaoRepository.save(formacao19);

        Formacao formacao20 = new Formacao(null, "Psiquiatria");
        formacaoRepository.save(formacao20);

        /**
         *
         */
        Departamento departamento1 = new Departamento(null, "Administração");
        departamentoRepository.save(departamento1);

        Departamento departamento2 = new Departamento(null, "Atendimento Médico");
        departamentoRepository.save(departamento2);

        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);

        Departamento departamento4 = new Departamento(null, "Farmácia");
        departamentoRepository.save(departamento4);

        Departamento departamento5 = new Departamento(null, "Almoxarifado");
        departamentoRepository.save(departamento5);

        Departamento departamento6 = new Departamento(null, "Limpeza e Manutenção");
        departamentoRepository.save(departamento6);

        Departamento departamento7 = new Departamento(null, "Serviço Social");
        departamentoRepository.save(departamento7);

        Departamento departamento8 = new Departamento(null, "Psicologia");
        departamentoRepository.save(departamento8);

        Departamento departamento9 = new Departamento(null, "Nutrição");
        departamentoRepository.save(departamento9);

        Departamento departamento10 = new Departamento(null, "Fisioterapia");
        departamentoRepository.save(departamento10);

        Departamento departamento11 = new Departamento(null, "Terapia Ocupacional");
        departamentoRepository.save(departamento11);

        Departamento departamento12 = new Departamento(null, "Fonoaudiologia");
        departamentoRepository.save(departamento12);

        Departamento departamento13 = new Departamento(null, "Recepção");
        departamentoRepository.save(departamento13);

        Departamento departamento14 = new Departamento(null, "Coleta de Exames");
        departamentoRepository.save(departamento14);

        Departamento departamento15 = new Departamento(null, "Triagem");
        departamentoRepository.save(departamento15);

        Departamento departamento16 = new Departamento(null, "Odontologia");
        departamentoRepository.save(departamento16);

        Departamento departamento17 = new Departamento(null, "Imunização");
        departamentoRepository.save(departamento17);

        Departamento departamento18 = new Departamento(null, "Educação em Saúde");
        departamentoRepository.save(departamento18);

        Departamento departamento19 = new Departamento(null, "Atendimento a Gestantes");
        departamentoRepository.save(departamento19);

        Departamento departamento20 = new Departamento(null, "Programa Saúde da Família");
        departamentoRepository.save(departamento20);

        /**
         *
         */
        Funcao funcao1 = new Funcao(null, "Médico(a)");
        funcaoRepository.save(funcao1);

        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);

        Funcao funcao3 = new Funcao(null, "Técnico(a) de Enfermagem");
        funcaoRepository.save(funcao3);

        Funcao funcao4 = new Funcao(null, "Assistente Social");
        funcaoRepository.save(funcao4);

        Funcao funcao5 = new Funcao(null, "Psicólogo(a)");
        funcaoRepository.save(funcao5);

        Funcao funcao6 = new Funcao(null, "Nutricionista");
        funcaoRepository.save(funcao6);

        Funcao funcao7 = new Funcao(null, "Fisioterapeuta");
        funcaoRepository.save(funcao7);

        Funcao funcao8 = new Funcao(null, "Terapeuta Ocupacional");
        funcaoRepository.save(funcao8);

        Funcao funcao9 = new Funcao(null, "Fonoaudiólogo(a)");
        funcaoRepository.save(funcao9);

        Funcao funcao10 = new Funcao(null, "Auxiliar Administrativo");
        funcaoRepository.save(funcao10);

        Funcao funcao11 = new Funcao(null, "Assistente Administrativo");
        funcaoRepository.save(funcao11);

        Funcao funcao12 = new Funcao(null, "Recepcionista");
        funcaoRepository.save(funcao12);

        Funcao funcao13 = new Funcao(null, "Motorista");
        funcaoRepository.save(funcao13);

        Funcao funcao14 = new Funcao(null, "Auxiliar de Limpeza");
        funcaoRepository.save(funcao14);

        Funcao funcao15 = new Funcao(null, "Segurança");
        funcaoRepository.save(funcao15);

        Funcao funcao16 = new Funcao(null, "Dentista");
        funcaoRepository.save(funcao16);

        /**
         *
         */
        Funcionario funcionario1 = new Funcionario(null, LocalDate.of(2018, 05,12), null, "CRM 12345", BigDecimal.valueOf(12000.00), pessoa1,
                escalaTrabalho1, formacao1, departamento2, funcao1);
        funcionarioRepository.save(funcionario1);

        Funcionario funcionario2 = new Funcionario(null, LocalDate.of(2019, 02, 20), null, "COREN 54321", BigDecimal.valueOf(8000.00), pessoa2,
                escalaTrabalho1, formacao3,  departamento3, funcao2);
        funcionarioRepository.save(funcionario2);

        Funcionario funcionario3 = new Funcionario(null, LocalDate.of(2020, 01, 10), null, "COREN 98765", BigDecimal.valueOf(5000.00), pessoa3,
                escalaTrabalho2, formacao2, departamento3, funcao2);
        funcionarioRepository.save(funcionario3);

        Funcionario funcionario4 = new Funcionario(null, LocalDate.of(2021, 8, 05), null, "CRO 123456", BigDecimal.valueOf(15000.00), pessoa4,
                escalaTrabalho1, formacao16, departamento16, funcao16);
        funcionarioRepository.save(funcionario4);

        Funcionario funcionario5 = new Funcionario(null, LocalDate.of(2017, 11, 29), null, "CRP 654321", BigDecimal.valueOf(9000.00), pessoa5,
                escalaTrabalho2, formacao5, departamento8, funcao8);
        funcionarioRepository.save(funcionario5);

        Funcionario funcionario6 = new Funcionario(null, LocalDate.of(2018, 12, 01), null, "COREN 98765", BigDecimal.valueOf(5000.00), pessoa6,
                escalaTrabalho3, formacao2, departamento3, funcao2);
        funcionarioRepository.save(funcionario6);

        Funcionario funcionario7 = new Funcionario(null, LocalDate.of(2019, 06, 30), null, "CRO 123456", BigDecimal.valueOf(15000.00), pessoa7,
                escalaTrabalho3, formacao16, departamento16, funcao16);
        funcionarioRepository.save(funcionario7);

        Funcionario funcionario8 = new Funcionario(null, LocalDate.of(2020, 07, 15), null, "CRP 654321", BigDecimal.valueOf(9000.00), pessoa8,
                escalaTrabalho3, formacao5, departamento8, funcao8);
        funcionarioRepository.save(funcionario8);

        Funcionario funcionario9 = new Funcionario(null, LocalDate.of(2017, 9, 22), null, "COREN 54321", BigDecimal.valueOf(8000.00), pessoa9,
                escalaTrabalho2, formacao2, departamento2, funcao2);
        funcionarioRepository.save(funcionario9);

        Funcionario funcionario10 = new Funcionario(null, LocalDate.of(2018, 11, 10), null, "CRM 12345", BigDecimal.valueOf(12000.00), pessoa10,
                escalaTrabalho3, formacao1, departamento1, funcao1);
        funcionarioRepository.save(funcionario10);

    }
}
