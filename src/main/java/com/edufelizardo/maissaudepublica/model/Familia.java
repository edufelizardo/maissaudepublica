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
    private boolean area;
    private int numeroFamilia;
    private boolean resposavelFamilia;
    @OneToOne
    @JoinColumn(name = "familia_area_id")
    private AreaDeCobertura areaDeCobertura;
    @ManyToOne
    @JoinColumn(name = "familia_equipe_id")
    private Equipe equipe;

    public Familia() {
    }

    public Familia(Long familia_id, boolean area, int numeroFamilia, boolean resposavelFamilia,
                   AreaDeCobertura areaDeCobertura, Equipe equipe) {
        this.familia_id = familia_id;
        this.area = area;
        this.numeroFamilia = numeroFamilia;
        this.resposavelFamilia = resposavelFamilia;
        this.areaDeCobertura = areaDeCobertura;
        this.equipe = equipe;
    }
    public Familia(Familia familia) {
        this.familia_id = familia.getFamilia_id();
        this.area = familia.isArea();
        this.numeroFamilia = familia.getNumeroFamilia();
        this.resposavelFamilia = familia.isResposavelFamilia();
        this.areaDeCobertura = familia.getAreaDeCobertura();
        this.equipe = familia.getEquipe();
    }

    public Long getFamilia_id() {
        return familia_id;
    }

    public boolean isArea() {
        return area;
    }

    public int getNumeroFamilia() {
        return numeroFamilia;
    }

    public boolean isResposavelFamilia() {
        return resposavelFamilia;
    }

    public AreaDeCobertura getAreaDeCobertura() {
        return areaDeCobertura;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setFamilia_id(Long familia_id) {
        this.familia_id = familia_id;
    }

    public void setArea(boolean area) {
        this.area = area;
    }

    public void setNumeroFamilia(int numaroFamilia) {
        this.numeroFamilia = numaroFamilia;
    }

    public void setResposavelFamilia(boolean resposavelFamilia) {
        this.resposavelFamilia = resposavelFamilia;
    }

    public void setAreaDeCobertura(AreaDeCobertura areaDeCobertura) {
        this.areaDeCobertura = areaDeCobertura;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Familia familia)) return false;
        return isArea() == familia.isArea() && getNumeroFamilia() ==
                familia.getNumeroFamilia() && isResposavelFamilia() ==
                familia.isResposavelFamilia() && Objects.equals(getFamilia_id(),
                familia.getFamilia_id()) && Objects.equals(getAreaDeCobertura(),
                familia.getAreaDeCobertura()) && Objects.equals(getEquipe(), familia.getEquipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamilia_id(), isArea(), getNumeroFamilia(), isResposavelFamilia(),
                getAreaDeCobertura(), getEquipe());
    }

    @Override
    public String toString() {
        return "Familia{" +
                "familia_id=" + familia_id +
                ", area=" + area +
                ", numaroFamilia=" + numeroFamilia +
                ", resposavelFamilia=" + resposavelFamilia +
                ", areaDeCobertura=" + areaDeCobertura +
                ", equipe=" + equipe +
                '}';
    }
}
