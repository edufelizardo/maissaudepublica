package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.EscalaDeTrabalhoDTO;

import java.time.LocalTime;

public class EscalaDeTrabalhoUtil {
    public EscalaDeTrabalhoDTO criarEDTMatutinoUmDTO() {
        EscalaDeTrabalhoDTO dto = new EscalaDeTrabalhoDTO();
        dto.setInicioDoExpediente(LocalTime.of(7,0));
        dto.setHorarioAlmoco(LocalTime.of(1,0));
        dto.setFimDoExpediente(LocalTime.of(16,0));
        dto.setNomeDoExpediente("Matutino 1");
        return dto;
    }
    public EscalaDeTrabalhoDTO criarEDTMatutinoDoisDTO() {
        EscalaDeTrabalhoDTO dto = new EscalaDeTrabalhoDTO();
        dto.setInicioDoExpediente(LocalTime.of(8,0));
        dto.setHorarioAlmoco(LocalTime.of(1,0));
        dto.setFimDoExpediente(LocalTime.of(17,0));
        dto.setNomeDoExpediente("Matutino 2");
        return dto;
    }
    public EscalaDeTrabalhoDTO criarEDTVespertinoUmDTO() {
        EscalaDeTrabalhoDTO dto = new EscalaDeTrabalhoDTO();
        dto.setInicioDoExpediente(LocalTime.of(10,0));
        dto.setHorarioAlmoco(LocalTime.of(1,0));
        dto.setFimDoExpediente(LocalTime.of(19,0));
        dto.setNomeDoExpediente("Vespertino 1");
        return dto;
    }
}
