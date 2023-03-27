package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Pessoa;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PessoaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -631854973249151243L;
    private Long id;
    @NotBlank(message = "O nome deve ser preenchido.")
    private String nomeCompleto;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeNascimento;
    private int idade;
    @CPF(message = "Deve ser informado um CPF valido")
    private String cpf;
    @Email(message = "O E-Mail deve ser preenchido no formato específico.")
    private String email;
    @Pattern(regexp = "^\\([1-9]{2}\\) 9?[6-9][0-9]{3}\\-[0-9]{4}$",
            message = "Telefone celular inválido")
    private Set<String> telefones = new HashSet<>();
    private EnderecoDTO endereco;

    public PessoaDTO() {
    }

    public PessoaDTO(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nomeCompleto = pessoa.getNomeCompleto();
        this.dataDeNascimento = pessoa.getDataDeNascimento();
        this.idade = pessoa.getIdade();
        this.cpf = pessoa.getCpf();
        this.telefones = pessoa.getTelefones();
        this.email = pessoa.getEmail();
        this.endereco = new EnderecoDTO(pessoa.getEndereco());
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefones(Set<String> telefones) {
        this.telefones = telefones;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
