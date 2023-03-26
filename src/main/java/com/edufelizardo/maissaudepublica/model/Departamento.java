package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Departamento implements Serializable {
    @Serial
    private static final long serialVersionUID = 1112883360879577025L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departamento_id;
    @NotBlank(message = "O nome do departamento é obrigatório.")
    private String nomeDoDepartamento;

    public Departamento() {
    }

    public Departamento(Long departamento_id, String nomeDoDepartamento) {
        this.departamento_id = departamento_id;
        this.nomeDoDepartamento = nomeDoDepartamento;
    }
    public Departamento(Departamento departamento) {
        this.departamento_id = departamento.getDepartamento_id();
        this.nomeDoDepartamento = departamento.getNomeDoDepartamento();
    }

    public Long getDepartamento_id() {
        return departamento_id;
    }

    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamento_id = departamento_id;
    }

    public void setNomeDoDepartamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departamento that)) return false;
        return Objects.equals(getDepartamento_id(),
                that.getDepartamento_id()) && Objects.equals(getNomeDoDepartamento(), that.getNomeDoDepartamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartamento_id(), getNomeDoDepartamento());
    }
}
