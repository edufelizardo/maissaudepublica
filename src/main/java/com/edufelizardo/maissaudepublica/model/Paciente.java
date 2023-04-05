package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class Paciente implements Serializable {
    @Serial
    private static final long serialVersionUID = -3374011318816833223L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cartaoDoSUS;
    private int posicaoMembro;
    @OneToOne
    @JoinColumn(name = "paciente_prontuario_id")
    private Prontuario prontuario;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;


    public Paciente() {
    }

    public Paciente(Long id, String cartaoDoSUS, int posicaoMembro, Prontuario prontuario, Pessoa pessoa) {
        this.id = id;
        this.cartaoDoSUS = cartaoDoSUS;
        this.posicaoMembro = posicaoMembro;
        this.prontuario = prontuario;
        this.pessoa = pessoa;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setCartaoDoSUS(String cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public void setPosicaoMembro(int posicaoMembro) {
        this.posicaoMembro = posicaoMembro;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return getPosicaoMembro() == paciente.getPosicaoMembro() && Objects.equals(getId(),
                paciente.getId()) && Objects.equals(getCartaoDoSUS(),
                paciente.getCartaoDoSUS()) && Objects.equals(getProntuario(),
                paciente.getProntuario()) && Objects.equals(getPessoa(), paciente.getPessoa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCartaoDoSUS(), getPosicaoMembro(), getProntuario(), getPessoa());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", cartaoDoSUS='" + cartaoDoSUS + '\'' +
                ", posicaoMembro=" + posicaoMembro +
                ", prontuario=" + prontuario +
                ", pessoa=" + pessoa +
                '}';
    }
}
