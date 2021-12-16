package com.microservicio1.practica.de.un.microservicio.service;

import com.microservicio1.practica.de.un.microservicio.model.Grupo;

import java.util.List;

public interface GrupoService {

    public List<Grupo> findAll();
    public Grupo findById(int id);

}
