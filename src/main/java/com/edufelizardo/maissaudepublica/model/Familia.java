package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

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
    @NotBlank(message = "O número da família deve ser informado obrigatóriamente.")
    private int numaroFamilia;
    private boolean resposavelFamilia;
    @OneToOne
    @JoinColumn(name = "familia_area_id")
    private AreaDeCobertura areaDeCobertura;
    @ManyToOne
    @JoinColumn(name = "familia_equipe_id")
    private Equipe equipe;

    public Familia() {
    }

    public Familia(Long familia_id, boolean area, int numaroFamilia, boolean resposavelFamilia,
                   AreaDeCobertura areaDeCobertura, Equipe equipe) {
        this.familia_id = familia_id;
        this.area = area;
        this.numaroFamilia = numaroFamilia;
        this.resposavelFamilia = resposavelFamilia;
        this.areaDeCobertura = areaDeCobertura;
        this.equipe = equipe;
    }
    public Familia(Familia familia) {
        this.familia_id = familia.getFamilia_id();
        this.area = familia.isArea();
        this.numaroFamilia = familia.getNumaroFamilia();
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

    public int getNumaroFamilia() {
        return numaroFamilia;
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

    public void setNumaroFamilia(int numaroFamilia) {
        this.numaroFamilia = numaroFamilia;
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
        return isArea() == familia.isArea() && getNumaroFamilia() ==
                familia.getNumaroFamilia() && isResposavelFamilia() ==
                familia.isResposavelFamilia() && Objects.equals(getFamilia_id(),
                familia.getFamilia_id()) && Objects.equals(getAreaDeCobertura(),
                familia.getAreaDeCobertura()) && Objects.equals(getEquipe(), familia.getEquipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamilia_id(), isArea(), getNumaroFamilia(), isResposavelFamilia(),
                getAreaDeCobertura(), getEquipe());
    }
}
