package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Subarea;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AreaDeCoberturaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4802240008044291451L;
    private Long area_id;
    @NotBlank(message = "A área deve ser preenchida.")
    private int area;
    private List<Subarea> subareas = new ArrayList<>();

    public AreaDeCoberturaDTO() {
    }

    public AreaDeCoberturaDTO(AreaDeCoberturaDTO dto) {
        this.area_id = dto.getArea_id();
        this.area = dto.getArea();
        this.subareas = dto.getSubareas();
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
}
