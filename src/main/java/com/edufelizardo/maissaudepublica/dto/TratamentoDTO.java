package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Tratamento;
import com.edufelizardo.maissaudepublica.model.enuns.StatusTratamento;
import jakarta.persistence.Column;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class TratamentoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 3761250482221055023L;
    private Long tramento_id;
    private LocalDate datadDeInicio;
    private LocalDate dataDeTermino;
    private String descricao;
    private StatusTratamento status;
    private String resultado;

    public TratamentoDTO() {
    }

    public TratamentoDTO(Tratamento tratamento) {
        this.tramento_id = tratamento.getTramento_id();
        this.datadDeInicio = tratamento.getDatadDeInicio();
        this.dataDeTermino = tratamento.getDataDeTermino();
        this.descricao = tratamento.getDescricao();
        this.status = tratamento.getStatus();
        this.resultado = tratamento.getResultado();
    }

    public Long getTramento_id() {
        return tramento_id;
    }

    public LocalDate getDatadDeInicio() {
        return datadDeInicio;
    }

    public LocalDate getDataDeTermino() {
        return dataDeTermino;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusTratamento getStatus() {
        return status;
    }

    public String getResultado() {
        return resultado;
    }

    public void setTramento_id(Long tramento_id) {
        this.tramento_id = tramento_id;
    }

    public void setDatadDeInicio(LocalDate datadDeInicio) {
        this.datadDeInicio = datadDeInicio;
    }

    public void setDataDeTermino(LocalDate dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(StatusTratamento status) {
        this.status = status;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
