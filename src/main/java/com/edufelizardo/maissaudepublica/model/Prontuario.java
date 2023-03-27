package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
public class Prontuario implements Serializable {
    @Serial
    private static final long serialVersionUID = -4741525783657600813L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prontuario_id", nullable = false)
    private Long prontuario_id;
    private String numeroProntuario;
    @OneToOne(mappedBy = "prontuario")
    private Paciente paciente;
    @OneToOne
    @JoinColumn(name = "prontuario_historico_id")
    private HistoricoMedico historicoMedico;

    public Prontuario() {
    }

    public Prontuario(Long prontuario_id, String numeroProntuario, Paciente paciente, HistoricoMedico historicoMedico) {
        this.prontuario_id = prontuario_id;
        this.numeroProntuario = numeroProntuario;
        this.paciente = paciente;
        this.historicoMedico = historicoMedico;
    }
    public Prontuario(Prontuario prontuario) {
        this.prontuario_id = prontuario.getProntuario_id();
        this.numeroProntuario = prontuario.getNumeroProntuario();
        this.paciente = prontuario.paciente;
        this.historicoMedico = prontuario.getHistoricoMedico();
    }

    public Long getProntuario_id() {
        return prontuario_id;
    }

    public String getNumeroProntuario() {
        return numeroProntuario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public HistoricoMedico getHistoricoMedico() {
        return historicoMedico;
    }

    public void setProntuario_id(Long prontuario_id) {
        this.prontuario_id = prontuario_id;
    }

    public void setNumeroProntuario(Paciente paciente) {
        int area = paciente.getAreaDeCobertura().getArea();
        List<Subarea> microarea = paciente.getAreaDeCobertura().getSubareas();
        int familia = paciente.getFamilia().getNumaroFamilia();
        int pac = paciente.getPosicaoMembro();

        this.numeroProntuario = String.valueOf(area + "." + microarea + "." + familia +"-" + pac);
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setHistoricoMedico(HistoricoMedico historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}
