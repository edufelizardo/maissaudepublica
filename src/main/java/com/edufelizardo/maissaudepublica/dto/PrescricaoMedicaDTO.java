package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.PrescricaoMedica;
import jakarta.persistence.Column;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PrescricaoMedicaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -7776829680827944613L;
    private Long prescricaoMedica_id;
    private LocalDate dataDaPrescricao;
    private List<String> medicamentos; //Medicamentos: lista dos medicamentos prescritos, contendo nome, dose e forma de administração
    // Unidade de medida: unidade de medida para a dose dos medicamentos, como mg, mL, comprimidos, etc.
    private String orientacoes;
    private String periodo;

    public PrescricaoMedicaDTO() {
    }

    public PrescricaoMedicaDTO(PrescricaoMedica medica) {
        this.prescricaoMedica_id = medica.getPrescricaoMedica_id();
        this.dataDaPrescricao = medica.getDataDaPrescricao();
        this.medicamentos = medica.getMedicamentos();
        this.orientacoes = medica.getOrientacoes();
        this.periodo = medica.getPeriodo();
    }

    public Long getPrescricaoMedica_id() {
        return prescricaoMedica_id;
    }

    public LocalDate getDataDaPrescricao() {
        return dataDaPrescricao;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public String getOrientacoes() {
        return orientacoes;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPrescricaoMedica_id(Long prescricaoMedica_id) {
        this.prescricaoMedica_id = prescricaoMedica_id;
    }

    public void setDataDaPrescricao(LocalDate dataDaPrescricao) {
        this.dataDaPrescricao = dataDaPrescricao;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void setOrientacoes(String orientacoes) {
        this.orientacoes = orientacoes;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
