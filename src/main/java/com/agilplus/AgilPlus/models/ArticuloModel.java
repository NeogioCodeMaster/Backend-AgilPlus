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
@Table(name = "articulos")
public class ArticuloModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String descripcion;
    @NotEmpty(message="El campo no puede quedar vacío")
    private int vr_compra;
    @NotEmpty(message="El campo no puede quedar vacío")
    private int vr_ventra;
    private int iva;
    @NotEmpty(message="El campo no puede quedar vacío")
    private boolean visibilidad; //Opción para mostrar o no un articulo al listar
    @NotEmpty(message="El campo no puede quedar vacío")
    private int fecha_act; //Ultima fecha de actualización

    @ManyToOne
    @JoinColumn(name="idUbicacion")
    UbicacionModel ubicacionModel;
    @ManyToOne
    @JoinColumn(name="idMarca")
    MarcaModel marcoModel;
    @ManyToOne
    @JoinColumn(name="idFamilia")
    FamiliaModel familiaModel;
}
