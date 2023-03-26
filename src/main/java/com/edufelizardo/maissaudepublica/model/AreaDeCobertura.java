package com.edufelizardo.maissaudepublica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class AreaDeCobertura implements Serializable {
    @Serial
    private static final long serialVersionUID = 8082873581599589994L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long area_id;
    @NotBlank(message = "A área deve ser preenchida.")
    private int area;
    @OneToMany
    @JoinColumn(name = "area_microarea_id")
    private List<Subarea> subareas;

    public AreaDeCobertura() {
    }

    public AreaDeCobertura(Long area_id, int area, List<Subarea> subareas) {
        this.area_id = area_id;
        this.area = area;
        this.subareas = subareas;
    }

    public AreaDeCobertura(AreaDeCobertura area) {
        this.area_id = area.getArea_id();
        this.area = area.getArea();
        this.subareas = area.getSubareas();
    }

    public Long getArea_id() {
        return area_id;
    }

    public int getArea() {
        return area;
    }

    public List<Subarea> getSubareas() {
        return subareas;
    }

    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setSubareas(List<Subarea> subareas) {
        this.subareas = subareas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AreaDeCobertura that)) return false;
        return getArea() == that.getArea() && Objects.equals(getArea_id(),
                that.getArea_id()) && Objects.equals(getSubareas(), that.getSubareas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea_id(), getArea(), getSubareas());
    }
}
