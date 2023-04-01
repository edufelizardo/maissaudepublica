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
public class Funcao implements Serializable {
    @Serial
    private static final long serialVersionUID = 2163996507359746686L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long funcao_id;
    @NotBlank(message = "O nome da função é obrigatório.")
    private String nomeFuncao;

    public Funcao() {
    }

    public Funcao(Long funcao_id, String nomeFuncao) {
        this.funcao_id = funcao_id;
        this.nomeFuncao = nomeFuncao;
    }
    public Funcao(Funcao funcao) {
        this.funcao_id = funcao_id;
        this.nomeFuncao = nomeFuncao;
    }

    public Long getFuncao_id() {
        return funcao_id;
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setFuncao_id(Long funcao_id) {
        this.funcao_id = funcao_id;
    }

    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcao funcao)) return false;
        return Objects.equals(getFuncao_id(), funcao.getFuncao_id()) && Objects.equals(getNomeFuncao(), funcao.getNomeFuncao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFuncao_id(), getNomeFuncao());
    }

    @Override
    public String toString() {
        return "Funcao{" +
                "funcao_id=" + funcao_id +
                ", nomeFuncao='" + nomeFuncao + '\'' +
                '}';
    }
}
