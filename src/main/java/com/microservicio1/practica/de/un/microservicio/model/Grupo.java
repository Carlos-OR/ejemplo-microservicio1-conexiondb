package com.microservicio1.practica.de.un.microservicio.model;

import javax.persistence.*;

@Entity
@Table(name = "grupo_usuarios")
public class Grupo {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrupo;

    @Column
    private String nombre;

    @Column
    private String rol;

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
