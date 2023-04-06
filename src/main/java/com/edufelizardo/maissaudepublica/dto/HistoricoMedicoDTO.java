package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HistoricoMedicoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -3810810986407783323L;
    private Long historicoMedico_id;
    private List<Consulta> consultas = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();
    private List<Tratamento> tratamentos = new ArrayList<>();
    private List<PrescricaoMedica> prescricoesMedicas = new ArrayList<>();
    private List<Encaminhamento> encaminhamentos = new ArrayList<>();

    public HistoricoMedicoDTO() {
    }

    public HistoricoMedicoDTO(HistoricoMedico medico) {
        this.historicoMedico_id = medico.getHistoricoMedico_id();
        this.consultas = medico.getConsultas();
        this.exames = medico.getExames();
        this.tratamentos = medico.getTratamentos();
        this.prescricoesMedicas = medico.getPrescricoesMedicas();
        this.encaminhamentos = medico.getEncaminhamentos();
    }

    public Long getHistoricoMedico_id() {
        return historicoMedico_id;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public List<PrescricaoMedica> getPrescricoesMedicas() {
        return prescricoesMedicas;
    }

    public List<Encaminhamento> getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setHistoricoMedico_id(Long historicoMedico_id) {
        this.historicoMedico_id = historicoMedico_id;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    public void setPrescricoesMedicas(List<PrescricaoMedica> prescricoesMedicas) {
        this.prescricoesMedicas = prescricoesMedicas;
    }

    public void setEncaminhamentos(List<Encaminhamento> encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }
}
