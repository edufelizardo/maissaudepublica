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

    public HistoricoMedico() {}
    public HistoricoMedico(HistoricoMedico historicoMedico) {
        this.historicoMedico_id = historicoMedico.getHistoricoMedico_id();
        this.consultas = historicoMedico.getConsultas();
        this.exames = historicoMedico.getExames();
        this.tratamentos = historicoMedico.getTratamentos();
        this.prescricoesMedicas = historicoMedico.getPrescricoesMedicas();
        this.encaminhamentos = historicoMedico.getEncaminhamentos();
    }

    public Long getHistoricoMedico_id() {
        return historicoMedico_id;
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
        return Objects.equals(getHistoricoMedico_id(), that.getHistoricoMedico_id()) && Objects.equals(getConsultas(),
                that.getConsultas()) && Objects.equals(getExames(), that.getExames()) && Objects.equals(getTratamentos(),
                that.getTratamentos()) && Objects.equals(getPrescricoesMedicas(),
                that.getPrescricoesMedicas()) && Objects.equals(getEncaminhamentos(), that.getEncaminhamentos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHistoricoMedico_id(), getConsultas(), getExames(), getTratamentos(),
                getPrescricoesMedicas(), getEncaminhamentos());
    }

    @Override
    public String toString() {
        return "HistoricoMedico{" +
                "historicoMedico_id=" + historicoMedico_id +
                ", consultas=" + consultas +
                ", exames=" + exames +
                ", tratamentos=" + tratamentos +
                ", prescricoesMedicas=" + prescricoesMedicas +
                ", encaminhamentos=" + encaminhamentos +
                '}';
    }
}
