package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.EscalaTrabalho;
import com.edufelizardo.maissaudepublica.repositories.EscalaDeTrabalhoRepository;

import java.time.LocalTime;

public class TestEscalaTrabalhoUtil {
    public static EscalaTrabalho escalaMatutinoUm(EscalaDeTrabalhoRepository escalaDeTrabalhoRepository) {
        EscalaTrabalho escalaTrabalho1 = new EscalaTrabalho(null, LocalTime.of(7, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(16, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho1);
        return escalaTrabalho1;
    }
    public static EscalaTrabalho escalaMatutinoDois(EscalaDeTrabalhoRepository escalaDeTrabalhoRepository) {
        EscalaTrabalho escalaTrabalho2 = new EscalaTrabalho(null, LocalTime.of(8, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(17, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho2);
        return escalaTrabalho2;
    }
    public static EscalaTrabalho escalaVespertinoUm(EscalaDeTrabalhoRepository escalaDeTrabalhoRepository) {
        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);
        return escalaTrabalho3;
    }
    public static void registraTodasAsEscalasDeTrabalho(EscalaDeTrabalhoRepository escalaDeTrabalhoRepository) {
        EscalaTrabalho escalaTrabalho1 = new EscalaTrabalho(null, LocalTime.of(7, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(16, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho1);

        EscalaTrabalho escalaTrabalho2 = new EscalaTrabalho(null, LocalTime.of(8, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(17, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho2);

        EscalaTrabalho escalaTrabalho3 = new EscalaTrabalho(null, LocalTime.of(10, 00, 00), LocalTime.of(1,00, 00),
                LocalTime.of(19, 00, 00), "Matutino 1");
        escalaDeTrabalhoRepository.save(escalaTrabalho3);
    }
}
