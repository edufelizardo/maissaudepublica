package com.edufelizardo.maissaudepublica.model;

import com.edufelizardo.maissaudepublica.model.enuns.StatusTratamento;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Tratamento implements Serializable {
    @Serial
    private static final long serialVersionUID = -33058675220837225L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tramento_id;
    private LocalDate datadDeInicio;
    private LocalDate dataDeTermino;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String descricao;
    private StatusTratamento status;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String resultado;

    public Tratamento() {
    }

    public Tratamento(Long tramento_id, LocalDate datadDeInicio, LocalDate dataDeTermino, String descricao,
                      StatusTratamento status, String resultado) {
        this.tramento_id = tramento_id;
        this.datadDeInicio = datadDeInicio;
        this.dataDeTermino = dataDeTermino;
        this.descricao = descricao;
        this.status = status;
        this.resultado = resultado;
    }
    public Tratamento(Tratamento tratamento) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tratamento that)) return false;
        return Objects.equals(getTramento_id(), that.getTramento_id()) && Objects.equals(getDatadDeInicio(),
                that.getDatadDeInicio()) && Objects.equals(getDataDeTermino(),
                that.getDataDeTermino()) && Objects.equals(getDescricao(),
                that.getDescricao()) && getStatus() == that.getStatus() && Objects.equals(getResultado(),
                that.getResultado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTramento_id(), getDatadDeInicio(), getDataDeTermino(), getDescricao(), getStatus(),
                getResultado());
    }
}
