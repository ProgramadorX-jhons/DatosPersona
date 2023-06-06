package com.jhons.myapp.service;

import com.jhons.myapp.entity.Persona;
import com.jhons.myapp.respository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService implements PersonaInterface{

    //lamaremos una clase respository
    @Autowired
    private PersonaRepo personaRepo;

    @Override
    public List<Persona> obtenerPersonas() {
        return this.personaRepo.findAll();
    }

    @Override
    public  Persona obtenerPorId(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void guardarPersona(Persona persona) {
        this.personaRepo.save(persona);
    }

    @Override
    public void actualizarPersona(Persona persona) {
        this.personaRepo.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        this.personaRepo.deleteById(id);

    }
}
