package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.Formacao;

public class FormacaoUtil {
    public Formacao criarFormacaoDTO() {
        Formacao formacao = new Formacao();
        formacao.setNomeFormacao("Medicina");
        return formacao;
    }
}
