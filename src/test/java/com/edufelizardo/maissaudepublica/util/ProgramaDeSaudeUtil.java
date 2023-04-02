package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.ProgramaDeSaudeDTO;

import java.util.Arrays;
import java.util.List;

public class ProgramaDeSaudeUtil {
    public ProgramaDeSaudeDTO criarPDSSaudeDoHomem() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde do Homem");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSPrevencaoECombateADoencasInfectocontagiosas() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Prevenção e Combate a Doenças Infectocontagiosas");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeBucal() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde Bucal");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSPrevencaoDeDoencasCardiovasculares() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Prevenção de Doenças Cardiovasculares");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeMental() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde Mental");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSPrevencaoETratamentoDoCancer() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Prevenção e Tratamento do Câncer");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSPrevencaoDeAcidentesEDoencasRelacionadasAoTrabalho() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Prevenção de Acidentes e Doenças Relacionadas ao Trabalho");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaMulher() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da Mulher");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDoIdoso() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde do Idoso");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaCrianca() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da Criança");
        return dto;
    }
    public List<ProgramaDeSaudeDTO> criarPDSAtencaoBasica() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Atenção Básica");
        return Arrays.asList(dto);
    }
    public ProgramaDeSaudeDTO criarPDSPreNatal() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Pré-Natal");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSAtendimentoEmergencial() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Atendimento Emergencial");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSControleDaTuberculose() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Controle da Tuberculose");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSControleDaHanseniase() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Controle da Hanseníase");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSAtendimentoADoencasRespiratórias() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Atendimento a Doenças Respiratórias");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSAtendimentoADoencasCardiovasculares() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Atendimento a Doenças Cardiovasculares");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSImunizacao() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Imunização");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSOdontologia() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Odontologia");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSControleDeEndemias() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Controle de Endemias");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSProgramaDST_AIDS() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Programa DST/AIDS");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSAlimentacaoENutricao() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Alimentação e Nutrição");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaPopulacaoNegra() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da População Negra");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaPopulacaoIndigena() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da População Indígena");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaPopulacaoLGBT() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da População LGBT");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaPopulacaoEmSituacaoDeRua() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da População em Situação de Rua");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSPrevencaoEControleDoCancer() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Prevenção e Controle do Câncer");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSAtendimentoAPessoasComDeficiencia() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("tendimento a Pessoas com Deficiência");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSAtendimentoADependentesQuimicos() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Atendimento a Dependentes Químicos");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSAtendimentoAPessoasComHIV_AIDS() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Atendimento a Pessoas com HIV/AIDS");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDoTrabalhador() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde do Trabalhador");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSSaudedoViajante() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde do Viajante");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSSaudeDaPopulacaoCarceraria() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Saúde da População Carcerária");
        return dto;
    }
    public ProgramaDeSaudeDTO criarPDSProgramaDeControleDeZoonoses() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.setNomeProgramaDesaude("Programa de Controle de Zoonoses");
        return dto;
    }
    public List<ProgramaDeSaudeDTO> criarPDSNaoPerteceANenhumPrograma() {
        ProgramaDeSaudeDTO dto = new ProgramaDeSaudeDTO();

        dto.getNomeProgramaDesaude();
        return Arrays.asList(dto);
    }
}
