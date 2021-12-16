package com.microservicio1.practica.de.un.microservicio.service.impl;

import com.microservicio1.practica.de.un.microservicio.model.Grupo;
import com.microservicio1.practica.de.un.microservicio.repository.GrupoRepository;
import com.microservicio1.practica.de.un.microservicio.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements GrupoService {

    @Autowired
    public GrupoRepository grupoRepository;

    @Override
    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    @Override
    public Grupo findById(int id) {
        return grupoRepository.findById(id).get();
    }
}
