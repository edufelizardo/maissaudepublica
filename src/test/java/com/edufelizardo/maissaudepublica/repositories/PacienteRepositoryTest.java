package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.*;
import com.edufelizardo.maissaudepublica.util.TestPacienteUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@DisplayName("Testando Pacientes")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PacienteRepositoryTest {
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private ProntuarioRepository prontuarioRepository;
    @Autowired
    private HistoricoMedicoRepository historicoMedicoRepository;
    @Autowired
    private FamiliaRepository familiaRepository;
    @Autowired
    private AreaDeCoberturaRepository areaDeCoberturaRepository;
    @Autowired
    private SubareaRepository subareaRepository;
    @Autowired
    private EquipeRepository equipeRepository;
    private Endereco endereco;
    private Pessoa pessoa;
    private Prontuario prontuario;
    private Paciente paciente;
    private HistoricoMedico historicoMedico;
    private Familia familia;
    private AreaDeCobertura areaDeCobertura;
    private Subarea subarea;
    @BeforeEach
    void setUp() {
        paciente = TestPacienteUtil.criarPacienteUm(areaDeCoberturaRepository, subareaRepository, familiaRepository,
                equipeRepository, enderecoRepository, pessoaRepository, pacienteRepository, prontuarioRepository,
                historicoMedicoRepository);
        pacienteRepository.save(paciente);
    }
    @AfterEach
    void tearDown() {
        pacienteRepository.delete(paciente);
    }
    @Test
    @Order(1)
    @DisplayName("CT 01 -Buscar Paciente Pelo Nome Completo - Paciente Encontrado")
    void testBuscarPacientePeloNomeCompletoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository.findByPessoaNomeCompleto("Cecília Santos");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("Cecília Santos", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(2)
    @DisplayName("CT 02 -Buscar Paciente Pelo Nome Completo - Paciente Não Encontrado")
    void testBuscarPacientePeloNomeCompletoNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository.findByPessoaNomeCompleto("Silva");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("João Silva", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(3)
    @DisplayName("CT 03 -Buscar Paciente Por Parte Do Nome Completo - Paciente Encontrado")
    void testBuscarPacienteParteDoNomeCompletoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByPessoaNomeCompletoContainingIgnoreCase("Santos");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("Cecília Santos", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(4)
    @DisplayName("CT 04 -Buscar Paciente Por Parte Do Nome Completo - Paciente Não Encontrado")
    void testBuscarPacienteParteDoNomeCompletoNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByPessoaNomeCompletoContainingIgnoreCase("Adalberto");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("João Silva", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(5)
    @DisplayName("CT 05 -Buscar Paciente Pelo Número Do Cartão Do SUS - Paciente Encontrado")
    void testBuscarPacientePeloNumeroDoCartaoDoSUSEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByCartaoDoSUS("705 0454 6634 8144");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("Cecília Santos", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(6)
    @DisplayName("CT 06 -Buscar Paciente Pelo Número Do Cartão Do SUS - Paciente Não Encontrado")
    void testBuscarPacientePeloNumeroDoCartaoDoSUSNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByCartaoDoSUS("8888.8888.8888.0007");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("João Silva", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(7)
    @DisplayName("CT 07 -Buscar Paciente Pelo Número Do Prontuario - Paciente Encontrado")
    void testBuscarPacientePeloNumeroDoProntuarioEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByProntuarioNumeroProntuario("UBS.PQ.São.Domingos-001.001.001-01");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("Cecília Santos", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(8)
    @DisplayName("CT 08 -Buscar Paciente Pelo Número Do Prontuario - Paciente Não Encontrado")
    void testBuscarPacientePeloNumeroDoProntuarioNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByProntuarioNumeroProntuario("UBS PQ São Domingos-001.001.001-02");
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("João Silva", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(9)
    @DisplayName("CT 09 -Buscar Pacientes Pelo Endereço e o Número - Paciente Encontrado")
    void testBuscarPacientePeloEnderecoEONumeroEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByPessoaEnderecoLogradouroAndPessoaEnderecoNumero("Rua Arroio do Meio", 415);
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("Cecília Santos", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
    @Test
    @Order(10)
    @DisplayName("CT 10 -Buscar Pacientes Pelo Endereço e o Número - Paciente Não Encontrado")
    void testBuscarPacientePeloEnderecoEONumeroNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByPessoaEnderecoLogradouroAndPessoaEnderecoNumero("Praça da Sé", 1);
        if (pacientesEncontrados.isEmpty()) {
            System.out.println("Paciente não encontrado");
        } else {
            Assertions.assertNotNull(paciente.getId());
            Assertions.assertEquals("João Silva", paciente.getPessoa().getNomeCompleto());

            String json = objectMapper.writeValueAsString(pacientesEncontrados);
            System.out.println(json);
        }
    }
}