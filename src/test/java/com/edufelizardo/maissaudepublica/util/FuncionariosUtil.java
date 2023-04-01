package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.ConsultaDTO;
import com.edufelizardo.maissaudepublica.dto.FuncionarioDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class FuncionariosUtil {
    public List<FuncionarioDTO> criarFuncionarioDTO() {
        FuncionarioDTO dto = new FuncionarioDTO();

        dto.setDataDeAdmissao(LocalDate.of(2000,10,10));
        dto.setRegistroProfissional("CRM0001-SP");
        dto.setSalario(BigDecimal.valueOf(15000));
        dto.setPessoa(new PessoaUtil().criarPessoaQueEFuncionario());
        dto.setEscalaDeTrabalhoDTO(new EscalaDeTrabalhoUtil().criarEscalaDeTrabalhoDTO());
        dto.setFormacao(new FormacaoUtil().criarFormacaoDTO());
//        dto.setDepartamento();
//        dto.setFuncao();
//        dto.setProgramaDeSaudes();
        return  Arrays.asList(dto);
    }
}
