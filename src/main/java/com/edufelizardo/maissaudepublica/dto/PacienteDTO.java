package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.Familia;
import com.edufelizardo.maissaudepublica.model.Paciente;
import com.edufelizardo.maissaudepublica.model.Prontuario;
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
    private int posicaoMembro;
    private Prontuario prontuario;
    private PessoaDTO pessoa;
    private FamiliaDTO familiaDTO;
    private AreaDeCoberturaDTO areaDeCoberturaDTO;

    public PacienteDTO() {
    }

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.cartaoDoSUS = paciente.getCartaoDoSUS();
        this.posicaoMembro = paciente.getPosicaoMembro();
        this.prontuario = paciente.getProntuario();
        this.pessoa = new PessoaDTO(paciente.getPessoa());
        this.familiaDTO = new FamiliaDTO(paciente.getFamilia());
        this.areaDeCoberturaDTO = new AreaDeCoberturaDTO(paciente.getAreaDeCobertura());
    }

    public Long getId() {
        return id;
    }

    public String getCartaoDoSUS() {
        return cartaoDoSUS;
    }

    public int getPosicaoMembro() {
        return posicaoMembro;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public FamiliaDTO getFamiliaDTO() {
        return familiaDTO;
    }

    public AreaDeCoberturaDTO getAreaDeCoberturaDTO() {
        return areaDeCoberturaDTO;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCartaoDoSUS(String cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public void setPosicaoMembro(int posicaoMembro) {
        this.posicaoMembro = posicaoMembro;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void setFamiliaDTO(FamiliaDTO familiaDTO) {
        this.familiaDTO = familiaDTO;
    }

    public void setAreaDeCoberturaDTO(AreaDeCoberturaDTO areaDeCoberturaDTO) {
        this.areaDeCoberturaDTO = areaDeCoberturaDTO;
    }
}
