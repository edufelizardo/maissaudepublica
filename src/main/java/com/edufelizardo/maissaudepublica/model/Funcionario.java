package com.edufelizardo.maissaudepublica.model;

import com.edufelizardo.maissaudepublica.dto.DepartamentoDTO;
import com.edufelizardo.maissaudepublica.dto.FormacaoDTO;
import com.edufelizardo.maissaudepublica.dto.FuncaoDTO;
import com.edufelizardo.maissaudepublica.dto.ProgramaDeSaudeDTO;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Funcionario implements Serializable {
    @Serial
    private static final long serialVersionUID = -9144264874654870809L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataDeAdmissao;
    private LocalDate dataDeDemissao;
    private String registroProfissional;
    private BigDecimal salario;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    @OneToOne
    @JoinColumn(name = "escala_trabalho_id")
    private EscalaTrabalho escalaTrabalho;
    @OneToOne
    @JoinColumn(name = "formacao_id")
    private Formacao formacao;
    @OneToOne
    @JoinColumn(name = "depart_id")
    private Departamento departamento;
    @OneToOne
    @JoinColumn(name = "funcao_id")
    private Funcao funcao;
    @OneToMany
    @JoinColumn(name = "funcionario_id")
    private Set<ProgramaDeSaude> programaDeSaudes = new HashSet<>();

    public Funcionario() {
    }

    public Funcionario(Long id, LocalDate dataDeAdmissao, LocalDate dataDeDemissao, String registroProfissional,
                       BigDecimal salario, Pessoa pessoa, EscalaTrabalho escalaTrabalho, Formacao formacao,
                       Departamento departamento, Funcao funcao) {
        this.id = id;
        this.dataDeAdmissao = dataDeAdmissao;
        this.dataDeDemissao = dataDeDemissao;
        this.registroProfissional = registroProfissional;
        this.salario = salario;
        this.pessoa = pessoa;
        this.escalaTrabalho = escalaTrabalho;
        this.formacao = formacao;
        this.departamento = departamento;
        this.funcao = funcao;
    }

    public Funcionario(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.dataDeAdmissao = funcionario.getDataDeAdmissao();
        this.dataDeDemissao = funcionario.getDataDeDemissao();
        this.registroProfissional = funcionario.getRegistroProfissional();
        this.salario = funcionario.getSalario();
        this.pessoa = funcionario.getPessoa();
        this.escalaTrabalho = funcionario.getEscalaTrabalho();
        this.formacao = funcionario.getFormacao();
        this.departamento = funcionario.getDepartamento();
        this.funcao = funcionario.getFuncao();
        this.programaDeSaudes = funcionario.getProgramaDeSaudes();
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

    public EscalaTrabalho getEscalaTrabalho() {
        return escalaTrabalho;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public Set<ProgramaDeSaude> getProgramaDeSaudes() {
        return programaDeSaudes;
    }

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public Departamento getDepartamento() {
        return departamento;
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

    public void setEscalaTrabalho(EscalaTrabalho escalaTrabalho) {
        this.escalaTrabalho = escalaTrabalho;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public void setProgramaDeSaudes(Set<ProgramaDeSaude> programaDeSaudes) {
        this.programaDeSaudes = programaDeSaudes;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getDataDeAdmissao(),
                that.getDataDeAdmissao()) && Objects.equals(getDataDeDemissao(),
                that.getDataDeDemissao()) && Objects.equals(getRegistroProfissional(),
                that.getRegistroProfissional()) && Objects.equals(getSalario(),
                that.getSalario()) && Objects.equals(getPessoa(),
                that.getPessoa()) && Objects.equals(getEscalaTrabalho(),
                that.getEscalaTrabalho()) && Objects.equals(getFormacao(),
                that.getFormacao()) && Objects.equals(getDepartamento(),
                that.getDepartamento()) && Objects.equals(getFuncao(),
                that.getFuncao()) && Objects.equals(getProgramaDeSaudes(), that.getProgramaDeSaudes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDataDeAdmissao(), getDataDeDemissao(), getRegistroProfissional(), getSalario(),
                getPessoa(), getEscalaTrabalho(), getFormacao(), getDepartamento(), getFuncao(), getProgramaDeSaudes());
    }

    @Override
    public String toString() {
        return "Funcionario{" + "\n" +
                "id=" + id + "\n" +
                ", Data De Admissao=" + dataDeAdmissao + "\n" +
                ", Data De Demissao=" + dataDeDemissao + "\n" +
                ", Registro Profissional='" + registroProfissional + '\'' + "\n" +
                ", Salario=" + salario + "\n" +
                ", Dados do Profissional=" + pessoa + "\n" +
                ", Escala De Trabalho=" + escalaTrabalho + "\n" +
                ", Formação=" + formacao +
                ", Departamento=" + departamento + "\n" +
                ", Função=" + funcao + "\n" +
                ", Programa De Saùde=" + programaDeSaudes + "\n" +
                '}';
    }
}
