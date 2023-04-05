package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.Funcao;
import com.edufelizardo.maissaudepublica.repositories.FuncaoRepository;

public class TestFuncaoUtil {
    public static Funcao registrarFuncaoMedico(FuncaoRepository funcaoRepository) {
        Funcao funcao1 = new Funcao(null, "Médico(a)");
        funcaoRepository.save(funcao1);
        return funcao1;
    }
    public static Funcao registrarFuncaoEnfermeiro(FuncaoRepository funcaoRepository) {
        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);
        return funcao2;
    }
    public static Funcao registrarFuncaoTecnicoDeEnfermagem(FuncaoRepository funcaoRepository) {
        Funcao funcao3 = new Funcao(null, "Técnico(a) de Enfermagem");
        funcaoRepository.save(funcao3);
        return funcao3;
    }
    public static Funcao registrarFuncaoAssistenteSocial(FuncaoRepository funcaoRepository) {
        Funcao funcao4 = new Funcao(null, "Assistente Social");
        funcaoRepository.save(funcao4);
        return funcao4;
    }
    public static Funcao registrarFuncaoPsicologo(FuncaoRepository funcaoRepository) {
        Funcao funcao5 = new Funcao(null, "Psicólogo(a)");
        funcaoRepository.save(funcao5);
        return funcao5;
    }
    public static Funcao registrarFuncaoNutricionista(FuncaoRepository funcaoRepository) {
        Funcao funcao6 = new Funcao(null, "Nutricionista");
        funcaoRepository.save(funcao6);
        return funcao6;
    }
    public static Funcao registrarFuncaoFisioterapeuta(FuncaoRepository funcaoRepository) {
        Funcao funcao7 = new Funcao(null, "Fisioterapeuta");
        funcaoRepository.save(funcao7);
        return funcao7;
    }
    public static Funcao registrarFuncaoTerapeutaOcupacional(FuncaoRepository funcaoRepository) {
        Funcao funcao8 = new Funcao(null, "Terapeuta Ocupacional");
        funcaoRepository.save(funcao8);
        return funcao8;
    }
    public static Funcao registrarFuncaoFonoaudiologo(FuncaoRepository funcaoRepository) {
        Funcao funcao9 = new Funcao(null, "Fonoaudiólogo(a)");
        funcaoRepository.save(funcao9);
        return funcao9;
    }
    public static Funcao registrarFuncaoAuxiliarAdministrativo(FuncaoRepository funcaoRepository) {
        Funcao funcao10 = new Funcao(null, "Auxiliar Administrativo");
        funcaoRepository.save(funcao10);
        return funcao10;
    }
    public static Funcao registrarFuncaoAssistenteAdministrativo(FuncaoRepository funcaoRepository) {
        Funcao funcao11 = new Funcao(null, "Assistente Administrativo");
        funcaoRepository.save(funcao11);
        return funcao11;
    }
    public static Funcao registrarFuncaoRecepcionista(FuncaoRepository funcaoRepository) {
        Funcao funcao12 = new Funcao(null, "Recepcionista");
        funcaoRepository.save(funcao12);
        return funcao12;
    }
    public static Funcao registrarFuncaoMotorista(FuncaoRepository funcaoRepository) {
        Funcao funcao13 = new Funcao(null, "Motorista");
        funcaoRepository.save(funcao13);
        return funcao13;
    }
    public static Funcao registrarFuncaoAuxiliarDeLimpeza(FuncaoRepository funcaoRepository) {
        Funcao funcao14 = new Funcao(null, "Auxiliar de Limpeza");
        funcaoRepository.save(funcao14);
        return funcao14;
    }
    public static Funcao registrarFuncaoSeguranca(FuncaoRepository funcaoRepository) {
        Funcao funcao15 = new Funcao(null, "Segurança");
        funcaoRepository.save(funcao15);
        return funcao15;
    }
    public static Funcao registrarFuncaoDentista(FuncaoRepository funcaoRepository) {
        Funcao funcao16 = new Funcao(null, "Dentista");
        funcaoRepository.save(funcao16);
        return funcao16;
    }
    public static void registrarTodasAsFuncoes(FuncaoRepository funcaoRepository) {
        Funcao funcao1 = new Funcao(null, "Médico(a)");
        funcaoRepository.save(funcao1);

        Funcao funcao2 = new Funcao(null, "Enfermeiro(a)");
        funcaoRepository.save(funcao2);

        Funcao funcao3 = new Funcao(null, "Técnico(a) de Enfermagem");
        funcaoRepository.save(funcao3);

        Funcao funcao4 = new Funcao(null, "Assistente Social");
        funcaoRepository.save(funcao4);

        Funcao funcao5 = new Funcao(null, "Psicólogo(a)");
        funcaoRepository.save(funcao5);

        Funcao funcao6 = new Funcao(null, "Nutricionista");
        funcaoRepository.save(funcao6);

        Funcao funcao7 = new Funcao(null, "Fisioterapeuta");
        funcaoRepository.save(funcao7);

        Funcao funcao8 = new Funcao(null, "Terapeuta Ocupacional");
        funcaoRepository.save(funcao8);

        Funcao funcao9 = new Funcao(null, "Fonoaudiólogo(a)");
        funcaoRepository.save(funcao9);

        Funcao funcao10 = new Funcao(null, "Auxiliar Administrativo");
        funcaoRepository.save(funcao10);

        Funcao funcao11 = new Funcao(null, "Assistente Administrativo");
        funcaoRepository.save(funcao11);

        Funcao funcao12 = new Funcao(null, "Recepcionista");
        funcaoRepository.save(funcao12);

        Funcao funcao13 = new Funcao(null, "Motorista");
        funcaoRepository.save(funcao13);

        Funcao funcao14 = new Funcao(null, "Auxiliar de Limpeza");
        funcaoRepository.save(funcao14);

        Funcao funcao15 = new Funcao(null, "Segurança");
        funcaoRepository.save(funcao15);

        Funcao funcao16 = new Funcao(null, "Dentista");
        funcaoRepository.save(funcao16);
    }
}
