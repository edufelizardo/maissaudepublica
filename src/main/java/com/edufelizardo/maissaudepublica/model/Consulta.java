package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Consulta implements Serializable {
    @Serial
    private static final long serialVersionUID = 1027931809944476663L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consulta_id;
    private LocalDate dataConsulta;
    private LocalDate horarioConsulta;
    @OneToMany
    @JoinColumn(name = "consulta_funcionario_id")
    private List<Funcionario> funcionarios;
    @OneToOne
    @JoinColumn(name = "consulta_paciente_id")
    private Paciente paciente;
    @OneToOne
    @JoinColumn(name = "consulta_exame_fisico_id")
    private ExameFisico exameFisico;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String queixa;
    @OneToMany
    @JoinColumn(name = "consulta_diagnosticos_id")
    private List<Diagnostico> diagnosticos = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "consulta_tramento_id")
    private Tratamento tratamento;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String orientacoesClinicas;
    @OneToOne
    @JoinColumn(name = "consulta_prescricao_medica")
    private PrescricaoMedica prescricaoMedica;
    @OneToMany
    @JoinColumn(name = "consulta_exames_id")
    private List<Exame> exames = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "consulta_encaminhamento_id")
    private List<Encaminhamento> encaminhamentos = new ArrayList<>();

    public Consulta() {
    }

    public Consulta(Long consulta_id, LocalDate dataConsulta, LocalDate horarioConsulta, List<Funcionario> funcionarios,
                    Paciente paciente, ExameFisico exameFisico, String queixa, List<Diagnostico> diagnosticos,
                    Tratamento tratamento, String orientacoesClinicas, PrescricaoMedica prescricaoMedica,
                    List<Exame> exames, List<Encaminhamento> encaminhamentos) {
        this.consulta_id = consulta_id;
        this.dataConsulta = dataConsulta;
        this.horarioConsulta = horarioConsulta;
        this.funcionarios = funcionarios;
        this.paciente = paciente;
        this.exameFisico = exameFisico;
        this.queixa = queixa;
        this.diagnosticos = diagnosticos;
        this.tratamento = tratamento;
        this.orientacoesClinicas = orientacoesClinicas;
        this.prescricaoMedica = prescricaoMedica;
        this.exames = exames;
        this.encaminhamentos = encaminhamentos;
    }
    public Consulta(Consulta consulta) {
        this.consulta_id = consulta.getConsulta_id();
        this.dataConsulta = consulta.getDataConsulta();
        this.horarioConsulta = consulta.getHorarioConsulta();
        this.funcionarios = consulta.getFuncionarios();
        this.paciente = consulta.getPaciente();
        this.exameFisico = consulta.getExameFisico();
        this.queixa = consulta.getQueixa();
        this.diagnosticos = consulta.getDiagnosticos();
        this.tratamento = consulta.getTratamento();
        this.orientacoesClinicas = consulta.getOrientacoesClinicas();
        this.prescricaoMedica = consulta.getPrescricaoMedica();
        this.exames = consulta.getExames();
        this.encaminhamentos = consulta.getEncaminhamentos();
    }

    public Long getConsulta_id() {
        return consulta_id;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public LocalDate getHorarioConsulta() {
        return horarioConsulta;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public ExameFisico getExameFisico() {
        return exameFisico;
    }

    public String getQueixa() {
        return queixa;
    }

    public List<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public String getOrientacoesClinicas() {
        return orientacoesClinicas;
    }

    public PrescricaoMedica getPrescricaoMedica() {
        return prescricaoMedica;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public List<Encaminhamento> getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setConsulta_id(Long consulta_id) {
        this.consulta_id = consulta_id;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setHorarioConsulta(LocalDate horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setExameFisico(ExameFisico exameFisico) {
        this.exameFisico = exameFisico;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public void setDiagnosticos(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public void setOrientacoesClinicas(String orientacoesClinicas) {
        this.orientacoesClinicas = orientacoesClinicas;
    }

    public void setPrescricaoMedica(PrescricaoMedica prescricaoMedica) {
        this.prescricaoMedica = prescricaoMedica;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void setEncaminhamentos(List<Encaminhamento> encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consulta consulta)) return false;
        return Objects.equals(getConsulta_id(), consulta.getConsulta_id()) && Objects.equals(getDataConsulta(),
                consulta.getDataConsulta()) && Objects.equals(getHorarioConsulta(),
                consulta.getHorarioConsulta()) && Objects.equals(getFuncionarios(),
                consulta.getFuncionarios()) && Objects.equals(getPaciente(),
                consulta.getPaciente()) && Objects.equals(getExameFisico(),
                consulta.getExameFisico()) && Objects.equals(getQueixa(),
                consulta.getQueixa()) && Objects.equals(getDiagnosticos(),
                consulta.getDiagnosticos()) && Objects.equals(getTratamento(),
                consulta.getTratamento()) && Objects.equals(getOrientacoesClinicas(),
                consulta.getOrientacoesClinicas()) && Objects.equals(getPrescricaoMedica(),
                consulta.getPrescricaoMedica()) && Objects.equals(getExames(),
                consulta.getExames()) && Objects.equals(getEncaminhamentos(), consulta.getEncaminhamentos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConsulta_id(), getDataConsulta(), getHorarioConsulta(), getFuncionarios(),
                getPaciente(), getExameFisico(), getQueixa(), getDiagnosticos(), getTratamento(),
                getOrientacoesClinicas(), getPrescricaoMedica(), getExames(), getEncaminhamentos());
    }
}
