package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class HistoricoMedico implements Serializable {
    @Serial
    private static final long serialVersionUID = 824189283749291748L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "historico_medico_id", nullable = false)
    private Long historicoMedico_id;
    @OneToOne(mappedBy = "historicoMedico")
    private Prontuario prontuario;
    @OneToMany
    private List<Funcionario> funcionarios;
    @OneToMany
    @JoinColumn(name = "histmedico_consultas_id")
    private List<Consulta> consultas = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "histmedico_exames_id")
    private List<Exame> exames = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "histmedico_tratamentos_id")
    private List<Tratamento> tratamentos = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "histmedico_prescricao_id")
    private List<PrescricaoMedica> prescricoesMedicas = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "histmedico_encaminhamento_id")
    private List<Encaminhamento> encaminhamentos = new ArrayList<>();

    public HistoricoMedico() {
    }

    public HistoricoMedico(Long historicoMedico_id, Prontuario prontuario, List<Funcionario> funcionarios,
                           List<Consulta> consultas, List<Exame> exames, List<Tratamento> tratamentos,
                           List<PrescricaoMedica> prescricoesMedicas, List<Encaminhamento> encaminhamentos) {
        this.historicoMedico_id = historicoMedico_id;
        this.prontuario = prontuario;
        this.funcionarios = funcionarios;
        this.consultas = consultas;
        this.exames = exames;
        this.tratamentos = tratamentos;
        this.prescricoesMedicas = prescricoesMedicas;
        this.encaminhamentos = encaminhamentos;
    }
    public HistoricoMedico(HistoricoMedico historicoMedico) {
        this.historicoMedico_id = historicoMedico.getHistoricoMedico_id();
        this.prontuario = historicoMedico.getProntuario();
        this.funcionarios = historicoMedico.getFuncionarios();
        this.consultas = historicoMedico.getConsultas();
        this.exames = historicoMedico.getExames();
        this.tratamentos = historicoMedico.getTratamentos();
        this.prescricoesMedicas = historicoMedico.getPrescricoesMedicas();
        this.encaminhamentos = historicoMedico.getEncaminhamentos();
    }

    public Long getHistoricoMedico_id() {
        return historicoMedico_id;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public List<PrescricaoMedica> getPrescricoesMedicas() {
        return prescricoesMedicas;
    }

    public List<Encaminhamento> getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setHistoricoMedico_id(Long historicoMedico_id) {
        this.historicoMedico_id = historicoMedico_id;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    public void setPrescricoesMedicas(List<PrescricaoMedica> prescricoesMedicas) {
        this.prescricoesMedicas = prescricoesMedicas;
    }

    public void setEncaminhamentos(List<Encaminhamento> encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoricoMedico that)) return false;
        return Objects.equals(getHistoricoMedico_id(), that.getHistoricoMedico_id()) && Objects.equals(getProntuario(),
                that.getProntuario()) && Objects.equals(getFuncionarios(),
                that.getFuncionarios()) && Objects.equals(getConsultas(),
                that.getConsultas()) && Objects.equals(getExames(),
                that.getExames()) && Objects.equals(getTratamentos(),
                that.getTratamentos()) && Objects.equals(getPrescricoesMedicas(),
                that.getPrescricoesMedicas()) && Objects.equals(getEncaminhamentos(), that.getEncaminhamentos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHistoricoMedico_id(), getProntuario(), getFuncionarios(), getConsultas(), getExames(),
                getTratamentos(), getPrescricoesMedicas(), getEncaminhamentos());
    }
}
