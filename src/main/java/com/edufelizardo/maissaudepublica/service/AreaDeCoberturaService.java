package com.edufelizardo.maissaudepublica.service;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import com.edufelizardo.maissaudepublica.model.exception.areaDeCoberturaNaoEncontradoException;
import com.edufelizardo.maissaudepublica.repositories.AreaDeCoberturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaDeCoberturaService {
    @Autowired
    private AreaDeCoberturaRepository coberturaRepository;
    public Iterable<AreaDeCobertura> buscarTodasasareas() {
        Iterable<AreaDeCobertura> coberturas = coberturaRepository.findAll();
        return coberturas;
    }

    public AreaDeCobertura buscarId(Long id) throws areaDeCoberturaNaoEncontradoException {
        AreaDeCobertura cobertura = coberturaRepository.findById(id)
                .orElseThrow(() -> new areaDeCoberturaNaoEncontradoException(id));
        return cobertura;
    }

    public AreaDeCobertura salvarArea(AreaDeCobertura areaDeCobertura) {
        AreaDeCobertura cobertura = coberturaRepository.save(areaDeCobertura);
        return cobertura;
    }

    public AreaDeCobertura atualizarArea(AreaDeCobertura deCobertura) throws areaDeCoberturaNaoEncontradoException {
        buscarId(deCobertura.getArea_id());
        return coberturaRepository.save(deCobertura);
    }

    public void apagarAreaCobertura(Long id) throws areaDeCoberturaNaoEncontradoException {
        buscarId(id);
        coberturaRepository.deleteById(id);
    }
}
