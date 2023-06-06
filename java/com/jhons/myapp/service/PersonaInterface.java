package com.jhons.myapp.service;



import com.jhons.myapp.entity.Persona;

import java.util.List;

public interface PersonaInterface {

    List<Persona> obtenerPersonas();
    Persona obtenerPorId(Long id);

    void guardarPersona(Persona persona);

    void actualizarPersona(Persona persona);

    void eliminarPersona(Long id);
}
