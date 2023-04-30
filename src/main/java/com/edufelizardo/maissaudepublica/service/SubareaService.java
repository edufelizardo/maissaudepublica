package com.edufelizardo.maissaudepublica.service;

import com.edufelizardo.maissaudepublica.model.Subarea;
import com.edufelizardo.maissaudepublica.model.exception.SubareaNaoEncontradoException;
import com.edufelizardo.maissaudepublica.repositories.SubareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubareaService {
    @Autowired
    private SubareaRepository subareaRepository;

    public SubareaService(SubareaRepository subareaRepository) {
        this.subareaRepository = subareaRepository;
    }

    public Iterable<Subarea> buscartodasSubarea() {
        Iterable<Subarea> subareas = subareaRepository.findAll();
        return subareas;
    }

    public Subarea buscarAreaId(Long id) throws SubareaNaoEncontradoException {
        Subarea subarea = subareaRepository.findById(id)
                .orElseThrow(()-> new SubareaNaoEncontradoException(id));
        return subarea;
    }

    public Subarea salvarNovaSubarea(Subarea subarea) {
        return subareaRepository.save(subarea);
    }
    
    public Subarea atualizarSubarea(Subarea subarea) throws SubareaNaoEncontradoException {
        buscarAreaId(subarea.getSubarea_id());
        return subareaRepository.save(subarea);
    }

    public void apagarSubarea(Long id) throws SubareaNaoEncontradoException {
        buscarAreaId(id);
        subareaRepository.deleteById(id);
    }
}
