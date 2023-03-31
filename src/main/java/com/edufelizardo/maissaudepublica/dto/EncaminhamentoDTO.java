package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Encaminhamento;
import com.edufelizardo.maissaudepublica.model.enuns.EspecialidadeMedica;
import com.edufelizardo.maissaudepublica.model.enuns.StatusTratamento;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class EncaminhamentoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 2693579333046968177L;
    private Long encaminhamento_id;
    private LocalDate dataDoEncaminhamento;
    private String motivoDoEncaminhamento;
    private EspecialidadeMedica especialidadeMedica;
    private String observacoes;
    private StatusTratamento statusTratamento;

    public EncaminhamentoDTO() {
    }

    public EncaminhamentoDTO(Encaminhamento encaminhamento) {
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
}
