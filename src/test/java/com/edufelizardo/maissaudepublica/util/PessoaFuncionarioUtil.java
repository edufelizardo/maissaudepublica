package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.EnderecoDTO;
import com.edufelizardo.maissaudepublica.dto.PessoaDTO;
import com.edufelizardo.maissaudepublica.model.Pessoa;

import java.time.LocalDate;

public class PessoaFuncionarioUtil {
    public PessoaDTO criarPessoaEFuncionarioUm(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("João Silva");
        dto.setDataDeNascimento(LocalDate.of(1985, 05, 20));
        dto.setIdade(36);
        dto.setCpf("123.456.789-00");
        dto.setEmail("joao.silva@test.com");
        dto.setEndereco(new EnderecoUtil().criarEnderecoUM());
        return dto;
    }
    public PessoaDTO criarPessoaEFuncionarioDois(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Maria Santos");
        dto.setDataDeNascimento(LocalDate.of(1990, 02, 15));
        dto.setIdade(31);
        dto.setCpf("987.654.321-00");
        dto.setEmail("maria.santos@test.com");
        dto.setEndereco(new EnderecoUtil().criarEnderecoDois());
        return dto;
    }
    public PessoaDTO criarPessoaEFuncionarioTres(){
        PessoaDTO dto = new PessoaDTO();
        dto.setNomeCompleto("Pedro Almeida");
        dto.setDataDeNascimento(LocalDate.of(1978, 12, 10));
        dto.setIdade(43);
        dto.setCpf("456.789.123-00");
        dto.setEmail("pedro.almeida@test.com");
        dto.setEndereco(new EnderecoUtil().criarEnderecoTres());
        return dto;
    }
    public Pessoa criarPessoaEFuncionario(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNomeCompleto("João Silva");
        pessoa.setDataDeNascimento(LocalDate.of(1985, 05, 20));
        pessoa.setIdade(36);
        pessoa.setCpf("123.456.789-00");
        pessoa.setEmail("joao.silva@test.com");
//        pessoa.setEndereco(new EnderecoUtil().criarEnderecoUM());
        return pessoa;
    }
}
