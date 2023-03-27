package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
@Entity
public class PrescricaoMedica implements Serializable {
    @Serial
    private static final long serialVersionUID = -2047307343355538946L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescricaoMedica_id;
    private LocalDate dataDaPrescricao;
    private List<String> medicamentos; //Medicamentos: lista dos medicamentos prescritos, contendo nome, dose e forma de administração
    // Unidade de medida: unidade de medida para a dose dos medicamentos, como mg, mL, comprimidos, etc.
    @Column(columnDefinition = "MEDIUMTEXT")
    private String orientacoes;
    private String periodo;

    public PrescricaoMedica() {
    }

    public PrescricaoMedica(Long encaminhamento_id, LocalDate dataDaPrescricao, List<String> medicamentos,
                          String orientacoes, String periodo) {
        this.prescricaoMedica_id = encaminhamento_id;
        this.dataDaPrescricao = dataDaPrescricao;
        this.medicamentos = medicamentos;
        this.orientacoes = orientacoes;
        this.periodo = periodo;
    }
    public PrescricaoMedica(PrescricaoMedica prescricaoMedica) {
        this.prescricaoMedica_id = prescricaoMedica.getPrescricaoMedica_id();
        this.dataDaPrescricao = prescricaoMedica.getDataDaPrescricao();
        this.medicamentos = prescricaoMedica.getMedicamentos();
        this.orientacoes = prescricaoMedica.getOrientacoes();
        this.periodo = prescricaoMedica.getPeriodo();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrescricaoMedica that)) return false;
        return Objects.equals(getPrescricaoMedica_id(),
                that.getPrescricaoMedica_id()) && Objects.equals(getDataDaPrescricao(),
                that.getDataDaPrescricao()) && Objects.equals(getMedicamentos(),
                that.getMedicamentos()) && Objects.equals(getOrientacoes(),
                that.getOrientacoes()) && Objects.equals(getPeriodo(), that.getPeriodo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrescricaoMedica_id(), getDataDaPrescricao(), getMedicamentos(), getOrientacoes(),
                getPeriodo());
    }
}
