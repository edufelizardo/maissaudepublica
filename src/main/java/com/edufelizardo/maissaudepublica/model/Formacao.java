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
public class Formacao implements Serializable {
    @Serial
    private static final long serialVersionUID = 5245561787671317021L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nomeDaFormacao_id;
    @NotBlank(message = "O nome da formação é obrigatório")
    private String nomeFormacao;

    public Formacao() {
    }

    public Formacao(Long nomeDaFormacao_id, String nomeFormacao) {
        this.nomeDaFormacao_id = nomeDaFormacao_id;
        this.nomeFormacao = nomeFormacao;
    }
    public Formacao(Formacao formacao) {
        this.nomeDaFormacao_id = formacao.getNomeDaFormacao_id();
        this.nomeFormacao = formacao.getNomeFormacao();
    }

    public Long getNomeDaFormacao_id() {
        return nomeDaFormacao_id;
    }

    public String getNomeFormacao() {
        return nomeFormacao;
    }

    public void setNomeDaFormacao_id(Long nomeDaFormacao_id) {
        this.nomeDaFormacao_id = nomeDaFormacao_id;
    }

    public void setNomeFormacao(String nomeFormacao) {
        this.nomeFormacao = nomeFormacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Formacao formacao)) return false;
        return Objects.equals(getNomeDaFormacao_id(),
                formacao.getNomeDaFormacao_id()) && Objects.equals(getNomeFormacao(), formacao.getNomeFormacao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeDaFormacao_id(), getNomeFormacao());
    }

    @Override
    public String toString() {
        return "Formacao{" +
                "nomeDaFormacao_id=" + nomeDaFormacao_id +
                ", nomeFormacao='" + nomeFormacao + '\'' +
                '}';
    }
}
