package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.FuncionarioDTO;
import com.edufelizardo.maissaudepublica.model.Funcionario;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FuncionariosUtil {
    public FuncionarioDTO criarFuncionarioMedicoDTO() {
        FuncionarioDTO dto = new FuncionarioDTO();

        dto.setDataDeAdmissao(LocalDate.of(2018,05,12));
        dto.setRegistroProfissional("CRM 12345");
        dto.setSalario(BigDecimal.valueOf(15000));
        dto.setPessoa(new PessoaFuncionarioUtil().criarPessoaEFuncionarioUm());
        dto.setEscalaDeTrabalhoDTO(new EscalaDeTrabalhoUtil().criarEDTMatutinoUmDTO());
        dto.setFormacao(new FormacaoUtil().criarFormacaoMedicinaDTO());
        dto.setDepartamento(new DepartamentoUtil().criarDepartamentoClinicaMedicaUtil());
        dto.setFuncao(new FuncaoUtil().criarFuncaoMedicoDTO());
//        dto.setProgramaDeSaudes(new ProgramaDeSaudeUtil().criarPDSNaoPerteceANenhumPrograma());
        return  dto;
    }
    public List<FuncionarioDTO> criarFuncionarioEnfermeiroDTO() {
        FuncionarioDTO dto = new FuncionarioDTO();

        dto.setDataDeAdmissao(LocalDate.of(2019,02,20));
        dto.setRegistroProfissional("COREN 54321");
        dto.setSalario(BigDecimal.valueOf(12000));
        dto.setPessoa(new PessoaFuncionarioUtil().criarPessoaEFuncionarioUm());
        dto.setEscalaDeTrabalhoDTO(new EscalaDeTrabalhoUtil().criarEDTMatutinoUmDTO());
        dto.setFormacao(new FormacaoUtil().criarFormacaoMedicinaDTO());
        dto.setDepartamento(new DepartamentoUtil().criarDepartamentoClinicaMedicaUtil());
        dto.setFuncao(new FuncaoUtil().criarFuncaoMedicoDTO());
        dto.setProgramaDeSaudes(new ProgramaDeSaudeUtil().criarPDSNaoPerteceANenhumPrograma());
        return  Arrays.asList(dto);
    }
    public List<FuncionarioDTO> criarFuncionarioDentistaDTO() {
        FuncionarioDTO dto = new FuncionarioDTO();

        dto.setDataDeAdmissao(LocalDate.of(2021,8,05));
        dto.setRegistroProfissional("CRO 123456");
        dto.setSalario(BigDecimal.valueOf(10000));
        dto.setPessoa(new PessoaFuncionarioUtil().criarPessoaEFuncionarioUm());
        dto.setEscalaDeTrabalhoDTO(new EscalaDeTrabalhoUtil().criarEDTMatutinoUmDTO());
        dto.setFormacao(new FormacaoUtil().criarFormacaoMedicinaDTO());
        dto.setDepartamento(new DepartamentoUtil().criarDepartamentoClinicaMedicaUtil());
        dto.setFuncao(new FuncaoUtil().criarFuncaoMedicoDTO());
        dto.setProgramaDeSaudes(new ProgramaDeSaudeUtil().criarPDSNaoPerteceANenhumPrograma());
        return  Arrays.asList(dto);
    }
    @Transactional
    public Funcionario criarFuncionarioMedico() {
        Funcionario funcionario= new Funcionario();

        funcionario.setDataDeAdmissao(LocalDate.of(2018,05,12));
        funcionario.setRegistroProfissional("CRM 12345");
        funcionario.setSalario(BigDecimal.valueOf(15000));
        funcionario.setPessoa(new PessoaFuncionarioUtil().criarPessoaEFuncionario());
//        funcionario.setEscalaDeTrabalhoDTO(new EscalaDeTrabalhoUtil().criarEDTMatutinoUmDTO());
//        funcionario.setFormacao(new FormacaoUtil().criarFormacaoMedicinaDTO());
//        funcionario.setDepartamento(new DepartamentoUtil().criarDepartamentoClinicaMedicaUtil());
//        funcionario.setFuncao(new FuncaoUtil().criarFuncaoMedicoDTO());
//        dto.setProgramaDeSaudes(new ProgramaDeSaudeUtil().criarPDSNaoPerteceANenhumPrograma());
        return  funcionario;
    }
}
