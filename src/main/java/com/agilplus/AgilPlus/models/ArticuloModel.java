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
    public int getVr_compra() {
        return vr_compra;
    }
    public void setVr_compra(int vr_compra) {
        this.vr_compra = vr_compra;
    }
    public int getVr_ventra() {
        return vr_ventra;
    }
    public void setVr_ventra(int vr_ventra) {
        this.vr_ventra = vr_ventra;
    }
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    public boolean isVisibilidad() {
        return visibilidad;
    }
    public void setVisibilidad(boolean visibilidad) {
        this.visibilidad = visibilidad;
    }
    public int getFecha_act() {
        return fecha_act;
    }
    public void setFecha_act(int fecha_act) {
        this.fecha_act = fecha_act;
    }
    public UbicacionModel getUbicacionModel() {
        return ubicacionModel;
    }
    public void setUbicacionModel(UbicacionModel ubicacionModel) {
        this.ubicacionModel = ubicacionModel;
    }
    public MarcaModel getMarcoModel() {
        return marcoModel;
    }
    public void setMarcoModel(MarcaModel marcoModel) {
        this.marcoModel = marcoModel;
    }
    public FamiliaModel getFamiliaModel() {
        return familiaModel;
    }
    public void setFamiliaModel(FamiliaModel familiaModel) {
        this.familiaModel = familiaModel;
    }

    
}
