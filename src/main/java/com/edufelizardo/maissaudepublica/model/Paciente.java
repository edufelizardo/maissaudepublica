package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;
@Entity
public class Paciente implements Serializable {
    @Serial
    private static final long serialVersionUID = -3374011318816833223L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cartaoDoSUS;
    private String historicoMedico; // ver como vai fazer com isso
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    @OneToOne
    @JoinColumn(name = "pessoa_da_familia_id")
    private Familia familia;

    public Paciente() {
    }

    public Paciente(Long id, String cartaoDoSUS, String historicoMedico, Pessoa pessoa, Familia familia) {
        this.id = id;
        this.cartaoDoSUS = cartaoDoSUS;
        this.historicoMedico = historicoMedico;
        this.pessoa = pessoa;
        this.familia = familia;
    }
    public Paciente(Paciente paciente) {
        this.id = paciente.getId();
        this.cartaoDoSUS = paciente.getCartaoDoSUS();
        this.historicoMedico = paciente.getHistoricoMedico();
        this.pessoa = paciente.getPessoa();
        this.familia = paciente.getFamilia();
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setCartaoDoSUS(String cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return Objects.equals(getId(), paciente.getId()) && Objects.equals(getCartaoDoSUS(),
                paciente.getCartaoDoSUS()) && Objects.equals(getHistoricoMedico(),
                paciente.getHistoricoMedico()) && Objects.equals(getPessoa(),
                paciente.getPessoa()) && Objects.equals(getFamilia(), paciente.getFamilia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCartaoDoSUS(), getHistoricoMedico(), getPessoa(), getFamilia());
    }
}
