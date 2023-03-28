package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Subarea implements Serializable {
    @Serial
    private static final long serialVersionUID = 7786684267785004569L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subarea_id;
//    @NotBlank(message = "A microarea deve ser preenchida.")
    private int subarea;

    public Subarea() {
    }

    public Subarea(Long subarea_id, int subarea) {
        this.subarea_id = subarea_id;
        this.subarea = subarea;
    }
    public Subarea(Subarea micro) {
        this.subarea_id = micro.getSubarea_id();
        this.subarea = micro.getSubarea();
    }

    public Long getSubarea_id() {
        return subarea_id;
    }

    public int getSubarea() {
        return subarea;
    }

    public void setSubarea_id(Long subarea_id) {
        this.subarea_id = subarea_id;
    }

    public void setSubarea(int subarea) {
        this.subarea = subarea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subarea subarea1)) return false;
        return getSubarea() == subarea1.getSubarea() && Objects.equals(getSubarea_id(), subarea1.getSubarea_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubarea_id(), getSubarea());
    }

    @Override
    public String toString() {
        return "Subarea{" +
                "subarea_id=" + subarea_id +
                ", subarea=" + subarea +
                '}' + "\n";
    }
}
