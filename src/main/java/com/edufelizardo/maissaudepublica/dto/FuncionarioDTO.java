package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Endereco;
import com.edufelizardo.maissaudepublica.model.Funcionario;
import com.edufelizardo.maissaudepublica.model.Pessoa;
import jakarta.validation.constraints.DecimalMax;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4736104246988594075L;
    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeAdmissao;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String registroProfissional;
    @DecimalMax(value = "1000000.00",
                message = "O salário não pode ser maior do que 1.000.000,00")
    private BigDecimal salario;
    private PessoaDTO pessoa;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Long id, LocalDate dataDeAdmissao, String registroProfissional,
                          BigDecimal salario, PessoaDTO pessoaDTO) {
        this.id = id;
        this.dataDeAdmissao = dataDeAdmissao;
        this.registroProfissional = registroProfissional;
        this.salario = salario;
        this.pessoa = pessoaDTO;
    }
    public FuncionarioDTO(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.dataDeAdmissao = funcionario.getDataDeAdmissao();
        this.registroProfissional = funcionario.getRegistroProfissional();
        this.salario = funcionario.getSalario();
        this.pessoa = new PessoaDTO(funcionario.getPessoa());
    }

    public FuncionarioDTO(Funcionario funcionario, Pessoa pessoa, Endereco endereco) {

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

    public PessoaDTO getPessoa() {
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

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
