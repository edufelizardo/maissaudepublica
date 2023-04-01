package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.EscalaDeTrabalhoDTO;

import java.time.LocalTime;

public class EscalaDeTrabalhoUtil {
    public EscalaDeTrabalhoDTO criarEscalaDeTrabalhoDTO() {
        EscalaDeTrabalhoDTO dto = new EscalaDeTrabalhoDTO();
        dto.setInicioDoExpediente(LocalTime.of(8,0));
        dto.setHorarioAlmoco(LocalTime.of(1,0));
        dto.setFimDoExpediente(LocalTime.of(17,0));
        dto.setNomeDoExpediente("Vespertino Primeiro Horario");
        return dto;
    }
}
