package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.*;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -981777308266600971L;
    private Long consulta_id;
    private LocalDate dataConsulta;
    private LocalTime horarioConsulta;
    private List<FuncionarioDTO> funcionariosDtos = new ArrayList<>();
    private PacienteDTO pacienteDTO;
    private ExameFisicoDTO exameFisicoDTO;
    private String queixa;
    private List<DiagnosticoDTO> diagnosticosDtos = new ArrayList<>();
    private TratamentoDTO tratamentoDTO;
    private String orientacoesClinicas;
    private PrescricaoMedicaDTO prescricaoMedicaDTO;
    private List<ExameDTO> examesDtos = new ArrayList<>();
    private List<EncaminhamentoDTO> encaminhamentoDTOS = new ArrayList<>();

    public ConsultaDTO() {
    }

    public ConsultaDTO(Consulta consulta) {
        this.consulta_id = consulta.getConsulta_id();
        this.dataConsulta = consulta.getDataConsulta();
        this.horarioConsulta = consulta.getHorarioConsulta();
        this.funcionariosDtos = consulta.getFuncionarios().
                stream()
                .map(FuncionarioDTO::new)
                .collect(Collectors.toList());
        this.pacienteDTO = new PacienteDTO(consulta.getPaciente());
        this.exameFisicoDTO = new ExameFisicoDTO(consulta.getExameFisico());
        this.queixa = consulta.getQueixa();
        this.diagnosticosDtos = consulta.getDiagnosticos()
                .stream()
                .map(DiagnosticoDTO::new)
                .collect(Collectors.toList());
        this.tratamentoDTO = new TratamentoDTO(consulta.getTratamento());
        this.orientacoesClinicas = consulta.getOrientacoesClinicas();
        this.prescricaoMedicaDTO = new PrescricaoMedicaDTO(consulta.getPrescricaoMedica());
        this.examesDtos = consulta.getExames()
                .stream()
                .map(ExameDTO::new)
                .collect(Collectors.toList());
        this.encaminhamentoDTOS = consulta.getEncaminhamentos()
                .stream().map(EncaminhamentoDTO::new)
                .collect(Collectors.toList());
    }

    public Long getConsulta_id() {
        return consulta_id;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public LocalTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public List<FuncionarioDTO> getFuncionariosDtos() {
        return funcionariosDtos;
    }

    public PacienteDTO getPacienteDTO() {
        return pacienteDTO;
    }

    public ExameFisicoDTO getExameFisicoDTO() {
        return exameFisicoDTO;
    }

    public String getQueixa() {
        return queixa;
    }

    public List<DiagnosticoDTO> getDiagnosticosDtos() {
        return diagnosticosDtos;
    }

    public TratamentoDTO getTratamentoDTO() {
        return tratamentoDTO;
    }

    public String getOrientacoesClinicas() {
        return orientacoesClinicas;
    }

    public PrescricaoMedicaDTO getPrescricaoMedicaDTO() {
        return prescricaoMedicaDTO;
    }

    public List<ExameDTO> getExamesDtos() {
        return examesDtos;
    }

    public List<EncaminhamentoDTO> getEncaminhamentoDTOS() {
        return encaminhamentoDTOS;
    }

    public void setConsulta_id(Long consulta_id) {
        this.consulta_id = consulta_id;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setHorarioConsulta(LocalTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public void setFuncionariosDtos(List<FuncionarioDTO> funcionariosDtos) {
        this.funcionariosDtos = funcionariosDtos;
    }

    public void setPacienteDTO(PacienteDTO pacienteDTO) {
        this.pacienteDTO = pacienteDTO;
    }

    public void setExameFisicoDTO(ExameFisicoDTO exameFisicoDTO) {
        this.exameFisicoDTO = exameFisicoDTO;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public void setDiagnosticosDtos(List<DiagnosticoDTO> diagnosticosDtos) {
        this.diagnosticosDtos = diagnosticosDtos;
    }

    public void setTratamentoDTO(TratamentoDTO tratamentoDTO) {
        this.tratamentoDTO = tratamentoDTO;
    }

    public void setOrientacoesClinicas(String orientacoesClinicas) {
        this.orientacoesClinicas = orientacoesClinicas;
    }

    public void setPrescricaoMedicaDTO(PrescricaoMedicaDTO prescricaoMedicaDTO) {
        this.prescricaoMedicaDTO = prescricaoMedicaDTO;
    }

    public void setExamesDtos(List<ExameDTO> examesDtos) {
        this.examesDtos = examesDtos;
    }

    public void setEncaminhamentoDTOS(List<EncaminhamentoDTO> encaminhamentoDTOS) {
        this.encaminhamentoDTOS = encaminhamentoDTOS;
    }
}
