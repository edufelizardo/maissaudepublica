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

    public Paciente() {
    }

    public Paciente(Long id, String cartaoDoSUS, String historicoMedico, Pessoa pessoa) {
        this.id = id;
        this.cartaoDoSUS = cartaoDoSUS;
        this.historicoMedico = historicoMedico;
        this.pessoa = pessoa;
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

    public void setCartaoDoSUS(String cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return Objects.equals(getId(), paciente.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
