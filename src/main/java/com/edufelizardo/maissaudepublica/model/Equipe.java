package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Equipe implements Serializable {
    @Serial
    private static final long serialVersionUID = 6018457749657075304L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipe_id;
    private String NomeDaEquipe;
    @OneToOne
    @JoinColumn(name = "area_id")
    private AreaDeCobertura regiao;
    @OneToMany
    @JoinColumn(name = "funcionario_area_id")
    private List<Funcionario> funcionarios;

    public Equipe() {
    }

    public Equipe(Long equipe_id, String nomeDaEquipe, AreaDeCobertura regiao, List<Funcionario> funcionarios) {
        this.equipe_id = equipe_id;
        NomeDaEquipe = nomeDaEquipe;
        this.regiao = regiao;
        this.funcionarios = funcionarios;
    }

    public Equipe(Equipe equipe){
        this.equipe_id = equipe.getEquipe_id();
        this.NomeDaEquipe = equipe.getNomeDaEquipe();
        this.regiao = equipe.getRegiao();
        this.funcionarios = equipe.getFuncionarios();
    }

    public Long getEquipe_id() {
        return equipe_id;
    }

    public String getNomeDaEquipe() {
        return NomeDaEquipe;
    }

    public AreaDeCobertura getRegiao() {
        return regiao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setEquipe_id(Long equipe_id) {
        this.equipe_id = equipe_id;
    }

    public void setNomeDaEquipe(String nomeDaEquipe) {
        NomeDaEquipe = nomeDaEquipe;
    }

    public void setRegiao(AreaDeCobertura regiao) {
        this.regiao = regiao;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipe equipe)) return false;
        return Objects.equals(getEquipe_id(), equipe.getEquipe_id()) && Objects.equals(getNomeDaEquipe(),
                equipe.getNomeDaEquipe()) && Objects.equals(getRegiao(),
                equipe.getRegiao()) && Objects.equals(getFuncionarios(), equipe.getFuncionarios());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEquipe_id(), getNomeDaEquipe(), getRegiao(), getFuncionarios());
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "equipe_id=" + equipe_id +
                ", NomeDaEquipe='" + NomeDaEquipe + '\'' +
                ", regiao=" + regiao +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
