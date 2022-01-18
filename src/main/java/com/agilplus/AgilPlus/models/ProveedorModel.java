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
}
