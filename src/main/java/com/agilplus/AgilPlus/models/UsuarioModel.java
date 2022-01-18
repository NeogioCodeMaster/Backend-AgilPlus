package com.agilplus.AgilPlus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String nombres;
    @NotEmpty(message="El campo no puede quedar vacío")
    private int apellidos;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String nick;
    @NotEmpty(message="El campo no puede quedar vacío")
    private String password;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public int getApellidos() {
        return apellidos;
    }
    public void setApellidos(int apellidos) {
        this.apellidos = apellidos;
    }
    public String getNick() {
        return nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    /**
    *----
    Debe definirse la forma de control de roles para los usuarios.
    *----
    @ManyToOne
    @JoinColumn(name="idUbicacion")
    UbicacionModel ubicacionModel;
    */

    

}
