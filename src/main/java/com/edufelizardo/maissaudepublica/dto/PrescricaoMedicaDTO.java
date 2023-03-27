package com.edufelizardo.maissaudepublica.dto;

import jakarta.persistence.Column;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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

    public PrescricaoMedicaDTO(PrescricaoMedicaDTO dto) {
        this.prescricaoMedica_id = dto.getPrescricaoMedica_id();
        this.dataDaPrescricao = dto.getDataDaPrescricao();
        this.medicamentos = dto.getMedicamentos();
        this.orientacoes = dto.getOrientacoes();
        this.periodo = dto.getPeriodo();
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
