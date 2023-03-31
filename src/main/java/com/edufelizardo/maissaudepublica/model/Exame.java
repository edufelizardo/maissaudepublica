package com.edufelizardo.maissaudepublica.model;

import com.edufelizardo.maissaudepublica.model.enuns.StatusExame;
import com.edufelizardo.maissaudepublica.model.enuns.TipoDoExame;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Exame implements Serializable {
    @Serial
    private static final long serialVersionUID = -8505716961960224361L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exame_id;
    private TipoDoExame tipoDoExame;
    private LocalDate dataExame;
    private String resultado;
    @OneToMany
    @JoinColumn(name = "exame_resposavel_id")
    private List<Funcionario> funcionario;
    @ManyToMany
    @JoinColumn(name = "exame_unidade_saude_id")
    private List<UnidadeDeSaude> unidadeDeSaude;
    @ElementCollection
    @CollectionTable(name = "custos")
    private List<String> custos;
    private StatusExame statusExame;

    public Exame() {
    }

    public Exame(Long exame_id, TipoDoExame tipoDoExame, LocalDate dataExame, String resultado,
                 List<Funcionario> funcionario, List<UnidadeDeSaude> unidadeDeSaude, List<String> custos,
                 StatusExame statusExame) {
        this.exame_id = exame_id;
        this.tipoDoExame = tipoDoExame;
        this.dataExame = dataExame;
        this.resultado = resultado;
        this.funcionario = funcionario;
        this.unidadeDeSaude = unidadeDeSaude;
        this.custos = custos;
        this.statusExame = statusExame;
    }

    public Exame(Exame exame) {
        this.exame_id = exame.getExame_id();
        this.tipoDoExame = exame.getTipoDoExame();
        this.dataExame = exame.getDataExame();
        this.resultado = exame.getResultado();
        this.funcionario = exame.getFuncionario();
        this.unidadeDeSaude = exame.getUnidadeDeSaude();
        this.custos = exame.getCustos();
        this.statusExame = exame.getStatusExame();
    }

    public Long getExame_id() {
        return exame_id;
    }

    public TipoDoExame getTipoDoExame() {
        return tipoDoExame;
    }

    public LocalDate getDataExame() {
        return dataExame;
    }

    public String getResultado() {
        return resultado;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public List<UnidadeDeSaude> getUnidadeDeSaude() {
        return unidadeDeSaude;
    }

    public List<String> getCustos() {
        return custos;
    }

    public StatusExame getStatusExame() {
        return statusExame;
    }

    public void setExame_id(Long exame_id) {
        this.exame_id = exame_id;
    }

    public void setTipoDoExame(TipoDoExame tipoDoExame) {
        this.tipoDoExame = tipoDoExame;
    }

    public void setDataExame(LocalDate dataExame) {
        this.dataExame = dataExame;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public void setUnidadeDeSaude(List<UnidadeDeSaude> unidadeDeSaude) {
        this.unidadeDeSaude = unidadeDeSaude;
    }

    public void setCustos(List<String> custos) {
        this.custos = custos;
    }

    public void setStatusExame(StatusExame statusExame) {
        this.statusExame = statusExame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exame exame)) return false;
        return Objects.equals(getExame_id(), exame.getExame_id()) && getTipoDoExame() ==
                exame.getTipoDoExame() && Objects.equals(getDataExame(),
                exame.getDataExame()) && Objects.equals(getResultado(),
                exame.getResultado()) && Objects.equals(getFuncionario(),
                exame.getFuncionario()) && Objects.equals(getUnidadeDeSaude(),
                exame.getUnidadeDeSaude()) && Objects.equals(getCustos(),
                exame.getCustos()) && getStatusExame() == exame.getStatusExame();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExame_id(), getTipoDoExame(), getDataExame(), getResultado(), getFuncionario(),
                getUnidadeDeSaude(), getCustos(), getStatusExame());
    }

    @Override
    public String toString() {
        return "Exame{" +
                "exame_id=" + exame_id +
                ", tipoDoExame=" + tipoDoExame +
                ", dataExame=" + dataExame +
                ", resultado='" + resultado + '\'' +
                ", funcionario=" + funcionario +
                ", unidadeDeSaude=" + unidadeDeSaude +
                ", custos=" + custos +
                ", statusExame=" + statusExame +
                '}';
    }
}
