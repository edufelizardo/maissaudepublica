package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.EscalaTrabalho;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EscalaDeTrabalhoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 5997928533980222944L;
    private Long escalaDeTrabalho_id;
    private LocalTime inicioDoExpediente;
    private LocalTime horarioAlmoco;
    private LocalTime fimDoExpediente;
    private String nomeDoExpediente;

    public EscalaDeTrabalhoDTO() {
    }

    public EscalaDeTrabalhoDTO(EscalaTrabalho trabalho) {
        this.escalaDeTrabalho_id = trabalho.getEscalaDeTrabalho_id();
        this.inicioDoExpediente = trabalho.getInicioDoExpediente();
        this.horarioAlmoco = trabalho.getHorarioAlmoco();
        this.fimDoExpediente = trabalho.getFimDoExpediente();
        this.nomeDoExpediente = trabalho.getNomeDoExpediente();
    }

    public Long getEscalaDeTrabalho_id() {
        return escalaDeTrabalho_id;
    }

    public LocalTime getInicioDoExpediente() {
        return inicioDoExpediente;
    }

    public LocalTime getHorarioAlmoco() {
        return horarioAlmoco;
    }

    public LocalTime getFimDoExpediente() {
        return fimDoExpediente;
    }

    public String getNomeDoExpediente() {
        return nomeDoExpediente;
    }

    public void setEscalaDeTrabalho_id(Long escalaDeTrabalho_id) {
        this.escalaDeTrabalho_id = escalaDeTrabalho_id;
    }

    public void setInicioDoExpediente(LocalTime inicioDoExpediente) {
        this.inicioDoExpediente = inicioDoExpediente;
    }

    public void setHorarioAlmoco(LocalTime horarioAlmoco) {
        this.horarioAlmoco = horarioAlmoco;
    }

    public void setFimDoExpediente(LocalTime fimDoExpediente) {
        this.fimDoExpediente = fimDoExpediente;
    }

    public void setNomeDoExpediente(String nomeDoExpediente) {
        this.nomeDoExpediente = nomeDoExpediente;
    }
}
