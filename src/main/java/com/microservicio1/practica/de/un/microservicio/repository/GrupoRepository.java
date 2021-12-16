package com.microservicio1.practica.de.un.microservicio.repository;

import com.microservicio1.practica.de.un.microservicio.model.Grupo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {

    @Query("select g from Grupo g")
    List<Grupo> findAll();

}
