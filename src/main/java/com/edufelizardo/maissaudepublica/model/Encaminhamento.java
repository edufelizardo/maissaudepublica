package com.edufelizardo.maissaudepublica.model;

import com.edufelizardo.maissaudepublica.model.enuns.EspecialidadeMedica;
import com.edufelizardo.maissaudepublica.model.enuns.StatusTratamento;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class Encaminhamento implements Serializable{
    @Serial
    private static final long serialVersionUID = -1363992100396592839L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long encaminhamento_id;
    private LocalDate dataDoEncaminhamento;
    private String motivoDoEncaminhamento;
    private EspecialidadeMedica especialidadeMedica;
    private String observacoes;
    private StatusTratamento statusTratamento;

    public Encaminhamento() {
    }

    public Encaminhamento(Long encaminhamento_id, LocalDate dataDoEncaminhamento, String motivoDoEncaminhamento,
                          EspecialidadeMedica especialidadeMedica, String observacoes,
                          StatusTratamento statusTratamento) {
        this.encaminhamento_id = encaminhamento_id;
        this.dataDoEncaminhamento = dataDoEncaminhamento;
        this.motivoDoEncaminhamento = motivoDoEncaminhamento;
        this.especialidadeMedica = especialidadeMedica;
        this.observacoes = observacoes;
        this.statusTratamento = statusTratamento;
    }
    public Encaminhamento(Encaminhamento encaminhamento) {
        this.encaminhamento_id = encaminhamento.getEncaminhamento_id();
        this.dataDoEncaminhamento = encaminhamento.getDataDoEncaminhamento();
        this.motivoDoEncaminhamento = encaminhamento.getMotivoDoEncaminhamento();
        this.especialidadeMedica = encaminhamento.getEspecialidadeMedica();
        this.observacoes = encaminhamento.getObservacoes();
        this.statusTratamento = encaminhamento.getStatusTratamento();
    }

    public Long getEncaminhamento_id() {
        return encaminhamento_id;
    }

    public LocalDate getDataDoEncaminhamento() {
        return dataDoEncaminhamento;
    }

    public String getMotivoDoEncaminhamento() {
        return motivoDoEncaminhamento;
    }

    public EspecialidadeMedica getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public StatusTratamento getStatusTratamento() {
        return statusTratamento;
    }

    public void setEncaminhamento_id(Long encaminhamento_id) {
        this.encaminhamento_id = encaminhamento_id;
    }

    public void setDataDoEncaminhamento(LocalDate dataDoEncaminhamento) {
        this.dataDoEncaminhamento = dataDoEncaminhamento;
    }

    public void setMotivoDoEncaminhamento(String motivoDoEncaminhamento) {
        this.motivoDoEncaminhamento = motivoDoEncaminhamento;
    }

    public void setEspecialidadeMedica(EspecialidadeMedica especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setStatusTratamento(StatusTratamento statusTratamento) {
        this.statusTratamento = statusTratamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Encaminhamento that)) return false;
        return Objects.equals(getEncaminhamento_id(),
                that.getEncaminhamento_id()) && Objects.equals(getDataDoEncaminhamento(),
                that.getDataDoEncaminhamento()) && Objects.equals(getMotivoDoEncaminhamento(),
                that.getMotivoDoEncaminhamento()) && getEspecialidadeMedica() ==
                that.getEspecialidadeMedica() && Objects.equals(getObservacoes(),
                that.getObservacoes()) && getStatusTratamento() == that.getStatusTratamento();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEncaminhamento_id(), getDataDoEncaminhamento(), getMotivoDoEncaminhamento(),
                getEspecialidadeMedica(), getObservacoes(), getStatusTratamento());
    }

    @Override
    public String toString() {
        return "Encaminhamento{" +
                "encaminhamento_id=" + encaminhamento_id +
                ", dataDoEncaminhamento=" + dataDoEncaminhamento +
                ", motivoDoEncaminhamento='" + motivoDoEncaminhamento + '\'' +
                ", especialidadeMedica=" + especialidadeMedica +
                ", observacoes='" + observacoes + '\'' +
                ", statusTratamento=" + statusTratamento +
                '}';
    }
}
