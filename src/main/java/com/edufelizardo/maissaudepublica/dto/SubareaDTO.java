package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.Subarea;
import jakarta.validation.constraints.NotBlank;

public class SubareaDTO {
    private Long subarea_id;
    @NotBlank(message = "A microarea deve ser preenchida.")
    private int subarea;

    public SubareaDTO() {
    }

    public SubareaDTO(Subarea subarea) {
        this.subarea_id = subarea.getSubarea_id();
        this.subarea = subarea.getSubarea();
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
}
