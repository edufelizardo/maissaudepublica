package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.Equipe;
import com.edufelizardo.maissaudepublica.model.Familia;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;

public class FamiliaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 8555715654002163118L;
    private Long familia_id;
    private boolean area;
    @NotBlank(message = "O número da família deve ser informado obrigatóriamente.")
    @Min(3)
    private String numaroFamilia;
    private boolean resposavelFamilia;

    public FamiliaDTO() {
    }

    public FamiliaDTO(Familia familia) {
        this.familia_id = familia.getFamilia_id();
        this.numaroFamilia = familia.getNumeroFamilia();
        this.resposavelFamilia = familia.isResposavelFamilia();
    }

    public Long getFamilia_id() {
        return familia_id;
    }

    public boolean isArea() {
        return area;
    }

    public String getNumaroFamilia() {
        return numaroFamilia;
    }

    public boolean isResposavelFamilia() {
        return resposavelFamilia;
    }

    public void setFamilia_id(Long familia_id) {
        this.familia_id = familia_id;
    }

    public void setArea(boolean area) {
        this.area = area;
    }

    public void setNumaroFamilia(String numaroFamilia) {
        this.numaroFamilia = numaroFamilia;
    }

    public void setResposavelFamilia(boolean resposavelFamilia) {
        this.resposavelFamilia = resposavelFamilia;
    }
}
