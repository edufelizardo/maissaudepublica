package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.FuncaoDTO;

public class FuncaoUtil {
    public FuncaoDTO criarFuncaoMedicoDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Médico(a) Clinico Geral");
        return dto;
    }
    public FuncaoDTO criarFuncaoEnfermeiroDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Enfermeiro(a)");
        return dto;
    }
    public FuncaoDTO criarFuncaoTecnicoDeEnfermagemDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Técnico(a) de Enfermagem");
        return dto;
    }
    public FuncaoDTO criarFuncaoAssistenteSocialDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Assistente Social");
        return dto;
    }
    public FuncaoDTO criarFuncaoPsicologoDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Psicólogo(a)");
        return dto;
    }
    public FuncaoDTO criarFuncaoNutricionistaDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Nutricionista");
        return dto;
    }
    public FuncaoDTO criarFuncaoFisioterapeutaDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Fisioterapeuta");
        return dto;
    }
    public FuncaoDTO criarFuncaoTerapeutaOcupacionalDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Terapeuta Ocupacional");
        return dto;
    }
    public FuncaoDTO criarFuncaoFonodiologoDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Fonoaudiólogo(a)");
        return dto;
    }
    public FuncaoDTO criarFuncaoAuxiliaradministrativoDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Auxiliar Administrativo");
        return dto;
    }
    public FuncaoDTO criarFuncaoAssisteteAdministrativoDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Assistente Administrativo");
        return dto;
    }
    public FuncaoDTO criarFuncaoRecepcionistaDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Recepcionista");
        return dto;
    }
    public FuncaoDTO criarFuncaoMotoristaDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Motorista");
        return dto;
    }
    public FuncaoDTO criarFuncaoAuxiliarDeLimpezaDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Auxiliar de Limpeza");
        return dto;
    }
    public FuncaoDTO criarFuncaoSegurancaDTO() {
        FuncaoDTO dto = new FuncaoDTO();
        dto.setNomeFuncao("Segurança");
        return dto;
    }
}
