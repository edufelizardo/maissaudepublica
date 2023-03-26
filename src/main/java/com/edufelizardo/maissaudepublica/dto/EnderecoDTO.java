package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.io.Serial;
import java.io.Serializable;

public class EnderecoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 3479531845496887294L;
    private Long id;
    @NotBlank(message = "O campo CEP é obrigatório")
    @Pattern(regexp = "^[0-9]{8}$", message = "O CEP deve ter exatamente 8 dígitos numéricos")
    private String cep;
    @NotBlank(message = "O logradouro deve ser preenchido.")
    private String logradouro;
    @NotBlank(message = "O número da residência deve ser preenchido.")
    private int numero;
    private String complemento;
    @NotBlank(message = "O bairro deve ser preenchido.")
    private String bairro;
    @NotBlank(message = "A cidade deve ser informada")
    private String localidade;
    @NotBlank(message = "O estado deve ser informado")
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public EnderecoDTO() {
    }

    public EnderecoDTO(Long id, String cep, String logradouro, int numero, String complemento, String bairro,
                       String localidade, String uf) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }public EnderecoDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.logradouro = endereco.getLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.localidade = endereco.getLocalidade();
        this.uf = endereco.getUf();
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
