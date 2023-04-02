package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.PessoaDTO;

import java.time.LocalDate;

public class PessoaPacienteUtil {
    public PessoaDTO criarPessoaPacienteUm(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Carla Souza");
        dto.setDataDeNascimento(LocalDate.of(1987, 06, 30));
        dto.setIdade(34);
        dto.setCpf("789.123.456-00");
        dto.setEmail("carla.souza@test.com");
        dto.setEndereco(new EnderecoUtil().criarEnderecoQuatro());
        return dto;
    }
    public PessoaDTO criarPessoaPacienteDois(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Lucas Mendes");
        dto.setDataDeNascimento(LocalDate.of(1995, 03, 25));
        dto.setIdade(26);
        dto.setCpf("654.321.987-00");
        dto.setEmail("lucas.mendes@test.com");
        dto.setEndereco(new EnderecoUtil().criarEnderecoCinco());
        return dto;
    }
    public PessoaDTO criarPessoaPacienteTres(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Juliana Oliveira");
        dto.setDataDeNascimento(LocalDate.of(1980, 8, 12));
        dto.setIdade(41);
        dto.setCpf("321.789.456-00");
        dto.setEmail("juliana.oliveira@test.com");
        dto.setEndereco(new EnderecoUtil().criarEnderecoSeis());
        return dto;
    }
}
