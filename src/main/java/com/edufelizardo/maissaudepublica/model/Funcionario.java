package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Funcionario implements Serializable {
    @Serial
    private static final long serialVersionUID = -9144264874654870809L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeAdmissao;
    private String registroProfissional;
    private BigDecimal salario;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
//    private EscalaTrabalho escalaTrabalho;
//    private Formacao formacao;
//    private Funcao funcao;
//    private List<ProgramaDeSaude> programaDeSaudes = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(Long id, LocalDate dataDeAdmissao, String registroProfissional, BigDecimal salario, Pessoa pessoa) {
        this.id = id;
        this.dataDeAdmissao = dataDeAdmissao;
        this.registroProfissional = registroProfissional;
        this.salario = salario;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
