package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.HistoricoMedico;
import com.edufelizardo.maissaudepublica.model.Paciente;
import com.edufelizardo.maissaudepublica.model.Prontuario;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serial;
import java.io.Serializable;

public class ProntuarioDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 6545513422259181802L;
    private Long prontuario_id;
    private String numeroProntuario;
    private Paciente paciente;
    private HistoricoMedico historicoMedico;

    public ProntuarioDTO() {
    }

    public ProntuarioDTO(Prontuario prontuario) {
        this.prontuario_id = prontuario.getProntuario_id();
        this.numeroProntuario = prontuario.getNumeroProntuario();
        this.paciente = prontuario.getPaciente();
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

    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setHistoricoMedico(HistoricoMedico historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}
