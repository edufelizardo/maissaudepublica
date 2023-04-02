package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Funcao;
import jakarta.validation.constraints.NotBlank;

public class FuncaoDTO {
    private Long funcao_id;
    @NotBlank(message = "O nome da função é obrigatório.")
    private String nomeFuncao;

    public FuncaoDTO() {
    }

    public FuncaoDTO(Funcao funcao) {
        this.funcao_id = funcao.getFuncao_id();
        this.nomeFuncao = funcao.getNomeFuncao();
    }

    public Long getFuncao_id() {
        return funcao_id;
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setFuncao_id(Long funcao_id) {
        this.funcao_id = funcao_id;
    }

    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }
}
