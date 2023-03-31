package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
@Entity
public class EscalaTrabalho implements Serializable {

    @Serial
    private static final long serialVersionUID = -6663876878198115877L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long escalaDeTrabalho_id;
    private LocalTime inicioDoExpediente;
    private LocalTime horarioAlmoco;
    private LocalTime fimDoExpediente;
    @NotBlank(message = "O nome do expediente é obrigatório.")
    private String nomeDoExpediente;

    public EscalaTrabalho() {
    }

    public EscalaTrabalho(Long escalaDeTrabalho_id, LocalTime inicioDoExpediente, LocalTime horarioAlmoco,
                          LocalTime fimDoExpediente, String nomeDoExpediente) {
        this.escalaDeTrabalho_id = escalaDeTrabalho_id;
        this.inicioDoExpediente = inicioDoExpediente;
        this.horarioAlmoco = horarioAlmoco;
        this.fimDoExpediente = fimDoExpediente;
        this.nomeDoExpediente = nomeDoExpediente;
    }
    public EscalaTrabalho(EscalaTrabalho escalaTrabalho) {
        this.escalaDeTrabalho_id = escalaTrabalho.getEscalaDeTrabalho_id();
        this.inicioDoExpediente = escalaTrabalho.getInicioDoExpediente();
        this.horarioAlmoco = escalaTrabalho.getHorarioAlmoco();
        this.fimDoExpediente = escalaTrabalho.getFimDoExpediente();
        this.nomeDoExpediente = escalaTrabalho.getNomeDoExpediente();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EscalaTrabalho that)) return false;
        return Objects.equals(getEscalaDeTrabalho_id(),
                that.getEscalaDeTrabalho_id()) && Objects.equals(getInicioDoExpediente(),
                that.getInicioDoExpediente()) && Objects.equals(getHorarioAlmoco(),
                that.getHorarioAlmoco()) && Objects.equals(getFimDoExpediente(),
                that.getFimDoExpediente()) && Objects.equals(getNomeDoExpediente(), that.getNomeDoExpediente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEscalaDeTrabalho_id(), getInicioDoExpediente(), getHorarioAlmoco(),
                getFimDoExpediente(), getNomeDoExpediente());
    }

    @Override
    public String toString() {
        return "EscalaTrabalho{" +
                "escalaDeTrabalho_id=" + escalaDeTrabalho_id +
                ", inicioDoExpediente=" + inicioDoExpediente +
                ", horarioAlmoco=" + horarioAlmoco +
                ", fimDoExpediente=" + fimDoExpediente +
                ", nomeDoExpediente='" + nomeDoExpediente + '\'' +
                '}';
    }
}
