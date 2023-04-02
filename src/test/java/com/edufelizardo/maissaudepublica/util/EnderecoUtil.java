package com.edufelizardo.maissaudepublica.util;

import com.edufelizardo.maissaudepublica.dto.EnderecoDTO;

public class EnderecoUtil {
    public EnderecoDTO criarEnderecoUM() {
        EnderecoDTO dto = new EnderecoDTO();

        dto.setCep("01001-000");
        dto.setLogradouro("Praça da Sé");
        dto.setNumero(1);
        dto.setComplemento(null);
        dto.setBairro("Sé");
        dto.setLocalidade("São Paulo");
        dto.setUf("SP");
        dto.setIbge("3550308");
        dto.setGia("1004");
        dto.setDdd("11");
        dto.setSiafi("P7107");
        return dto;
    }
    public EnderecoDTO criarEnderecoDois() {
        EnderecoDTO dto = new EnderecoDTO();

        dto.setCep("01002-000");
        dto.setLogradouro("Praça Clóvis Beviláqua");
        dto.setNumero(1);
        dto.setComplemento(null);
        dto.setBairro("Sé");
        dto.setLocalidade("São Paulo");
        dto.setUf("SP");
        dto.setIbge("3550308");
        dto.setGia("1004");
        dto.setDdd("11");
        dto.setSiafi("P7107");
        return dto;
    }
    public EnderecoDTO criarEnderecoTres() {
        EnderecoDTO dto = new EnderecoDTO();

        dto.setCep("01003-000");
        dto.setLogradouro("Viaduto Santa Ifigênia");
        dto.setNumero(1);
        dto.setComplemento(null);
        dto.setBairro("Santa Ifigênia");
        dto.setLocalidade("São Paulo");
        dto.setUf("SP");
        dto.setIbge("3550308");
        dto.setGia("1004");
        dto.setDdd("11");
        dto.setSiafi("P7107");
        return dto;
    }
    public EnderecoDTO criarEnderecoQuatro() {
        EnderecoDTO dto = new EnderecoDTO();

        dto.setCep("01004-000");
        dto.setLogradouro("PRua Florêncio de Abreu");
        dto.setNumero(1);
        dto.setComplemento(null);
        dto.setBairro("Centro");
        dto.setLocalidade("São Paulo");
        dto.setUf("SP");
        dto.setIbge("3550308");
        dto.setGia("1004");
        dto.setDdd("11");
        dto.setSiafi("P7107");
        return dto;
    }
    public EnderecoDTO criarEnderecoCinco() {
        EnderecoDTO dto = new EnderecoDTO();

        dto.setCep("01005-000");
        dto.setLogradouro("Viaduto do Chá");
        dto.setNumero(15);
        dto.setComplemento(null);
        dto.setBairro("Centro");
        dto.setLocalidade("São Paulo");
        dto.setUf("SP");
        dto.setIbge("3550308");
        dto.setGia("1004");
        dto.setDdd("11");
        dto.setSiafi("P7107");
        return dto;
    }
    public EnderecoDTO criarEnderecoSeis() {
        EnderecoDTO dto = new EnderecoDTO();

        dto.setCep("01006-000");
        dto.setLogradouro("Rua Boa Vista");
        dto.setNumero(15);
        dto.setComplemento(null);
        dto.setBairro("Centro");
        dto.setLocalidade("São Paulo");
        dto.setUf("SP");
        dto.setIbge("3550308");
        dto.setGia("1004");
        dto.setDdd("11");
        dto.setSiafi("P7107");
        return dto;
    }
}
