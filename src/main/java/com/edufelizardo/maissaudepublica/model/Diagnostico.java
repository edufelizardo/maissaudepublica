package com.edufelizardo.maissaudepublica.model;

import com.edufelizardo.maissaudepublica.model.enuns.CID;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Diagnostico implements Serializable {
    @Serial
    private static final long serialVersionUID = -3560923521475278445L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diagnostico_id;
    private CID cid;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String observacoes;

    public Diagnostico() {
    }

    public Diagnostico(Long diagnostico_id, CID cid, String observacoes) {
        this.diagnostico_id = diagnostico_id;
        this.cid = cid;
        this.observacoes = observacoes;
    }
    public Diagnostico(Diagnostico diagnostico) {
        this.diagnostico_id = diagnostico.getDiagnostico_id();
        this.cid = diagnostico.getCid();
        this.observacoes = diagnostico.getObservacoes();
    }

    public Long getDiagnostico_id() {
        return diagnostico_id;
    }

    public CID getCid() {
        return cid;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setDiagnostico_id(Long diagnostico_id) {
        this.diagnostico_id = diagnostico_id;
    }

    public void setCid(CID cid) {
        this.cid = cid;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diagnostico that)) return false;
        return Objects.equals(getDiagnostico_id(), that.getDiagnostico_id()) && getCid() ==
                that.getCid() && Objects.equals(getObservacoes(), that.getObservacoes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiagnostico_id(), getCid(), getObservacoes());
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "diagnostico_id=" + diagnostico_id +
                ", cid=" + cid +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
