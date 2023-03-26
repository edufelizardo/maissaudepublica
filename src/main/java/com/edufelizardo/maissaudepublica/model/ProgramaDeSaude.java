package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class ProgramaDeSaude implements Serializable {
    @Serial
    private static final long serialVersionUID = -6909103580177308135L;
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long programaDeSaude_id;
    @NotBlank(message = "O nome do progra de saúde é obrigatório.")
    @Column(unique = true)
    private String nomeProgramaDesaude;

    public ProgramaDeSaude() {
    }

    public ProgramaDeSaude(Long programaDeSaude_id, String nomeProgramaDesaude) {
        this.programaDeSaude_id = programaDeSaude_id;
        this.nomeProgramaDesaude = nomeProgramaDesaude;
    }
    public ProgramaDeSaude(ProgramaDeSaude programaDeSaude) {
        this.programaDeSaude_id = programaDeSaude.getProgramaDeSaude_id();
        this.nomeProgramaDesaude = programaDeSaude.getNomeProgramaDesaude();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProgramaDeSaude that)) return false;
        return Objects.equals(getProgramaDeSaude_id(),
                that.getProgramaDeSaude_id()) && Objects.equals(getNomeProgramaDesaude(), that.getNomeProgramaDesaude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProgramaDeSaude_id(), getNomeProgramaDesaude());
    }
}
