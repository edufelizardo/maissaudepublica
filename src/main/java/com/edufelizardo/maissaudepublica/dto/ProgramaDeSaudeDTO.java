package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.ProgramaDeSaude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;

public class ProgramaDeSaudeDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4015859615195170445L;
    private Long programaDeSaude_id;
    @NotBlank(message = "O nome do progra de saúde é obrigatório.")
    @Column(unique = true)
    private String nomeProgramaDesaude;

    public ProgramaDeSaudeDTO() {
    }

    public ProgramaDeSaudeDTO(ProgramaDeSaude saude) {
        this.programaDeSaude_id = saude.getProgramaDeSaude_id();
        this.nomeProgramaDesaude = saude.getNomeProgramaDesaude();
    }

    public Long getProgramaDeSaude_id() {
        return programaDeSaude_id;
    }

    public String getNomeProgramaDesaude() {
        return nomeProgramaDesaude;
    }

    public void setProgramaDeSaude_id(Long programaDeSaude_id) {
        this.programaDeSaude_id = programaDeSaude_id;
    }

    public void setNomeProgramaDesaude(String nomeProgramaDesaude) {
        this.nomeProgramaDesaude = nomeProgramaDesaude;
    }
}
