package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.PessoaDTO;

import java.time.LocalDate;

public class PessoaUtil {
    public PessoaDTO criarPessoaQueEFuncionario(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Jair Monterio");
        dto.setDataDeNascimento(LocalDate.of(2000, 10, 23));
        dto.setIdade(22);
        dto.setCpf("012.345.678-90");
        dto.setEmail("test@test.com");
//        dto.setEndereco();
        return dto;
    }
}
