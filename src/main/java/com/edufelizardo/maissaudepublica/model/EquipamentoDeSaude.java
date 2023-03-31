package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class EquipamentoDeSaude implements Serializable {
    @Serial
    private static final long serialVersionUID = 3088686415806535954L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipamentodeSaude_id;
    private String nomeDoEquipamento;

    public EquipamentoDeSaude() {
    }

    public EquipamentoDeSaude(Long equipamentodeSaude_id, String nomeDoEquipamento) {
        this.equipamentodeSaude_id = equipamentodeSaude_id;
        this.nomeDoEquipamento = nomeDoEquipamento;
    }
    public EquipamentoDeSaude(EquipamentoDeSaude equipamentoDeSaude) {
        this.equipamentodeSaude_id = equipamentoDeSaude.getEquipamentodeSaude_id();
        this.nomeDoEquipamento = equipamentoDeSaude.getNomeDoEquipamento();
    }

    public Long getEquipamentodeSaude_id() {
        return equipamentodeSaude_id;
    }

    public String getNomeDoEquipamento() {
        return nomeDoEquipamento;
    }

    public void setEquipamentodeSaude_id(Long equipamentodeSaude_id) {
        this.equipamentodeSaude_id = equipamentodeSaude_id;
    }

    public void setNomeDoEquipamento(String nomeDoEquipamento) {
        this.nomeDoEquipamento = nomeDoEquipamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipamentoDeSaude that)) return false;
        return Objects.equals(getEquipamentodeSaude_id(),
                that.getEquipamentodeSaude_id()) && Objects.equals(getNomeDoEquipamento(), that.getNomeDoEquipamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEquipamentodeSaude_id(), getNomeDoEquipamento());
    }

    @Override
    public String toString() {
        return "EquipamentoDeSaude{" +
                "equipamentodeSaude_id=" + equipamentodeSaude_id +
                ", nomeDoEquipamento='" + nomeDoEquipamento + '\'' +
                '}';
    }
}
