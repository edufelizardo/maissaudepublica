package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.*;
import jakarta.validation.constraints.DecimalMax;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4736104246988594075L;
    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeAdmissao;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeDemissao;
    private String registroProfissional;
    @DecimalMax(value = "1000000.00",
                message = "O salário não pode ser maior do que 1.000.000,00")
    private BigDecimal salario;
    private PessoaDTO pessoa;
    private EscalaTrabalho escalaTrabalho;
    private Formacao formacao;
    private Departamento departamento;
    private Funcao funcao;
    private List<ProgramaDeSaude> programaDeSaudes = new ArrayList<>();

    public FuncionarioDTO() {
    }
    public FuncionarioDTO(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.dataDeAdmissao = funcionario.getDataDeAdmissao();
        this.dataDeDemissao = funcionario.getDataDeDemissao();
        this.registroProfissional = funcionario.getRegistroProfissional();
        this.salario = funcionario.getSalario();
        this.pessoa = new PessoaDTO(funcionario.getPessoa());
        this.escalaTrabalho = funcionario.getEscalaTrabalho();
        this.formacao =funcionario.getFormacao();
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

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public EscalaTrabalho getEscalaTrabalho() {
        return escalaTrabalho;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public List<ProgramaDeSaude> getProgramaDeSaudes() {
        return programaDeSaudes;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEscalaTrabalho(EscalaTrabalho escalaTrabalho) {
        this.escalaTrabalho = escalaTrabalho;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public void setProgramaDeSaudes(List<ProgramaDeSaude> programaDeSaudes) {
        this.programaDeSaudes = programaDeSaudes;
    }
}
