package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.ExameFisico;
import com.edufelizardo.maissaudepublica.model.enuns.CID;
import jakarta.persistence.Column;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class ExameFisicoDTO implements Serializable{
    @Serial
    private static final long serialVersionUID = 3359414455466622478L;
    private Long exameFisico_id;
    private LocalDate data;

    private Double peso;

    private Double altura;

    private Integer pressaoArterialSistolica;

    private Integer pressaoArterialDiastolica;

    private Double temperatura;

    private Double frequenciaCardiaca;

    private Double frequenciaRespiratoria;

    public ExameFisicoDTO() {
    }

    public ExameFisicoDTO(ExameFisico fisico) {
        this.exameFisico_id = fisico.getExameFisico_id();
        this.data = fisico.getData();
        this.peso = fisico.getPeso();
        this.altura = fisico.getAltura();
        this.pressaoArterialSistolica = fisico.getPressaoArterialSistolica();
        this.pressaoArterialDiastolica = fisico.getPressaoArterialDiastolica();
        this.temperatura = fisico.getTemperatura();
        this.frequenciaCardiaca = fisico.getFrequenciaCardiaca();
        this.frequenciaRespiratoria = fisico.getFrequenciaRespiratoria();
    }

    public Long getExameFisico_id() {
        return exameFisico_id;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Integer getPressaoArterialSistolica() {
        return pressaoArterialSistolica;
    }

    public Integer getPressaoArterialDiastolica() {
        return pressaoArterialDiastolica;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public Double getFrequenciaRespiratoria() {
        return frequenciaRespiratoria;
    }

    public void setExameFisico_id(Long exameFisico_id) {
        this.exameFisico_id = exameFisico_id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPressaoArterialSistolica(Integer pressaoArterialSistolica) {
        this.pressaoArterialSistolica = pressaoArterialSistolica;
    }

    public void setPressaoArterialDiastolica(Integer pressaoArterialDiastolica) {
        this.pressaoArterialDiastolica = pressaoArterialDiastolica;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public void setFrequenciaCardiaca(Double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public void setFrequenciaRespiratoria(Double frequenciaRespiratoria) {
        this.frequenciaRespiratoria = frequenciaRespiratoria;
    }
}