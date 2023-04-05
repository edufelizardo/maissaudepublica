package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.Equipe;
import com.edufelizardo.maissaudepublica.model.Familia;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;

public class FamiliaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 8555715654002163118L;
    private Long familia_id;
    private boolean area;
    @NotBlank(message = "O número da família deve ser informado obrigatóriamente.")
    private int numaroFamilia;
    private boolean resposavelFamilia;
    private AreaDeCobertura areaDeCobertura;
    private Equipe equipe;

    public FamiliaDTO() {
    }

    public FamiliaDTO(Familia familia) {
        this.familia_id = familia.getFamilia_id();
        this.area = familia.isArea();
        this.numaroFamilia = familia.getNumeroFamilia();
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
}
