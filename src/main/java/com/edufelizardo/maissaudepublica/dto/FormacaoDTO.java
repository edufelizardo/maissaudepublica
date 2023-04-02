package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Formacao;
import jakarta.validation.constraints.NotBlank;

public class FormacaoDTO {
    private Long nomeDaFormacao_id;
    @NotBlank(message = "O nome da formação é obrigatório")
    private String nomeFormacao;

    public FormacaoDTO() {
    }

    public FormacaoDTO(Formacao formacao) {
        this.nomeDaFormacao_id = formacao.getNomeDaFormacao_id();
        this.nomeFormacao = formacao.getNomeFormacao();
    }

    public Long getNomeDaFormacao_id() {
        return nomeDaFormacao_id;
    }

    public String getNomeFormacao() {
        return nomeFormacao;
    }

    public void setNomeDaFormacao_id(Long nomeDaFormacao_id) {
        this.nomeDaFormacao_id = nomeDaFormacao_id;
    }

    public void setNomeFormacao(String nomeFormacao) {
        this.nomeFormacao = nomeFormacao;
    }
}
