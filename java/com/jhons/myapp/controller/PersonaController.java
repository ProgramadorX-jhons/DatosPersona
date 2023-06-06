package com.jhons.myapp.controller;

import com.jhons.myapp.entity.Persona;
import com.jhons.myapp.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    //llmaremos la clase servicio
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> obtenerTodos(){
        return personaService.obtenerPersonas();
    }
    @GetMapping("/{id}")
    public Persona obtenerPorId(Long id){
        return personaService.obtenerPorId(id);
    }

    @PostMapping
    public void guardarPersona(Persona persona){
        personaService.guardarPersona(persona);
    }

    @PutMapping("/{id}")
    public void actualizarPersona(@PathVariable Long id, @RequestBody Persona persona){
        Persona PersonaActual = personaService.obtenerPorId(id);

        if( PersonaActual!= null){
            PersonaActual.setIdPersona(persona.getIdPersona());
            PersonaActual.setTipoPersona(persona.getTipoPersona());
            PersonaActual.setNombre(persona.getNombre());
            PersonaActual.setTipoDocumento(persona.getTipoDocumento());
            PersonaActual.setDireccion(persona.getDireccion());
            PersonaActual.setTelefono(persona.getTelefono());
            PersonaActual.setEmail(persona.getEmail());
            personaService.actualizarPersona(PersonaActual);
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id){
        this.personaService.eliminarPersona(id);
    }

}
