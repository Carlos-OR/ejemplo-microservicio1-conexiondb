package com.microservicio1.practica.de.un.microservicio.controller;

import com.microservicio1.practica.de.un.microservicio.model.Grupo;
import com.microservicio1.practica.de.un.microservicio.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
 
@RestController
@RequestMapping("/api/ms1")
public class GrupoController {

    @Autowired
    public GrupoService grupoService;

    @GetMapping("/findAll")
    public List<Grupo> findAll() {
        return grupoService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Grupo findById(@PathVariable int id) {
        return grupoService.findById(id);
    }

}
