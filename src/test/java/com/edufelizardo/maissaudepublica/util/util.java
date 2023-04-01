package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.*;
import com.edufelizardo.maissaudepublica.model.Formacao;
import com.edufelizardo.maissaudepublica.model.enuns.StatusExame;
import com.edufelizardo.maissaudepublica.model.enuns.StatusTratamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class util {
    private ConsultaDTO criarConsulta() {
        ConsultaDTO dto = new ConsultaDTO();
        dto.setDataConsulta(LocalDate.of(2022,2,02));
        dto.setHorarioConsulta(LocalTime.of(8, 0));
        dto.setFuncionariosDtos(criarFuncionarioDTO());
        dto.setPacienteDTO(criarPacienteDTO());
        dto.setExameFisicoDTO(criarExameFisicoDTO());
        dto.setQueixa("Dor de cabeça águda e febre.");
        dto.setDiagnosticosDtos(criarDiagnosticoDTO());
        dto.setTratamentoDTO(criarTartamentoDTO());
        dto.setOrientacoesClinicas("Dev ser feito tal procedimento.");
        dto.setPrescricaoMedicaDTO(criarPrescricaoMedicaDTO());
        dto.setExamesDtos(criarExameDTO());
        dto.setEncaminhamentoDTOS(criarEncaminhamentoDTO());
        return dto;
    }

    private List<FuncionarioDTO> criarFuncionarioDTO() {
        FuncionarioDTO dto = new FuncionarioDTO();

        dto.setDataDeAdmissao(LocalDate.of(2000,10,10));
        dto.setRegistroProfissional("CRM0001-SP");
        dto.setSalario(BigDecimal.valueOf(15000));
        dto.setPessoa(criarPessoaQueEFuncionario());
        dto.setEscalaDeTrabalhoDTO(criarEscalaDeTrabalhoDTO());
        dto.setFormacao(criarFormacaoDTO());
//        dto.setDepartamento();
//        dto.setFuncao();
//        dto.setProgramaDeSaudes();
        return  Arrays.asList(dto);
    }

    private Formacao criarFormacaoDTO() {
        Formacao formacao = new Formacao();
        formacao.setNomeFormacao("Medicina");
        return formacao;
    }

    private PacienteDTO criarPacienteDTO() {
        PacienteDTO dto = new PacienteDTO();
        dto.setCartaoDoSUS("8888.8888.8888.8000");
        dto.setPosicaoMembro(1);
//        dto.setProntuario();
//        dto.setPessoa();
//        dto.setFamiliaDTO();
//        dto.setAreaDeCoberturaDTO();
        return null;
    }
    private ExameFisicoDTO criarExameFisicoDTO() {
        ExameFisicoDTO dto = new ExameFisicoDTO();
        dto.setData(LocalDate.now());
        dto.setPeso(96.5);
        dto.setAltura(1.80);
        dto.setPressaoArterialSistolica(12);
        dto.setPressaoArterialSistolica(7);
        dto.setTemperatura(36.5);
        dto.setFrequenciaCardiaca(78.4);
        dto.setFrequenciaRespiratoria(98.0);
        return  dto;
    }
    private List<DiagnosticoDTO> criarDiagnosticoDTO() {
        DiagnosticoDTO dto = new DiagnosticoDTO();
//        dto.setCid();
        dto.setObservacoes("Encefalite, mielite e encefalomielite.");
        return Arrays.asList(dto);
    }
    private TratamentoDTO criarTartamentoDTO() {
        TratamentoDTO dto = new TratamentoDTO();
        dto.setDatadDeInicio(LocalDate.now());
        dto.setDescricao("Foi examinado(a) , e constatdo o motivo da doença x");
        dto.setStatus(StatusTratamento.valueOf("Tratamento em Andamento"));
        dto.setResultado("Aguardando exames complementares");
        return dto;
    }
    private PrescricaoMedicaDTO criarPrescricaoMedicaDTO() {
        PrescricaoMedicaDTO dto = new PrescricaoMedicaDTO();
        List<String> m = new ArrayList<>();
        m.add("Sonrisal");
        m.add("DorFlex");
        m.add("Vitamina D");
        dto.setDataDaPrescricao(LocalDate.now());
        dto.setMedicamentos(m);
        dto.setOrientacoes("Deve se cuidar.");
        dto.setPeriodo("2 semanas e retornar");
        return dto;
    }
    private List<ExameDTO> criarExameDTO() {
        ExameDTO dto = new ExameDTO();
//        dto.setTipoDoExame();
        dto.setDataExame(LocalDate.now());
        dto.setResultado("Aqui ficam as observações");
//        dto.setFuncionario(criarFuncionarioDTO());
//        dto.setUnidadeDeSaude();
        List<String> c = new ArrayList<>();
        c.add("Previdência");
        c.add("SUS");
        c.add("CAPS");
        dto.setCustos(c);
        dto.setStatusExame(StatusExame.valueOf("Finalizado"));
        return Arrays.asList(dto);
    }
    private List<EncaminhamentoDTO> criarEncaminhamentoDTO() {
        EncaminhamentoDTO dto = new EncaminhamentoDTO();
        dto.setDataDoEncaminhamento(LocalDate.now());
        dto.setMotivoDoEncaminhamento("Dor de cabeça crônica.");
//        dto.setEspecialidadeMedica();
        dto.setObservacoes("dores de cabeça muito forte.");
        dto.setStatusTratamento(StatusTratamento.valueOf("Em Andamento"));
        return Arrays.asList(dto);
    }
    private PessoaDTO criarPessoaQueEPaciente(){
        return null;
    }
    private PessoaDTO criarPessoaQueEFuncionario(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Jair Monterio");
        dto.setDataDeNascimento(LocalDate.of(2000, 10, 23));
        dto.setIdade(22);
        dto.setCpf("012.345.678-90");
        dto.setEmail("test@test.com");
//        dto.setEndereco();
        return dto;
    }
    private EscalaDeTrabalhoDTO criarEscalaDeTrabalhoDTO() {
        EscalaDeTrabalhoDTO dto = new EscalaDeTrabalhoDTO();
        dto.setInicioDoExpediente(LocalTime.of(8,0));
        dto.setHorarioAlmoco(LocalTime.of(1,0));
        dto.setFimDoExpediente(LocalTime.of(17,0));
        dto.setNomeDoExpediente("Vespertino Primeiro Horario");
        return dto;
    }
}
