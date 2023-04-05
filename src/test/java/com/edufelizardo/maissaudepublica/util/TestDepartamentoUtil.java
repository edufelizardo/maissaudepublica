package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.model.Departamento;
import com.edufelizardo.maissaudepublica.repositories.DepartamentoRepository;

public class TestDepartamentoUtil {
    public static Departamento registrarDepartamentoAdministracao(DepartamentoRepository departamentoRepository) {
        Departamento departamento1 = new Departamento(null, "Administração");
        departamentoRepository.save(departamento1);
        return departamento1;
    }
    public static Departamento registrarDepartamentoAtendimentoMedico(DepartamentoRepository departamentoRepository) {
        Departamento departamento2 = new Departamento(null, "Atendimento Médico");
        departamentoRepository.save(departamento2);
        return departamento2;
    }
    public static Departamento registrarDepartamentoEnfermagem(DepartamentoRepository departamentoRepository) {
        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);
        return departamento3;
    }
    public static Departamento registrarDepartamentoFarmacia(DepartamentoRepository departamentoRepository) {
        Departamento departamento4 = new Departamento(null, "Farmácia");
        departamentoRepository.save(departamento4);
        return departamento4;
    }
    public static Departamento registrarDepartamentoAlmoxarifado(DepartamentoRepository departamentoRepository) {
        Departamento departamento5 = new Departamento(null, "Almoxarifado");
        departamentoRepository.save(departamento5);
        return departamento5;
    }
    public static Departamento registrarDepartamentoLimpezaEManutencao(DepartamentoRepository departamentoRepository) {
        Departamento departamento6 = new Departamento(null, "Limpeza e Manutenção");
        departamentoRepository.save(departamento6);
        return departamento6;
    }
    public static Departamento registrarDepartamentoServicoSocial(DepartamentoRepository departamentoRepository) {
        Departamento departamento7 = new Departamento(null, "Serviço Social");
        departamentoRepository.save(departamento7);
        return departamento7;
    }
    public static Departamento registrarDepartamentoPsicologia(DepartamentoRepository departamentoRepository) {
        Departamento departamento8 = new Departamento(null, "Psicologia");
        departamentoRepository.save(departamento8);
        return departamento8;
    }
    public static Departamento registrarDepartamentoNutricao(DepartamentoRepository departamentoRepository) {
        Departamento departamento9 = new Departamento(null, "Nutrição");
        departamentoRepository.save(departamento9);
        return departamento9;
    }
    public static Departamento registrarDepartamentoFisioterapia(DepartamentoRepository departamentoRepository) {
        Departamento departamento10 = new Departamento(null, "Fisioterapia");
        departamentoRepository.save(departamento10);
        return departamento10;
    }
    public static Departamento registrarDepartamentoTerapiaOcupacional(DepartamentoRepository departamentoRepository) {
        Departamento departamento11 = new Departamento(null, "Terapia Ocupacional");
        departamentoRepository.save(departamento11);
        return departamento11;
    }
    public static Departamento registrarDepartamentoFonoaudiologia(DepartamentoRepository departamentoRepository) {
        Departamento departamento12 = new Departamento(null, "Fonoaudiologia");
        departamentoRepository.save(departamento12);
        return departamento12;
    }
    public static Departamento registrarDepartamentoRecepcao(DepartamentoRepository departamentoRepository) {
        Departamento departamento13 = new Departamento(null, "Recepção");
        departamentoRepository.save(departamento13);
        return departamento13;
    }
    public static Departamento registrarDepartamentoColetaDeExames(DepartamentoRepository departamentoRepository) {
        Departamento departamento14 = new Departamento(null, "Coleta de Exames");
        departamentoRepository.save(departamento14);
        return departamento14;
    }
    public static Departamento registrarDepartamentoTriagem(DepartamentoRepository departamentoRepository) {
        Departamento departamento15 = new Departamento(null, "Triagem");
        departamentoRepository.save(departamento15);
        return departamento15;
    }
    public static Departamento registrarDepartamentoOdontologia(DepartamentoRepository departamentoRepository) {
        Departamento departamento16 = new Departamento(null, "Odontologia");
        departamentoRepository.save(departamento16);
        return departamento16;
    }
    public static Departamento registrarDepartamentoImunizacao(DepartamentoRepository departamentoRepository) {
        Departamento departamento17 = new Departamento(null, "Imunização");
        departamentoRepository.save(departamento17);
        return departamento17;
    }
    public static Departamento registrarDepartamentoEducacaoEmSaude(DepartamentoRepository departamentoRepository) {
        Departamento departamento18 = new Departamento(null, "Educação em Saúde");
        departamentoRepository.save(departamento18);
        return departamento18;
    }
    public static Departamento registrarDepartamentoAtendimentoAGestantes(DepartamentoRepository departamentoRepository) {
        Departamento departamento19 = new Departamento(null, "Atendimento a Gestantes");
        departamentoRepository.save(departamento19);
        return departamento19;
    }
    public static Departamento registrarDepartamentoProgramaSaudeDaFamilia(DepartamentoRepository departamentoRepository) {
        Departamento departamento20 = new Departamento(null, "Programa Saúde da Família");
        departamentoRepository.save(departamento20);
        return departamento20;
    }
    public static void registraTodosOsDepartamentos(DepartamentoRepository departamentoRepository) {
        Departamento departamento1 = new Departamento(null, "Administração");
        departamentoRepository.save(departamento1);

        Departamento departamento2 = new Departamento(null, "Atendimento Médico");
        departamentoRepository.save(departamento2);

        Departamento departamento3 = new Departamento(null, "Enfermagem");
        departamentoRepository.save(departamento3);

        Departamento departamento4 = new Departamento(null, "Farmácia");
        departamentoRepository.save(departamento4);

        Departamento departamento5 = new Departamento(null, "Almoxarifado");
        departamentoRepository.save(departamento5);

        Departamento departamento6 = new Departamento(null, "Limpeza e Manutenção");
        departamentoRepository.save(departamento6);

        Departamento departamento7 = new Departamento(null, "Serviço Social");
        departamentoRepository.save(departamento7);

        Departamento departamento8 = new Departamento(null, "Psicologia");
        departamentoRepository.save(departamento8);

        Departamento departamento9 = new Departamento(null, "Nutrição");
        departamentoRepository.save(departamento9);

        Departamento departamento10 = new Departamento(null, "Fisioterapia");
        departamentoRepository.save(departamento10);

        Departamento departamento11 = new Departamento(null, "Terapia Ocupacional");
        departamentoRepository.save(departamento11);

        Departamento departamento12 = new Departamento(null, "Fonoaudiologia");
        departamentoRepository.save(departamento12);

        Departamento departamento13 = new Departamento(null, "Recepção");
        departamentoRepository.save(departamento13);

        Departamento departamento14 = new Departamento(null, "Coleta de Exames");
        departamentoRepository.save(departamento14);

        Departamento departamento15 = new Departamento(null, "Triagem");
        departamentoRepository.save(departamento15);

        Departamento departamento16 = new Departamento(null, "Odontologia");
        departamentoRepository.save(departamento16);

        Departamento departamento17 = new Departamento(null, "Imunização");
        departamentoRepository.save(departamento17);

        Departamento departamento18 = new Departamento(null, "Educação em Saúde");
        departamentoRepository.save(departamento18);

        Departamento departamento19 = new Departamento(null, "Atendimento a Gestantes");
        departamentoRepository.save(departamento19);

        Departamento departamento20 = new Departamento(null, "Programa Saúde da Família");
        departamentoRepository.save(departamento20);
    }
}
