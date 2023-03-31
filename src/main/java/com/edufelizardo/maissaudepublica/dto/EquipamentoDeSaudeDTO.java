package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.EquipamentoDeSaude;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;

public class EquipamentoDeSaudeDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -3328818359619589469L;
    private Long equipamentodeSaude_id;
    @NotBlank(message = "O nome do Equipamento de Saúde deve ser preenchido.")
    private String nomeDoEquipamento;

    public EquipamentoDeSaudeDTO() {
    }

    public EquipamentoDeSaudeDTO(EquipamentoDeSaude saude) {
        this.equipamentodeSaude_id = saude.getEquipamentodeSaude_id();
        this.nomeDoEquipamento = saude.getNomeDoEquipamento();
    }

    public Long getEquipamentodeSaude_id() {
        return equipamentodeSaude_id;
    }

    public String getNomeDoEquipamento() {
        return nomeDoEquipamento;
    }

    public void setEquipamentodeSaude_id(Long equipamentodeSaude_id) {
        this.equipamentodeSaude_id = equipamentodeSaude_id;
    }

    public void setNomeDoEquipamento(String nomeDoEquipamento) {
        this.nomeDoEquipamento = nomeDoEquipamento;
    }
}
