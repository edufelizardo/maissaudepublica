package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = -8935505190460053136L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
    @OneToOne
    @JoinColumn(name = "familia_id")
    private Familia familia;
    @OneToOne
    @JoinColumn(name = "area_id")
    private AreaDeCobertura areaDeCobertura;

    public Endereco() {
    }

    public Endereco(Long id, String cep, String logradouro, int numero, String complemento, String bairro,
                    String localidade, String uf, String ibge, String gia, String ddd, String siafi, Familia familia,
                    AreaDeCobertura areaDeCobertura) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
        this.familia = familia;
        this.areaDeCobertura = areaDeCobertura;
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

    public Familia getFamilia() {
        return familia;
    }

    public AreaDeCobertura getAreaDeCobertura() {
        return areaDeCobertura;
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

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public void setAreaDeCobertura(AreaDeCobertura areaDeCobertura) {
        this.areaDeCobertura = areaDeCobertura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;
        return getNumero() == endereco.getNumero() && Objects.equals(getId(),
                endereco.getId()) && Objects.equals(getCep(), endereco.getCep()) && Objects.equals(getLogradouro(),
                endereco.getLogradouro()) && Objects.equals(getComplemento(),
                endereco.getComplemento()) && Objects.equals(getBairro(),
                endereco.getBairro()) && Objects.equals(getLocalidade(),
                endereco.getLocalidade()) && Objects.equals(getUf(),
                endereco.getUf()) && Objects.equals(getIbge(),
                endereco.getIbge()) && Objects.equals(getGia(),
                endereco.getGia()) && Objects.equals(getDdd(),
                endereco.getDdd()) && Objects.equals(getSiafi(),
                endereco.getSiafi()) && Objects.equals(getFamilia(),
                endereco.getFamilia()) && Objects.equals(getAreaDeCobertura(), endereco.getAreaDeCobertura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCep(), getLogradouro(), getNumero(), getComplemento(), getBairro(),
                getLocalidade(), getUf(), getIbge(), getGia(), getDdd(), getSiafi(), getFamilia(), getAreaDeCobertura());
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                ", familia=" + familia +
                ", areaDeCobertura=" + areaDeCobertura +
                '}';
    }
}
