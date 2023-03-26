package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Paciente;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.io.Serial;
import java.io.Serializable;

public class PacienteDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 2047891309263497593L;
    private Long id;
    @Pattern(regexp = "\\d{4}\\.\\d{4}\\.\\d{4}\\.\\d{4}",
            message = "Digitar um formato valido para CNS")
    @NotBlank(message = "O CNS deve ser preenchido.")
    private String cartaoDoSUS;
    private String historicoMedico; // ver como vai fazer com isso
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaDTO pessoa;

    public PacienteDTO() {
    }

    public PacienteDTO(Long id, String cartaoDoSUS, String historicoMedico, PessoaDTO pessoa) {
        this.id = id;
        this.cartaoDoSUS = cartaoDoSUS;
        this.historicoMedico = historicoMedico;
        this.pessoa = pessoa;
    }
    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.cartaoDoSUS = paciente.getCartaoDoSUS();
        this.historicoMedico = paciente.getHistoricoMedico();
        this.pessoa = new PessoaDTO(paciente.getPessoa());
    }

    public Long getId() {
        return id;
    }

    public String getCartaoDoSUS() {
        return cartaoDoSUS;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setCartaoDoSUS(String cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }
}
