package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Familia implements Serializable {
    @Serial
    private static final long serialVersionUID = 5057704262851166088L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long familia_id;
    private String numeroFamilia;
    private boolean resposavelFamilia;

    public Familia() {
    }

    public Familia(Long familia_id, String numeroFamilia, boolean resposavelFamilia) {
        this.familia_id = familia_id;
        this.numeroFamilia = numeroFamilia;
        this.resposavelFamilia = resposavelFamilia;
    }

    public Familia(Familia familia) {
        this.familia_id = familia.getFamilia_id();
        this.numeroFamilia = familia.getNumeroFamilia();
        this.resposavelFamilia = familia.isResposavelFamilia();
    }

    public Long getFamilia_id() {
        return familia_id;
    }

    public String getNumeroFamilia() {
        return numeroFamilia;
    }

    public boolean isResposavelFamilia() {
        return resposavelFamilia;
    }

    public void setFamilia_id(Long familia_id) {
        this.familia_id = familia_id;
    }

    public void setNumeroFamilia(String numaroFamilia) {
        this.numeroFamilia = numaroFamilia;
    }

    public void setResposavelFamilia(boolean resposavelFamilia) {
        this.resposavelFamilia = resposavelFamilia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Familia familia)) return false;
        return isResposavelFamilia() == familia.isResposavelFamilia() && Objects.equals(getFamilia_id(),
                familia.getFamilia_id()) && Objects.equals(getNumeroFamilia(), familia.getNumeroFamilia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamilia_id(), getNumeroFamilia(), isResposavelFamilia());
    }

    @Override
    public String toString() {
        return "Familia{" +
                "familia_id=" + familia_id +
                ", numeroFamilia='" + numeroFamilia + '\'' +
                ", resposavelFamilia=" + resposavelFamilia +
                '}';
    }
}
