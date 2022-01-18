package com.agilplus.AgilPlus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "barrios")
public class BarrioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name="idCiudad")
    CiudadModel ciudadModel;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public CiudadModel getCiudadModel() {
        return ciudadModel;
    }
    public void setCiudadModel(CiudadModel ciudadModel) {
        this.ciudadModel = ciudadModel;
    }
}
