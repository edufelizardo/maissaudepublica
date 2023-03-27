package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Funcionario;
import com.edufelizardo.maissaudepublica.model.UnidadeDeSaude;
import com.edufelizardo.maissaudepublica.model.enuns.StatusExame;
import com.edufelizardo.maissaudepublica.model.enuns.TipoDoExame;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ExameDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -8007614504132478171L;
    private Long exame_id;
    private TipoDoExame tipoDoExame;
    private LocalDate dataExame;
    private String resultado;
    private List<Funcionario> funcionario;
    private List<UnidadeDeSaude> unidadeDeSaude;
    private List<String> custos;
    private StatusExame statusExame;

    public ExameDTO() {
    }

    public ExameDTO(ExameDTO dto) {
        this.exame_id = dto.getExame_id();
        this.tipoDoExame = dto.getTipoDoExame();
        this.dataExame = dto.getDataExame();
        this.resultado = dto.getResultado();
        this.funcionario = dto.getFuncionario();
        this.unidadeDeSaude = dto.getUnidadeDeSaude();
        this.custos = dto.getCustos();
        this.statusExame = dto.getStatusExame();
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
}
