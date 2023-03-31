package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Endereco;
import com.edufelizardo.maissaudepublica.model.EquipamentoDeSaude;
import com.edufelizardo.maissaudepublica.model.UnidadeDeSaude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UnidadeDeSaudeDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 4570363220254122852L;
    private Long unidadeDeSaude_id;
    @Column(unique = true, nullable = false)
    @NotBlank(message = "Nome da unidade é obrigatório.")
    private String nomeUnidadeDeSaude;
    private Endereco endereco;
    private Set<String> unidadeTelefones = new HashSet<>();
    private EquipamentoDeSaude equipamentoDeSaude;
    private int numeroDeLeitos;
    private Set<String> especialidades = new HashSet<>();

    public UnidadeDeSaudeDTO() {
    }

    public UnidadeDeSaudeDTO(UnidadeDeSaude saude) {
        this.unidadeDeSaude_id = saude.getUnidadeDeSaude_id();
        this.nomeUnidadeDeSaude = saude.getNomeUnidadeDeSaude();
        this.endereco = saude.getEndereco();
        this.unidadeTelefones = saude.getUnidadeTelefones();
        this.equipamentoDeSaude = saude.getEquipamentoDeSaude();
        this.numeroDeLeitos = saude.getNumeroDeLeitos();
        this.especialidades = saude.getEspecialidades();
    }

    public Long getUnidadeDeSaude_id() {
        return unidadeDeSaude_id;
    }

    public String getNomeUnidadeDeSaude() {
        return nomeUnidadeDeSaude;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Set<String> getUnidadeTelefones() {
        return unidadeTelefones;
    }

    public EquipamentoDeSaude getEquipamentoDeSaude() {
        return equipamentoDeSaude;
    }

    public int getNumeroDeLeitos() {
        return numeroDeLeitos;
    }

    public Set<String> getEspecialidades() {
        return especialidades;
    }

    public void setUnidadeDeSaude_id(Long unidadeDeSaude_id) {
        this.unidadeDeSaude_id = unidadeDeSaude_id;
    }

    public void setNomeUnidadeDeSaude(String nomeUnidadeDeSaude) {
        this.nomeUnidadeDeSaude = nomeUnidadeDeSaude;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setUnidadeTelefones(Set<String> unidadeTelefones) {
        this.unidadeTelefones = unidadeTelefones;
    }

    public void setEquipamentoDeSaude(EquipamentoDeSaude equipamentoDeSaude) {
        this.equipamentoDeSaude = equipamentoDeSaude;
    }

    public void setNumeroDeLeitos(int numeroDeLeitos) {
        this.numeroDeLeitos = numeroDeLeitos;
    }

    public void setEspecialidades(Set<String> especialidades) {
        this.especialidades = especialidades;
    }
}
