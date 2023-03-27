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
    @OneToOne
    @JoinColumn(name = "pessoa_da_familia_id")
    private Familia familia;
    @OneToOne
    @JoinColumn(name = "paciente_area_id")
    private AreaDeCobertura areaDeCobertura;

    public Paciente() {
    }

    public Paciente(Long id, String cartaoDoSUS, int posicaoMembro, Prontuario prontuario, Pessoa pessoa,
                    Familia familia, AreaDeCobertura areaDeCobertura) {
        this.id = id;
        this.cartaoDoSUS = cartaoDoSUS;
        this.posicaoMembro = posicaoMembro;
        this.prontuario = prontuario;
        this.pessoa = pessoa;
        this.familia = familia;
        this.areaDeCobertura = areaDeCobertura;
    }

    public Paciente(Paciente paciente) {
        this.id = paciente.getId();
        this.cartaoDoSUS = paciente.getCartaoDoSUS();
        this.posicaoMembro = paciente.getPosicaoMembro();
        this.prontuario = paciente.getProntuario();
        this.pessoa = paciente.getPessoa();
        this.familia = paciente.getFamilia();
        this.areaDeCobertura = paciente.getAreaDeCobertura();
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

    public Familia getFamilia() {
        return familia;
    }

    public AreaDeCobertura getAreaDeCobertura() {
        return areaDeCobertura;
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

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public void setAreaDeCobertura(AreaDeCobertura areaDeCobertura) {
        this.areaDeCobertura = areaDeCobertura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return getPosicaoMembro() == paciente.getPosicaoMembro() && Objects.equals(getId(),
                paciente.getId()) && Objects.equals(getCartaoDoSUS(),
                paciente.getCartaoDoSUS()) && Objects.equals(getProntuario(),
                paciente.getProntuario()) && Objects.equals(getPessoa(),
                paciente.getPessoa()) && Objects.equals(getFamilia(),
                paciente.getFamilia()) && Objects.equals(getAreaDeCobertura(), paciente.getAreaDeCobertura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCartaoDoSUS(), getPosicaoMembro(), getProntuario(), getPessoa(), getFamilia(), getAreaDeCobertura());
    }
}
