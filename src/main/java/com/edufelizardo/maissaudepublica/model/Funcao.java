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
    private Long nomeFuncao_id;
    @NotBlank(message = "O nome da função é obrigatório.")
    private String nomeFuncao;

    public Funcao() {
    }

    public Funcao(Long nomeFuncao_id, String nomeFuncao) {
        this.nomeFuncao_id = nomeFuncao_id;
        this.nomeFuncao = nomeFuncao;
    }
    public  Funcao(Funcao funcao) {
        this.nomeFuncao_id = funcao.getNomeFuncao_id();
        this.nomeFuncao = funcao.getNomeFuncao();
    }

    public Long getNomeFuncao_id() {
        return nomeFuncao_id;
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setNomeFuncao_id(Long nomeFuncao_id) {
        this.nomeFuncao_id = nomeFuncao_id;
    }

    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcao funcao)) return false;
        return Objects.equals(getNomeFuncao_id(),
                funcao.getNomeFuncao_id()) && Objects.equals(getNomeFuncao(), funcao.getNomeFuncao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeFuncao_id(), getNomeFuncao());
    }

    @Override
    public String toString() {
        return "Funcao{" +
                "nomeFuncao_id=" + nomeFuncao_id +
                ", nomeFuncao='" + nomeFuncao + '\'' +
                '}';
    }
}
