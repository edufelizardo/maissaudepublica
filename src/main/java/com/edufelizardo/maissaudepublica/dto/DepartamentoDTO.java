package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Departamento;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;

public class DepartamentoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -2757572389231854392L;
    private Long departamento_id;
    @NotBlank(message = "O nome do departamento é obrigatório.")
    private String nomeDoDepartamento;

    public DepartamentoDTO() {
    }

    public DepartamentoDTO(Departamento departamento) {
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
}
