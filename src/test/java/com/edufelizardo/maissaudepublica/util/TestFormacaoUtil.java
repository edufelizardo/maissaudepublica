package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.Formacao;
import com.edufelizardo.maissaudepublica.repositories.FormacaoRepository;

public class TestFormacaoUtil {
    public static Formacao registraFormacaoMedicina(FormacaoRepository formacaoRepository) {
        Formacao medicina = new Formacao(null, "Medicina");
        formacaoRepository.save(medicina);
        return medicina;
    }
    public static Formacao registraFormacaoEnfermagem(FormacaoRepository formacaoRepository) {
        Formacao Enfermagem = new Formacao(null, "Enfermagem");
        formacaoRepository.save(Enfermagem);
        return Enfermagem;
    }
    public static Formacao registraFormacaoTecnicoEnfermagem(FormacaoRepository formacaoRepository) {
        Formacao tecnicoDeEnfermagem = new Formacao(null, "Técnico de Enfermagem");
        formacaoRepository.save(tecnicoDeEnfermagem);
        return tecnicoDeEnfermagem;
    }
    public static Formacao registraFormacaoFisioterapias(FormacaoRepository formacaoRepository) {
        Formacao fisioterapia = new Formacao(null, "Fisioterapia");
        formacaoRepository.save(fisioterapia);
        return fisioterapia;
    }
    public static Formacao registraFormacaoOdontologia(FormacaoRepository formacaoRepository) {
        Formacao formacao5 = new Formacao(null, "Odontologia");
        formacaoRepository.save(formacao5);
        return formacao5;
    }
    public static Formacao registraFormacaoFarmacia(FormacaoRepository formacaoRepository) {
        Formacao formacao6 = new Formacao(null, "Farmácia");
        formacaoRepository.save(formacao6);
        return formacao6;
    }
    public static Formacao registraFormacaoNutricao(FormacaoRepository formacaoRepository) {
        Formacao formacao7 = new Formacao(null, "Nutrição");
        formacaoRepository.save(formacao7);
        return formacao7;
    }
    public static Formacao registraFormacaoPsicologia(FormacaoRepository formacaoRepository) {
        Formacao formacao8 = new Formacao(null, "Psicologia");
        formacaoRepository.save(formacao8);
        return formacao8;
    }
    public static Formacao registraFormacaoTerapiaOcupacional(FormacaoRepository formacaoRepository) {
        Formacao formacao9 = new Formacao(null, "Terapia Ocupacional");
        formacaoRepository.save(formacao9);
        return formacao9;
    }
    public static Formacao registraFormacaoFonoaudiologia(FormacaoRepository formacaoRepository) {
        Formacao formacao10 = new Formacao(null, "Fonoaudiologia");
        formacaoRepository.save(formacao10);
        return formacao10;
    }
    public static Formacao registraFormacaoAssistenciaSocial(FormacaoRepository formacaoRepository) {
        Formacao formacao11 = new Formacao(null, "Assistência Social");
        formacaoRepository.save(formacao11);
        return formacao11;
    }
    public static Formacao registraFormacaoEducacaoFisica(FormacaoRepository formacaoRepository) {
        Formacao formacao12 = new Formacao(null, "Educação Física");
        formacaoRepository.save(formacao12);
        return formacao12;
    }
    public static Formacao registraFormacaoFisioterapia(FormacaoRepository formacaoRepository) {
        Formacao formacao13 = new Formacao(null, "Fisioterapia");
        formacaoRepository.save(formacao13);
        return formacao13;
    }
    public static Formacao registraFormacaoTerapiaHolistica(FormacaoRepository formacaoRepository) {
        Formacao formacao14 = new Formacao(null, "Terapia Holística");
        formacaoRepository.save(formacao14);
        return formacao14;
    }
    public static Formacao registraFormacaoAcupuntura(FormacaoRepository formacaoRepository) {
        Formacao formacao15 = new Formacao(null, "Acupuntura");
        formacaoRepository.save(formacao15);
        return formacao15;
    }
    public static Formacao registraFormacaoQuiropraxia(FormacaoRepository formacaoRepository) {
        Formacao formacao16 = new Formacao(null, "Quiropraxia");
        formacaoRepository.save(formacao16);
        return formacao16;
    }
    public static Formacao registraFormacaoNaturologia(FormacaoRepository formacaoRepository) {
        Formacao formacao17 = new Formacao(null, "Naturologia");
        formacaoRepository.save(formacao17);
        return formacao17;
    }
    public static Formacao registraFormacaoRadiologia(FormacaoRepository formacaoRepository) {
        Formacao formacao18 = new Formacao(null, "Radiologia");
        formacaoRepository.save(formacao18);
        return formacao18;
    }
    public static Formacao registraFormacaoEnfermagemDoTrabalho(FormacaoRepository formacaoRepository) {
        Formacao formacao19 = new Formacao(null, "Enfermagem do Trabalho");
        formacaoRepository.save(formacao19);
        return formacao19;
    }
    public static Formacao registraFormacaoPsiquiatria(FormacaoRepository formacaoRepository) {
        Formacao formacao20 = new Formacao(null, "Psiquiatria");
        formacaoRepository.save(formacao20);
        return formacao20;
    }
    public static void registraVinteFormacoes(FormacaoRepository formacaoRepository) {
        Formacao formacao1 = new Formacao(null, "Medicina");
        formacaoRepository.save(formacao1);

        Formacao formacao2 = new Formacao(null, "Enfermagem");
        formacaoRepository.save(formacao2);

        Formacao formacao3 = new Formacao(null, "Técnico de Enfermagem");
        formacaoRepository.save(formacao3);

        Formacao formacao4 = new Formacao(null, "Fisioterapia");
        formacaoRepository.save(formacao4);

        Formacao formacao5 = new Formacao(null, "Odontologia");
        formacaoRepository.save(formacao5);

        Formacao formacao6 = new Formacao(null, "Farmácia");
        formacaoRepository.save(formacao6);

        Formacao formacao7 = new Formacao(null, "Nutrição");
        formacaoRepository.save(formacao7);

        Formacao formacao8 = new Formacao(null, "Psicologia");
        formacaoRepository.save(formacao8);

        Formacao formacao9 = new Formacao(null, "Terapia Ocupacional");
        formacaoRepository.save(formacao9);

        Formacao formacao10 = new Formacao(null, "Fonoaudiologia");
        formacaoRepository.save(formacao10);

        Formacao formacao11 = new Formacao(null, "Assistência Social");
        formacaoRepository.save(formacao11);

        Formacao formacao12 = new Formacao(null, "Educação Física");
        formacaoRepository.save(formacao12);

        Formacao formacao13 = new Formacao(null, "Fisioterapia");
        formacaoRepository.save(formacao13);

        Formacao formacao14 = new Formacao(null, "Terapia Holística");
        formacaoRepository.save(formacao14);

        Formacao formacao15 = new Formacao(null, "Acupuntura");
        formacaoRepository.save(formacao15);

        Formacao formacao16 = new Formacao(null, "Quiropraxia");
        formacaoRepository.save(formacao16);

        Formacao formacao17 = new Formacao(null, "Naturologia");
        formacaoRepository.save(formacao17);

        Formacao formacao18 = new Formacao(null, "Radiologia");
        formacaoRepository.save(formacao18);

        Formacao formacao19 = new Formacao(null, "Enfermagem do Trabalho");
        formacaoRepository.save(formacao19);

        Formacao formacao20 = new Formacao(null, "Psiquiatria");
        formacaoRepository.save(formacao20);
    }
}
