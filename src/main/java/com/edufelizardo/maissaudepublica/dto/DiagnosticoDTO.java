package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Diagnostico;
import com.edufelizardo.maissaudepublica.model.enuns.CID;

import java.io.Serial;
import java.io.Serializable;

public class DiagnosticoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -2434613507778038417L;
    private Long diagnostico_id;
    private CID cid;
    private String observacoes;

    public DiagnosticoDTO() {
    }

    public DiagnosticoDTO(Diagnostico diagnostico) {
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
}