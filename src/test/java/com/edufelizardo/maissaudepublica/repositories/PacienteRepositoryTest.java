package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.*;
import com.edufelizardo.maissaudepublica.util.TestPacienteUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@DataJpaTest
@DisplayName("Testando Pacientes")
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
//    @BeforeTestClass
//    private Paciente criaPaciente() {
//        paciente = criarPaciente();
//        pacienteRepository.save(paciente);
//        return paciente;
//    }
    @Test
    @DisplayName("Buscar Paciente Pelo Nome Completo - Paciente Encontrado")
    void testBuscarPacientePeloNomeCompletoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = TestPacienteUtil.criarPacienteUm(areaDeCoberturaRepository, subareaRepository, familiaRepository,
                equipeRepository, enderecoRepository, pessoaRepository, pacienteRepository, prontuarioRepository,
                historicoMedicoRepository);
        pacienteRepository.save(paciente);

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
    @DisplayName("Buscar Paciente Pelo Nome Completo - Paciente Não Encontrado")
    void testBuscarPacientePeloNomeCompletoNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

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
    @DisplayName("Buscar Paciente Por Parte Do Nome Completo - Paciente Encontrado")
    void testBuscarPacienteParteDoNomeCompletoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByPessoaNomeCompletoContainingIgnoreCase("Silva");
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
    @DisplayName("Buscar Paciente Por Parte Do Nome Completo - Paciente Não Encontrado")
    void testBuscarPacienteParteDoNomeCompletoNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

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
    @DisplayName("Buscar Paciente Pelo Número Do Cartão Do SUS - Paciente Encontrado")
    void testBuscarPacientePeloNumeroDoCartaoDoSUSEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByCartaoDoSUS("8888.8888.8888.0008");
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
    @DisplayName("Buscar Paciente Pelo Número Do Cartão Do SUS - Paciente Não Encontrado")
    void testBuscarPacientePeloNumeroDoCartaoDoSUSNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

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
    @DisplayName("Buscar Paciente Pelo Número Do Prontuario - Paciente Encontrado")
    void testBuscarPacientePeloNumeroDoProntuarioEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

        List<Paciente> pacientesEncontrados = pacienteRepository
                .findByProntuarioNumeroProntuario("UBS PQ São Domingos-001.001.001-01");
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
    @DisplayName("Buscar Paciente Pelo Número Do Prontuario - Paciente Não Encontrado")
    void testBuscarPacientePeloNumeroDoProntuarioNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

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
    @DisplayName("Buscar Pacientes Pelo Endereço e o Número - Paciente Encontrado")
    void testBuscarPacientePeloEnderecoEONumeroEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

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
    @Test
    @DisplayName("Buscar Pacientes Pelo Endereço e o Número - Paciente Não Encontrado")
    void testBuscarPacientePeloEnderecoEONumeroNaoEncontrado() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        paciente = criarPaciente();
        pacienteRepository.save(paciente);

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
    private Subarea criarSubArea() {
        subarea = new Subarea();
        subarea.setSubarea(1);
        return subarea;
    }
    private AreaDeCobertura criarAreDeCobertura() {
        areaDeCobertura = new AreaDeCobertura();
        subarea = criarSubArea();
        areaDeCobertura.setArea(001);
        List<Subarea> sub = new ArrayList<>();
        sub.add(subarea);
        subareaRepository.save(subarea);
        areaDeCobertura.setSubareas(sub);
        return areaDeCobertura;
    }
    private Familia criarFamilia() {
        familia = new Familia();
        familia.setNumeroFamilia("001");
        familia.setResposavelFamilia(true);
        return familia;
    }
    private Endereco criarEndereco() {
        areaDeCobertura = criarAreDeCobertura();
        familia = criarFamilia();

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
        areaDeCoberturaRepository.save(areaDeCobertura);
        endereco.setAreaDeCobertura(areaDeCobertura);
        familiaRepository.save(familia);
        endereco.setFamilia(familia);

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
    private Prontuario criarProntuario() {
        prontuario = new Prontuario();
        historicoMedico = criarHistoricoMedico();
        prontuario.setNumeroProntuario("UBS PQ São Domingos-001.001.001-01");
//        historicoMedicoRepository.save(historicoMedico);
        prontuario.setHistoricoMedico(historicoMedico);
        return  prontuario;
    }
    private HistoricoMedico criarHistoricoMedico() {
        historicoMedico = new HistoricoMedico();
        return null;
    }
    private Paciente criarPaciente() {
        pessoa = criarPessoa();
        prontuario = criarProntuario();
        familia = criarFamilia();
        areaDeCobertura = criarAreDeCobertura();

        paciente = new Paciente();
        paciente.setCartaoDoSUS("8888.8888.8888.0008");
        paciente.setPosicaoMembro(1);
        prontuarioRepository.save(prontuario);
        paciente.setProntuario(prontuario);
        pessoaRepository.save(pessoa);
        paciente.setPessoa(pessoa);
        return paciente;
    }
}