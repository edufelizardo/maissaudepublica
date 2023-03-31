package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class ExameFisico implements Serializable {
    @Serial
    private static final long serialVersionUID = 8358329459435512855L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exameFisico_id;
    private LocalDate data;

    private Double peso;

    private Double altura;

    private Integer pressaoArterialSistolica;

    private Integer pressaoArterialDiastolica;

    private Double temperatura;

    private Double frequenciaCardiaca;

    private Double frequenciaRespiratoria;

    public ExameFisico() {
    }

    public ExameFisico(Long exameFisico_id, LocalDate data, Double peso, Double altura,
                       Integer pressaoArterialSistolica, Integer pressaoArterialDiastolica, Double temperatura,
                       Double frequenciaCardiaca, Double frequenciaRespiratoria) {
        this.exameFisico_id = exameFisico_id;
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterialSistolica = pressaoArterialSistolica;
        this.pressaoArterialDiastolica = pressaoArterialDiastolica;
        this.temperatura = temperatura;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.frequenciaRespiratoria = frequenciaRespiratoria;
    }
    public ExameFisico(ExameFisico fisico) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExameFisico that)) return false;
        return Objects.equals(getExameFisico_id(), that.getExameFisico_id()) && Objects.equals(getData(),
                that.getData()) && Objects.equals(getPeso(), that.getPeso()) && Objects.equals(getAltura(),
                that.getAltura()) && Objects.equals(getPressaoArterialSistolica(),
                that.getPressaoArterialSistolica()) && Objects.equals(getPressaoArterialDiastolica(),
                that.getPressaoArterialDiastolica()) && Objects.equals(getTemperatura(),
                that.getTemperatura()) && Objects.equals(getFrequenciaCardiaca(),
                that.getFrequenciaCardiaca()) && Objects.equals(getFrequenciaRespiratoria(),
                that.getFrequenciaRespiratoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExameFisico_id(), getData(), getPeso(), getAltura(), getPressaoArterialSistolica(),
                getPressaoArterialDiastolica(), getTemperatura(), getFrequenciaCardiaca(), getFrequenciaRespiratoria());
    }

    @Override
    public String toString() {
        return "ExameFisico{" +
                "exameFisico_id=" + exameFisico_id +
                ", data=" + data +
                ", peso=" + peso +
                ", altura=" + altura +
                ", pressaoArterialSistolica=" + pressaoArterialSistolica +
                ", pressaoArterialDiastolica=" + pressaoArterialDiastolica +
                ", temperatura=" + temperatura +
                ", frequenciaCardiaca=" + frequenciaCardiaca +
                ", frequenciaRespiratoria=" + frequenciaRespiratoria +
                '}';
    }
}
