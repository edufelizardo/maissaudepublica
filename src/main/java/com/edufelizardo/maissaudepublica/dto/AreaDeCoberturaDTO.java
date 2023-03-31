package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import jakarta.validation.constraints.NotBlank;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AreaDeCoberturaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4802240008044291451L;
    private Long area_id;
    @NotBlank(message = "A área deve ser preenchida.")
    private int area;
    private List<SubareaDTO> subareasDto = new ArrayList<>();

    public AreaDeCoberturaDTO() {
    }

    public AreaDeCoberturaDTO(AreaDeCobertura cobertura) {
        this.area_id = cobertura.getArea_id();
        this.area = cobertura.getArea();
        this.subareasDto = cobertura.getSubareas()
                .stream()
                .map(SubareaDTO::new)
                .collect(Collectors.toList());
    }

    public Long getArea_id() {
        return area_id;
    }

    public int getArea() {
        return area;
    }

    public List<SubareaDTO> getSubareasDto() {
        return subareasDto;
    }

    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setSubareasDto(List<SubareaDTO> subareasDto) {
        this.subareasDto = subareasDto;
    }
}
