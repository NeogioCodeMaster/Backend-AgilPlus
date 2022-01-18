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
@Table(name="proveedores")
public class ProveedorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String razonSocial; //Nombre de la Empresa.
    private int nit; //Numero de Identificación de la empresa o representante legal.
    private int digitoVerificacion; //Numero que complementa el Nit en caso que lo haya.
    private String asesor; //Nombre de la persona que atiende los pedidos.
    private String telefono;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String celular;
    private String email;
    private String pagWeb;
    @ManyToOne
    @JoinColumn(name="idBarrio")
    BarrioModel barrioModel;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public int getNit() {
        return nit;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }
    public int getDigitoVerificacion() {
        return digitoVerificacion;
    }
    public void setDigitoVerificacion(int digitoVerificacion) {
        this.digitoVerificacion = digitoVerificacion;
    }
    public String getAsesor() {
        return asesor;
    }
    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPagWeb() {
        return pagWeb;
    }
    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }
    public BarrioModel getBarrioModel() {
        return barrioModel;
    }
    public void setBarrioModel(BarrioModel barrioModel) {
        this.barrioModel = barrioModel;
    }

    
}
