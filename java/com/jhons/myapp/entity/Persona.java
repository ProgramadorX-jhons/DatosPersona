package com.jhons.myapp.entity;

import jakarta.persistence.*;

@Entity
public class Persona {

    //metodos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="idpersona")
    private String  idPersona;
    private String tipoPersona;
    private String nombre;
    private String tipoDocumento;
    private String direccion;
    private String telefono;
    private String email;

    //metodos}


    public Persona() {
    }

    public Persona(Long id, String idPersona, String tipoPersona, String nombre, String tipoDocumento, String direccion, String telefono, String email) {
        this.id = id;
        this.idPersona = idPersona;
        this.tipoPersona = tipoPersona;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
