package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.Equipe;
import com.edufelizardo.maissaudepublica.model.Funcionario;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class EquipeDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -2334956366408780270L;
    private Long equipe_id;
    private String NomeDaEquipe;
    private AreaDeCobertura regiao;
    private List<Funcionario> funcionarios;

    public EquipeDTO() {
    }

    public EquipeDTO(Equipe equipe) {
        this.equipe_id = equipe.getEquipe_id();
        NomeDaEquipe = equipe.getNomeDaEquipe();
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
}
