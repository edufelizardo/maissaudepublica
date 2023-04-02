package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Endereco;
import com.edufelizardo.maissaudepublica.model.Funcionario;
import com.edufelizardo.maissaudepublica.model.Pessoa;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@DataJpaTest
@DisplayName("Testando Funcionarios")
class FuncionarioRepositoryTest {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    private Funcionario funcionario;
    private Pessoa pessoa;
    private Endereco endereco;
    @Test
    @DisplayName("Buscar Funcionário Pelo Nome Completo - Funcionário Encontrado")
    void testBuscarFuncionarioPeloNomeEncontrado() throws JsonProcessingException {;
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByPessoaNomeCompleto("João Silva");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("João Silva", funcionario.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Pelo Nome Completo - Funcionário Não Encontrado")
    void testBuscarFuncionarioPeloNomeNaoEncontrado() throws JsonProcessingException {;
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByPessoaNomeCompleto("João");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("João Silva", funcionario.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Por Parte Do Nome - Funcionário Encontrado")
    void testBuscarFuncionarioParteDoNomeEncontrado() throws JsonProcessingException {;
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByPessoaNomeCompletoContainingIgnoreCase("Silva");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("João Silva", funcionario.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Por Parte Do Nome - Funcionário Não Encontrado")
    void testBuscarFuncionarioParteDoNomeNaoEncontrado() throws JsonProcessingException {;
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByPessoaNomeCompletoContainingIgnoreCase("Adalberto");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("João Silva", funcionario.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Pelo CPF - Funcionário Encontrado")
    void testBuscarFuncionarioPeloCpfEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByPessoaCpf("123.456.789-00");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("123.456.789-00", funcionario.getPessoa().getCpf());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Pelo CPF - Funcionário Não Encontrado")
    void testBuscarFuncionarioPeloCpfNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByPessoaCpf("123.456.789-01");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("123.456.789-00", funcionario.getPessoa().getCpf());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Por Parte CPF - Funcionário Encontrado")
    void testBuscarFuncionarioPorParteDoCpfEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByPessoaCpfContaining("123.456");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("123.456.789-00", funcionario.getPessoa().getCpf());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Por Parte CPF - Funcionário Não Encontrado")
    void testBuscarFuncionarioPorParteDoCpfNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByPessoaCpfContaining("723.456");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("123.456.789-00", funcionario.getPessoa().getCpf());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Pela Função - Funcionário Encontrado")
    void testBuscarFuncionarioPelaFuncaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByFuncaoNomeFuncao("Médico(a) Clinico Geral");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("Médico(a) Clinico Geral", funcionario.getFuncao().getNomeFuncao());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Pela Função - Funcionário Não Encontrado")
    void testBuscarFuncionarioPelaFuncaoNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository.findByFuncaoNomeFuncao("Manutenor");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("Médico(a) Clinico Geral", funcionario.getFuncao().getNomeFuncao());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Todos Os Funcionários Pelo Departamento - Funcionários Encontrados")
    void testBuscarFuncionarioPeloDepartamentoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByDepartamentoNomeDoDepartamento("Clinica Médica");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("Clinica Médica", funcionario.getFuncao().getNomeFuncao());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Todos Os Funcionários Pelo Departamento - Funcionários Não Encontrados")
    void testBuscarFuncionarioPeloDepartamentoNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByDepartamentoNomeDoDepartamento("Clinica Médica");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("Clinica Médica", funcionario.getDepartamento().getNomeDoDepartamento());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
//    @Test
//    @DisplayName("Buscar Funcionário Pelo Programa De Saúde - Funcionários Encontrados")
//    void testBuscarFuncionarioPeloProgramaDeSaudeEncontrados() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
//
//        funcionario = criarFuncionario();
//        funcionarioRepository.save(funcionario);
//
//        // Buscar funcionário pelo nome completo
//        List<Funcionario> funcionariosEncontrados = funcionarioRepository
//                .findByProgramaDeSaudeNomeProgramaDesaude("Saúde do Homem");
//
//        if (funcionariosEncontrados.isEmpty()) {
//            System.out.println("Funcionario não encontrado.");
//        }else {
//            Assertions.assertNotNull(funcionario.getId());
//            Assertions.assertEquals("Saúde do Homem", funcionario.getPessoa().getNomeCompleto());
//
//            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
//            System.out.println(json);
//        }
//    }
//    @Test
//    @DisplayName("Buscar Funcionário Pelo Programa De Saúde - Funcionários Não Encontrados")
//    void testBuscarFuncionarioPeloProgramaDeSaudeNaoEncontrados() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
//
//        funcionario = criarFuncionario();
//        funcionarioRepository.save(funcionario);
//
//        // Buscar funcionário pelo nome completo
//        List<Funcionario> funcionariosEncontrados = funcionarioRepository
//                .findByProgramaDeSaudeNomeProgramaDesaude("Saúde do Homem");
//
//        if (funcionariosEncontrados.isEmpty()) {
//            System.out.println("Funcionario não encontrado.");
//        }else {
//            Assertions.assertNotNull(funcionario.getId());
//            Assertions.assertEquals("Saúde do Homem", funcionario.getFuncao().getNomeFuncao());
//
//            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
//            System.out.println(json);
//        }
//    }
    @Test
    @DisplayName("Buscar Funcionário Pela Escala De Trabalho - Funcionários Encontrados")
    void testBuscarFuncionarioPelaEscalaDeTrabalhoEncontrados() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByEscalaTrabalhoNomeDoExpediente("Matutino 1");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("Matutino 1", funcionario.getFuncao().getNomeFuncao());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @DisplayName("Buscar Funcionário Pela Escala De Trabalho - Funcionários Não Encontrados")
    void testBuscarFuncionarioPelaEscalaDeTrabalhoNaoEncontrados() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        funcionario = criarFuncionario();
        funcionarioRepository.save(funcionario);

        // Buscar funcionário pelo nome completo
        List<Funcionario> funcionariosEncontrados = funcionarioRepository
                .findByEscalaTrabalhoNomeDoExpediente("Matutino 3");

        if (funcionariosEncontrados.isEmpty()) {
            System.out.println("Funcionario não encontrado.");
        }else {
            Assertions.assertNotNull(funcionario.getId());
            Assertions.assertEquals("Matutino 3", funcionario.getFuncao().getNomeFuncao());

            String json = objectMapper.writeValueAsString(funcionariosEncontrados);
            System.out.println(json);
        }
    }
    private Endereco criarEndereco() {
        endereco = new Endereco();
        endereco.setCep("01001-000");
        endereco.setLogradouro("Praça da Sé");
        endereco.setNumero(1);
        endereco.setComplemento(null);
        endereco.setBairro("Sé");
        endereco.setLocalidade("São Paulo");
        endereco.setUf("SP");
        endereco.setIbge("3550308");
        endereco.setGia("1004");
        endereco.setDdd("11");
        endereco.setSiafi("P7107");

        return  endereco;
    }
    private Pessoa criarPessoa() {
        endereco = criarEndereco();
        pessoa = new Pessoa();
        pessoa.setNomeCompleto("João Silva");
        pessoa.setDataDeNascimento(LocalDate.of(1985, 05, 20));
        pessoa.setIdade(36);
        pessoa.setCpf("123.456.789-00");
        pessoa.setEmail("joao.silva@test.com");
        enderecoRepository.save(endereco);
        pessoa.setEndereco(endereco);
        return pessoa;
    }
    private Funcionario criarFuncionario() {
        endereco = criarEndereco();
        pessoa = criarPessoa();
        funcionario = new Funcionario();
        funcionario.setDataDeAdmissao(LocalDate.of(2021,8,05));
        funcionario.setRegistroProfissional("CRO 123456");
        funcionario.setSalario(BigDecimal.valueOf(10000));
        pessoaRepository.save(pessoa);
        funcionario.setPessoa(pessoa);
//        funcionario.setEscalaDeTrabalhoDTO(new EscalaDeTrabalhoUtil().criarEDTMatutinoUmDTO());
//        funcionario.setFormacao(new FormacaoUtil().criarFormacaoMedicinaDTO());
//        funcionario.setDepartamento(new DepartamentoUtil().criarDepartamentoClinicaMedicaUtil());
//        funcionario.setFuncao(new FuncaoUtil().criarFuncaoMedicoDTO());
//        funcionario.setProgramaDeSaudes(new ProgramaDeSaudeUtil().criarPDSNaoPerteceANenhumPrograma());
        return funcionario;
    }
}