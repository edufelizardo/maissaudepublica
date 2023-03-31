package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class UnidadeDeSaude implements Serializable {
    @Serial
    private static final long serialVersionUID = -2204382685411159343L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long unidadeDeSaude_id;
    @Column(unique = true, nullable = false)
    @NotBlank(message = "Nome da unidade é obrigatório.")
    private String nomeUnidadeDeSaude;
    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @ElementCollection
    @CollectionTable(name = "telefones_da_Unidade_de_saude")
    private Set<String> unidadeTelefones = new HashSet<>();
    @OneToOne
    @JoinColumn(name = "equipamento_de_saude_id")
    private EquipamentoDeSaude equipamentoDeSaude;
    private int numeroDeLeitos;
    @ElementCollection
    @CollectionTable(name = "especialidades_unidade_de_saude")
    private Set<String> especialidades = new HashSet<>();

    public UnidadeDeSaude() {
    }

    public UnidadeDeSaude(Long unidadeDeSaude_id, String nomeUnidadeDeSaude, Endereco endereco,
                          Set<String> unidadeTelefones, EquipamentoDeSaude equipamentoDeSaude, int numeroDeLeitos,
                          Set<String> especialidades) {
        this.unidadeDeSaude_id = unidadeDeSaude_id;
        this.nomeUnidadeDeSaude = nomeUnidadeDeSaude;
        this.endereco = endereco;
        this.unidadeTelefones = unidadeTelefones;
        this.equipamentoDeSaude = equipamentoDeSaude;
        this.numeroDeLeitos = numeroDeLeitos;
        this.especialidades = especialidades;
    }
    public UnidadeDeSaude(UnidadeDeSaude unidadeDeSaude) {
        this.unidadeDeSaude_id = unidadeDeSaude.getUnidadeDeSaude_id();
        this.nomeUnidadeDeSaude = unidadeDeSaude.getNomeUnidadeDeSaude();
        this.endereco = unidadeDeSaude.getEndereco();
        this.unidadeTelefones = unidadeDeSaude.getUnidadeTelefones();
        this.equipamentoDeSaude = unidadeDeSaude.getEquipamentoDeSaude();
        this.numeroDeLeitos = unidadeDeSaude.getNumeroDeLeitos();
        this.especialidades = unidadeDeSaude.getEspecialidades();
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
        nomeUnidadeDeSaude = nomeUnidadeDeSaude;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnidadeDeSaude that)) return false;
        return getNumeroDeLeitos() == that.getNumeroDeLeitos() && Objects.equals(getUnidadeDeSaude_id(),
                that.getUnidadeDeSaude_id()) && Objects.equals(getNomeUnidadeDeSaude(),
                that.getNomeUnidadeDeSaude()) && Objects.equals(getEndereco(),
                that.getEndereco()) && Objects.equals(getUnidadeTelefones(),
                that.getUnidadeTelefones()) && Objects.equals(getEquipamentoDeSaude(),
                that.getEquipamentoDeSaude()) && Objects.equals(getEspecialidades(), that.getEspecialidades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUnidadeDeSaude_id(), getNomeUnidadeDeSaude(), getEndereco(), getUnidadeTelefones(),
                getEquipamentoDeSaude(), getNumeroDeLeitos(), getEspecialidades());
    }

    @Override
    public String toString() {
        return "UnidadeDeSaude{" +
                "unidadeDeSaude_id=" + unidadeDeSaude_id +
                ", nomeUnidadeDeSaude='" + nomeUnidadeDeSaude + '\'' +
                ", endereco=" + endereco +
                ", unidadeTelefones=" + unidadeTelefones +
                ", equipamentoDeSaude=" + equipamentoDeSaude +
                ", numeroDeLeitos=" + numeroDeLeitos +
                ", especialidades=" + especialidades +
                '}';
    }
}
